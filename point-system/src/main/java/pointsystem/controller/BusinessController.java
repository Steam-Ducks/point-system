package pointsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pointsystem.dto.business.CreateBusinessDto;
import pointsystem.dto.business.UpdateBusinessDto;
import pointsystem.entity.Business;
import pointsystem.service.BusinessService;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/businesses")
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    public BusinessController(BusinessService businessService) {
        this.businessService = businessService;
    }

    @PostMapping
    public ResponseEntity<Integer> createBusiness(@RequestBody CreateBusinessDto createBusinessDto) {
        int businessId = businessService.createBusiness(createBusinessDto);
        return ResponseEntity.created(URI.create("/api/businesses/" + businessId)).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Business> getBusinessById(@PathVariable int id) {
        Optional<Business> business = businessService.getBusinessById(id);
        return business.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Business>> getAllBusinesses() {
        List<Business> businesses = businessService.getAllBusinesses();
        return ResponseEntity.ok(businesses);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateBusinessById(@PathVariable int id, @RequestBody UpdateBusinessDto updateBusinessDto) {
        businessService.updatadeBusinessById(id, updateBusinessDto);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBusinessById(@PathVariable int id) {
        businessService.deleteBusinessById(id);
        return ResponseEntity.noContent().build();
    }
}