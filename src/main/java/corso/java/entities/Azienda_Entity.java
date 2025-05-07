package corso.java.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "aziende")
@Builder(setterPrefix = "with")
public class Azienda_Entity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name = "nome",nullable = false)
	private String nome;
	@Column(name = "partita_iva", nullable = false)
	private String partitaIva;

}

