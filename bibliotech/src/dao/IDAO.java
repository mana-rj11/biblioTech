package dao;

import java.util.List;
import java.util.Optional;

public class IDAO {
	
	/**
	 * Interface générique pour le CRUD (Create, Read, Update, Delete)
	 * @param <T> Le type de l'objet métier
	 * @param <K> Le type de l'identifiant (ID)
	 */
	public interface IDAO<T, K> {
		
		// Sauvergarder un objet 
		void create(T objet);
		
		// Trouver un objet par son ID (on utilise Optional pour éviter les erreurs null)
		Optional<T> findById(K id);
		
		// Récuperer tous les objets
		List<T> findAll();
		
		// mettre à jour les données
		void update(T objet);
		
		// supprimer 
		void delete(K id);
	}

}
