package corso.java.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import corso.java.DTO.LicenseDTO;
import corso.java.entities.BoughtLicenseEntity;

public interface LicenseRepository extends JpaRepository<BoughtLicenseEntity,Long>{

}
