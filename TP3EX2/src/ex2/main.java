package ex2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Set<Produit> produits = new HashSet<>();
	        produits.add(new Produit("Produit1", 120.0, "Electronique"));
	        produits.add(new Produit("Produit2", 80.0, "Maison"));
	        produits.add(new Produit("Produit3", 60.0, "Bureau"));
	        produits.add(new Produit("Produit4", 150.0, "Electronique"));
	        
	        Set<Produit> produitsModifies = 
	        		produits.stream()
	                .filter(p -> p.getPrix() <= 100) // Supprimez les produits dont le prix est supérieur à 100
	                .map(p -> new Produit(p.getNom(), p.getPrix()+(p.getPrix() * 0.1), p.getCategorie())) // Ajoutez un rabais de 10% à tous les prix des produits restants
	                .collect(Collectors.toSet()); // Stockez les produits modifiés dans un nouveau set 
	        
	        // Imprimez la liste finale des produits modifiés
	        produitsModifies.forEach(produit -> 
	            System.out.println("Nom: " + produit.getNom() + ", Prix: " + produit.getPrix() + ", Catégorie: " + produit.getCategorie()));
	    }
	}

}
