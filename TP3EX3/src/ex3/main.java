package ex3;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.stream.Collectors;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 2. Créer des objets Produit pour le test
        Set<Produit> produits = new HashSet<>();
        produits.add(new Produit("12", "Laptop", 1500.0, "Electronique", 2022, Set.of(3, 4, 5)));
        produits.add(new Produit("13", "Livre", 50.0, "Librairie", 2021, Set.of(2, 1, 0, 0, 0, 0, 0)));
        produits.add(new Produit("14", "Canapé", 2500.0, "Meubles", 2023, Set.of(3, 4)));
        produits.add(new Produit("15", "Téléphone", 2000.0, "Electronique", 2020, Set.of(5, 4)));
        produits.add(new Produit("16", "Cahier", 20.0, "Librairie", 2023, Set.of(0, 0, 0, 0, 0, 0, 0)));

        
        // Stream 1 : 
        Set<Produit> stream1 = produits.stream()
                .filter(p -> p.getAnneFabric() > 2021)
                .peek(p -> p.setId(p.getCategorie().substring(0, 3).toUpperCase() + "-" + p.getId())) // ChatGpt peek
                .collect(Collectors.toSet());
        
        System.out.println("Stream 1:");
        stream1.forEach(System.out::println);

        // Stream 2 : 
        Set<Produit> stream2 = produits.stream()
                .filter(p -> !(p.getCategorie().equals("Electronique") && p.getPrix() > 2000))
                .peek(p -> p.setPrix(p.getPrix() * 0.85)) // ChatGpt peek
                .filter(p -> p.getCategorie().equals("Librairie"))
                .collect(Collectors.toSet());

        System.out.println("\nStream 2:");
        stream2.forEach(System.out::println);

        // Stream 3 : 
        LinkedList<Produit> stream3 = produits.stream()
                .filter(p -> !p.getCategorie().equals("Meubles"))
                .peek(p -> p.setPrix(p.getPrix() * 0.9))
                .filter(p -> p.getEvaluations()) // ????
                .peek(p -> p.setId(p.getId() + "ME"))
                .filter(p -> p.getEvaluations().stream().filter(e -> e == 0).count() >= 7)
                .collect(Collectors.toList());

        System.out.println("\nStream 3:");
        stream3.forEach(System.out::println);
	}

}
