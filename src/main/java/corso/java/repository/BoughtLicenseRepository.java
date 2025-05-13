package corso.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import corso.java.entities.BoughtLicenseEntity;

public interface BoughtLicenseRepository extends JpaRepository<BoughtLicenseEntity,Integer>{
public boolean findBySerialCode(String sc);
}
