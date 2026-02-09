package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import model.Livre;

public class LivreDAO implements IDAO<Livre, Long> {
	
	// on simule une base de données avec une liste 
	private List<Livre> baseDeDonnees = new ArrayList<>();
	
	@Override
	public void create(Livre livre) {
		baseDeDonnees.add(livre);
		System.out.println("Livre ajouté : " + livre.getTitre()); // lombok a crée getTitre();
	}
	
	@Override
	public Optional<Livre> findById(Long id) {
		// on cherche le livre qui a le bon ID
		return baseDeDonnees.stream()
				.filter(l -> l.getId().equals(id))
				.findFirst();
	}
	
	@Override 
	public List<Livre> findAll() {
		return baseDeDonnees;
	}
	
	@Override 
	public void update(Livre livreModifie) {
		// logique pour mettre à jour (recherche par ID et remplacement)
		findById(livreModifie.getId()).ifPresent(l -> {
			baseDeDonnees.remove(l);
			baseDeDonnees.add(livreModifie);
		});
	}
	
	@Override 
	public void delete(Long id) {
		// on retire de la liste tous les livres qui ont cet ID
		baseDeDonnees.removeIf(l -> l.getId().equals(id));
	}
}
