package corso.java.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
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
public class BoughtLicenseEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	@Column(length=50,nullable=false)
	String serialCode;
	@Temporal(TemporalType.DATE)
	LocalDate date;
	@ManyToOne
	LicenseEntity model;
	@ManyToOne
	Azienda_Entity company;
	
	
	




}
