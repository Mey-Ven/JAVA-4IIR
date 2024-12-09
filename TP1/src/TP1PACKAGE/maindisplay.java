package TP1PACKAGE;

import java.util.ArrayList;

public class maindisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//CREATION DES OBJETS
		Etudiantt e1= new Etudiantt ("T-2024","Ismail",16.5,"Admis");
		Etudiantt e2= new Etudiantt ("T-2023","Soumaya",7.15,"Redoublant");
		Etudiantt e3= new Etudiantt ("T-2022","Ali",10.3,"Admis");
		Etudiantt e4= new Etudiantt ("T-2021","Hamza",9.98,"Rattrapage");
		
		//CREATION DE LA LISTE
		ArrayList <Etudiantt> filiere_A = new ArrayList <Etudiantt> ();
		
		//STOCKAGE DES OBJETS DANS LA LISTE
		filiere_A.add(e1);
		filiere_A.add(e2);
		filiere_A.add(e3);
		filiere_A.add(e4);
		
		//BOUCLE POUR CALCULER LA MOYENNE GENERALE, LA MEILLEUR ET LA MAUVAISE NOTE
		double moyennegen = 0;
		double meilleurnote = 0;
		double mauvaisenote = 0;
		for(Etudiantt e: filiere_A) {
			moyennegen=moyennegen+e.getMoyenne();
			if(e.getMoyenne()<mauvaisenote) {
				mauvaisenote=e.getMoyenne(); }
			if(e.getMoyenne()>meilleurnote) {
				meilleurnote=e.getMoyenne(); }
		}
		
		System.out.println(moyennegen/filiere_A.size());
		
		
		//QUESTION 4
		ArrayList <Etudiantt> Admis_A = new ArrayList <Etudiantt>();
		ArrayList <Etudiantt> Redoublants_A = new ArrayList <Etudiantt>();
		ArrayList <Etudiantt> Rattrapage_A = new ArrayList <Etudiantt>();
		for (Etudiantt d: filiere_A) {
			if(d.getMoyenne()>10 || d.getMoyenne()==10 ) {
				Admis_A.add(d);
			}
			if(d.getMoyenne()>7 || d.getMoyenne()<10 || d.getMoyenne()==7  ) {
				Rattrapage_A.add(d);
			}
			if(d.getMoyenne()<7 ) {
				Redoublants_A.add(d);
			}
		}
		

		//QUESTION 5 //CHATGPT
		 public static void classerEtudiants(ArrayList<Etudiantt> filiere_A) {
			 Collections.sort(filiere_A, new Comparator<Etudiant>() {
		            public int compare(Etudiant e1, Etudiant e2) {
		                return Double.compare(e2.getMoyenne(), e1.getMoyenne());
		            }
		        });
		        for (int i = 0; i < filiere_A.size(); i++) {
		            filiere_A.get(i).setClassement(i + 1); 
		        }
		    }

		
	}

}
