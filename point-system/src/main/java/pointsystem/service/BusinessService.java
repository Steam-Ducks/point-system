package pointsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pointsystem.dto.business.CreateBusinessDto;
import pointsystem.dto.business.UpdateBusinessDto;
import pointsystem.entity.Business;
import pointsystem.repository.BusinessRepository;
import java.util.List;
import java.util.Optional;


@Service
public class BusinessService {

    @Autowired
    private BusinessRepository businessRepository;

    public BusinessService(BusinessRepository businessRepository) {
        this.businessRepository = businessRepository;
    }

    public int createBusiness(CreateBusinessDto createBusinessDto) {
        Business business = new Business(
                0,
                createBusinessDto.name(),
                createBusinessDto.cnpj(),
                createBusinessDto.contact()
        );
        Business savedBusiness = businessRepository.save(business);

        return savedBusiness.getBusinessId();
    }

    public Optional<Business> getBusinessById(int businessId) {
        return businessRepository.findById(businessId);
    }

    public List<Business> getAllBusinesses() {
        return businessRepository.findAll();
    }

    public void updatadeBusinessById(int businessId, UpdateBusinessDto updateBusinessDto) {
        Optional<Business> businessEntity = businessRepository.findById(businessId);

        if (businessEntity.isPresent()) {
            Business business = businessEntity.get();
            if(updateBusinessDto.name() != null) {
                business.setName(updateBusinessDto.name());
            }

            if(updateBusinessDto.cnpj() != null) {
                business.setCnpj(updateBusinessDto.cnpj());
            }

            if(updateBusinessDto.contact() != null) {
                business.setContact(updateBusinessDto.contact());
            }
            businessRepository.save(business);
        }
    }

    public void deleteBusinessById(int businessId) {
        boolean exists = businessRepository.existsById(businessId);
        if (exists) {
            businessRepository.deleteById(businessId);
        }
    }

}