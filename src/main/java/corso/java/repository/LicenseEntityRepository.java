package corso.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import corso.java.entities.LicenseEntity;

public interface LicenseEntityRepository extends JpaRepository<LicenseEntity, Integer> {

}
