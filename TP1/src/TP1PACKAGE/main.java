package TP1PACKAGE;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// ALLOCATION MEMOIR POUR UN ETUDIANT
		ETUDIANT e1=new ETUDIANT("111","Amine",15.3);
		ETUDIANT e2=new ETUDIANT("222","Mohammed",8.43);
		ETUDIANT e3=new ETUDIANT("333", "Ismail",10.5);
		ETUDIANT e4=new ETUDIANT("444", "Ahmadane",2.5);
		
		
		
		// DECLARATOION DU TABLEAU FILIERE_A QUI STOCKE LES OBJETS DE e1 ET e2 ET e3 ET e4
		ETUDIANT [] filiereA = new ETUDIANT[6];
		filiereA[0]=e1;
		filiereA[1]=e2;
		filiereA[2]=e3;
		filiereA[3]=e4;

		
		
        // Création des tableaux admisA, redoublantsA et rattrapageA
		ETUDIANT[] admisA = new ETUDIANT[filiereA.length];
		ETUDIANT[] redoublantsA = new ETUDIANT[filiereA.length];
		ETUDIANT[] rattrapageA = new ETUDIANT[filiereA.length];

        
        
        // Remplissage des tableaux en fonction des moyennes des étudiants
        int indexAdmis = 0;
        int indexRedoublants = 0;
        int indexRattrapage = 0;

        for (ETUDIANT etudiant : filiereA ) {
            if (etudiant != null) {
                if (etudiant.getMoyenne() >= 10) {
                    admisA[indexAdmis++] = etudiant;
                } else if (etudiant.getMoyenne() < 7) {
                    redoublantsA[indexRedoublants++] = etudiant;
                } else {
                    rattrapageA[indexRattrapage++] = etudiant;
                }
            }
        }
        
        
        
        // Affichage de tableaux des admis
        System.out.println("Admis:");
        for (int i = 0; i <indexAdmis; i++) {
            System.out.println(admisA[i].getNom() + " - " + admisA[i].getMoyenne());
        }

        System.out.println("\nRattrapage:");
        for (int i = 0; i < indexRattrapage; i++) {
            System.out.println(rattrapageA[i].getNom() + " - " + rattrapageA[i].getMoyenne());
        }

        System.out.println("\nEchoue:");
        for (int i = 0; i < indexRedoublants; i++) {
            System.out.println(redoublantsA[i].getNom() + " - " + redoublantsA[i].getMoyenne());
        }
        
        
        
        
        
        
	}
}			


