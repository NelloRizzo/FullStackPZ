package corso.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import corso.java.entities.LicenseEntity;

public interface LicenseRepository extends JpaRepository<LicenseEntity,Long>{

}
