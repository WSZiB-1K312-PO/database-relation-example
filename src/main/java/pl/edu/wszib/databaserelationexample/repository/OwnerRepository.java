package pl.edu.wszib.databaserelationexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.wszib.databaserelationexample.repository.entity.OwnerEntity;

public interface OwnerRepository extends JpaRepository<OwnerEntity, Long> {
}
