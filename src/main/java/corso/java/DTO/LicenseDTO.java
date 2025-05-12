package corso.java.DTO;

import java.time.LocalDate;

import corso.java.entities.Software_Entity;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder(setterPrefix = "with")
public class LicenseDTO {
	int softwareId;
	int life;
	double price;
	String type;

}
