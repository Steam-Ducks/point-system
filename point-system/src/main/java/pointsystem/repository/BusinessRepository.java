package pointsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pointsystem.entity.Business;

public interface BusinessRepository extends JpaRepository<Business, Integer> {
}