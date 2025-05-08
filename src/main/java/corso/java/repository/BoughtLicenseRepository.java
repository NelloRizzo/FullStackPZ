package corso.java.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import corso.java.DTO.LicenseDTO;
import corso.java.entities.BoughtLicenseEntity;
import corso.java.entities.LicenseEntity;

public interface BoughtLicenseRepository extends JpaRepository<BoughtLicenseEntity,Integer>{
public boolean findBySerialCode(String sc);
}
