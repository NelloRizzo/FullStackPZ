package corso.java.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder (setterPrefix = "with")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Software_Entity {
	@Id
	@GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String version;

}
