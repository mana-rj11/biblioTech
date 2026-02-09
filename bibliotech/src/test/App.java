package test;

import dao.LivreDAO;
import model.Livre;

public class App {
	public static void main(String[] args) {
		// On crée notre "bibliothécaire" (le dao)
		LivreDAO biblio = new LivreDAO();
		
		// on crée un livre (lombok pour le costructeur)
		Livre l1 = new Livre(1L, "Le Petit Prince", "St-Exupéry", "123-ABC", "Conte", 1943, true);
		
		// on l'ajoute
		biblio.create(l1);
		
		// on verifie si on le retrouve
		System.out.println("Nombre de livres en stock :" + biblio.findAll().size());
	}
}

