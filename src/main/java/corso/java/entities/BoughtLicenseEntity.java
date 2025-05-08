package corso.java.entities;

import java.time.LocalDate;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder(setterPrefix="with")
public class BoughtLicenseEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	@Column(length=50,nullable=false)
	String serialCode;
	@Temporal(TemporalType.DATE)
	LocalDate date;
	@ManyToOne(fetch=FetchType.EAGER)
	LicenseEntity model;
	@ManyToOne(fetch = FetchType.EAGER)
	Azienda_Entity company;
	
	
	




}
