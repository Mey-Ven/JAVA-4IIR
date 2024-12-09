package ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
         // Liste des mois de l'année
		 List<String> mois = new ArrayList<>();
		 mois.add("janvier");
		 mois.add("février");
		 mois.add("mars");
		 mois.add("avril");
		 mois.add("mai");
		 mois.add("juin");
		 mois.add("juillet");
		 mois.add("août");
		 mois.add("septembre");
		 mois.add("octobre");
		 mois.add("novembre");
		 mois.add("décembre");
		 
		 
		 // Initialisation du Stream
		 List<String> moisModifies = mois.stream()
				 
				    // 1. Filtrer : Supprimez les mois qui contiennent la lettre 'a':
		            .filter(m -> !m.contains("a"))
		            
				 	// 2. Mapper : Convertissez tous les mois restants en majuscules:
		            .map(e -> e.toUpperCase())
		            
		            // 3. Collecter : Stockez les mois modifiés dans une nouvelle liste:
		            .collect(Collectors.toList());
		 
		 			// 4. Afficher : Imprimez la liste finale des mois modifiés:
		        	System.out.println(moisModifies);
		
	}

}
