package corso.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import corso.java.entities.Azienda_Entity;

@Repository
public interface AziendaRepository extends JpaRepository<Azienda_Entity, Integer>{
	
}