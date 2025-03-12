package pointsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pointsystem.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}

