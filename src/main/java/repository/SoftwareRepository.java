package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Software_Entity;

public interface SoftwareRepository extends JpaRepository<Software_Entity, Integer> {

	}
