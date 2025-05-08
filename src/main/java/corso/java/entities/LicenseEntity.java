package corso.java.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder(setterPrefix="with")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class LicenseEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	@ManyToOne
	Software_Entity software;
	@Column(length=50,nullable=false)
	int life;
	@Column(length=50,nullable=false)
	double price;
	@Column(length=50,nullable=false)
	String type;
}
