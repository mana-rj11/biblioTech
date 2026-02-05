package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class membre {
	private Long id;
	private String nom;
	private String prenom;
	private String email;
	private boolean estActif;
}
