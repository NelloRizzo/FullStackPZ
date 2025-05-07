package corso.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import corso.java.entities.Software_Entity;

public interface SoftwareRepository extends JpaRepository<Software_Entity, Integer> {

	}
