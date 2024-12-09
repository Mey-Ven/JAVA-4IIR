package TP2package;


import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//Création du Set
		Set <Chambre> setChambres = new LinkedHashSet<Chambre>();
		
		
		
		//Remplissage de la liste
		Chambre ch1= new Chambre (23,"Suit",10,true);
		Chambre ch2= new Chambre (18,"Normal",3,true);
		Chambre ch3= new Chambre (3,"Suit",7,true);
		Chambre ch4= new Chambre (9,"Normal",2,true);
		Chambre ch5= new Chambre (30,"Suit",8,true);
		setChambres.add(ch1);
		setChambres.add(ch2);
		setChambres.add(ch3);
		setChambres.add(ch4);
		setChambres.add(ch5);
		
		
		
	}
	
	
	
		//QUESTION1: Suppression d'une chambre
		public static boolean supprimerChambre(Set<Chambre> setChambres, int numChambre) {
			for (Chambre ch : setChambres){
				if (ch.numChambre == numChambre){
					if (ch.Disponible== false){
						setChambres.remove(ch);
						return true; 
					}else{
						return false;}
				}
			}
			return false;
	    
	    
	    
		//QUESTION2: Non disponible toutes les chambres ayant une capacité inférieure à 3 personnes   
		for (Chambre ch : setChambres) {
			if (ch.Capacite < 3){
				ch.Disponible=false;}
		}
		
		
		
		//QUESTION3: Écrivez des instructions pour créer une Map< ... , ... > contenant plusieurs sets de chambres
		Map <String, LinkedHashSet <Chambre>> mapChambre = new HashMap <String, LinkedHashSet <Chambre>> ();
		
		Set <String> setType = new LinkedHashSet <String> ();
		
		for(Chambre ch: setChambres){
			setType.add(ch.Type);}
		
		for(String type: setType) {
			LinkedHashSet <Chambre> setChType = new LinkedHashSet <Chambre> ();
			for(Chambre ch: setChambres){
				if(ch.Type.equals(type)){
					setChType.add(ch); }
			}
		mapChambre.put(type, setChType);
		}

			
			
	}

}
