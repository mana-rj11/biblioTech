package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Génère Getters, Setters, toString, equals, hashCode
@NoArgsConstructor // Génère un constructeur vide (obligatoire pour beaucoup de frameworks)
@AllArgsConstructor // Génère un constructeur avec tout les champs

public class Livre {
	private Long id;
	private String titre;
	private String auteur;
	private String isbn;
	private String categorie;
	private int anneeParution;
	private boolean disponible;
}
