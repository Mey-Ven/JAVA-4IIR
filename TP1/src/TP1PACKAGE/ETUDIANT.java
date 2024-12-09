package TP1PACKAGE;
	//CLASS ETUDIANT 
public class ETUDIANT {
	
	//ATTRIBUTS
	private String cne;
	private String nom;
	private double moyenne;
	private String decision;
	private int calssement;
	
	// CONSTRUCTEUR QUI INITIALISE LES ATTRIBUTS CNE ET NOM
	public ETUDIANT(String cn,String no, double mo) {
		this.cne=cn;
		this.nom=no;
		this.moyenne=mo;
	}
	
	

	@Override
	public String toString() {
		return "ETUDIANT [cne=" + cne + ", nom=" + nom + ", moyenne=" + moyenne + ", decision=" + decision
				+ ", calssement=" + calssement + ", getCne()=" + getCne() + ", getNom()=" + getNom() + ", getMoyenne()="
				+ getMoyenne() + ", getDecision()=" + getDecision() + ", getCalssement()=" + getCalssement()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}



	// GETTERS AND SETTERS
	public String getCne() {
		return cne;
	}

	public void setCne(String cne) {
		this.cne = cne;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(double moyenne) {
		this.moyenne = moyenne;
	}

	public String getDecision() {
		return decision;
	}

	public void setDecision(String decision) {
		this.decision = decision;
	}

	public int getCalssement() {
		return calssement;
	}

	public void setCalssement(int calssement) {
		this.calssement = calssement;
	}

	public Etudiant[] getFiliere_A() {
		return filiere_A;
	}

	public void setFiliere_A(Etudiant[] filiere_A) {
		this.filiere_A = filiere_A;
	}
	
	


    
	
	
}
