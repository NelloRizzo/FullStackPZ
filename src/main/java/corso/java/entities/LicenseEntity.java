package corso.java.entities;

import java.time.LocalDate;

import corso.java.models.LicenseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder(setterPrefix="with")
public class LicenseEntity {
	Long id;
	String serialCode;
	LocalDate date;
	LicenseModel model;
	//AziendaEntity company;
	
	
	




}
