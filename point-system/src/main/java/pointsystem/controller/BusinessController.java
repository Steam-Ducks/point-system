package pointsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import pointsystem.dto.business.CreateBusinessDto;
import pointsystem.dto.business.UpdateBusinessDto;
import pointsystem.entity.Business;
import pointsystem.entity.User;
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

    @GetMapping("/{BusinessId}")
    public ResponseEntity<Business> getBusinessById(@PathVariable int BusinessId) {
        try {
            Optional<Business> business = businessService.getBusinessById(BusinessId);

            if (business.isPresent()) {
                return ResponseEntity.ok(business.get());
            }
            else
            {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), e);
        }
    }


    @GetMapping
    public ResponseEntity<List<Business>> getAllBusinesses() {
        try {
            List<Business> businesses = businessService.getAllBusinesses();
            return ResponseEntity.ok(businesses);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), e);
        }
    }

    @PutMapping("/{BusinessId}")
    public ResponseEntity<Void> updateBusinessById(@PathVariable int BusinessId, @RequestBody UpdateBusinessDto updateBusinessDto) {
        try {
            businessService.updatadeBusinessById(BusinessId, updateBusinessDto);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), e);
        }

    }

    @DeleteMapping("/{BusinessId}")
    public ResponseEntity<Void> deleteBusinessById(@PathVariable int BusinessId) {
        try {
            businessService.deleteBusinessById(BusinessId);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), e);
        }
    }
}