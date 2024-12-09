package TP1PACKAGE;

public class Etudiantt {
	
	//ATTRIBUTS
	private String CNE;
	private String Non;
	private double Moyenne;
	private String Décision;
	private int Classement;
	
	//CONSTRUCTEUR
	public Etudiantt(String cNE, String non, double moyenne, String décision) {
		super();
		CNE = cNE;
		Non = non;
		Moyenne = moyenne;
		Décision = décision;
	}

	
	//GETTERS ET SETTERS
	public String getCNE() {
		return CNE;
	}


	public void setCNE(String cNE) {
		CNE = cNE;
	}

	public String getNon() {
		return Non;
	}

	public void setNon(String non) {
		Non = non;
	}

	public double getMoyenne() {
		return Moyenne;
	}

	public void setMoyenne(double moyenne) {
		Moyenne = moyenne;
	}

	public String getDécision() {
		return Décision;
	}

	public void setDécision(String décision) {
		Décision = décision;
	}

	public int getClassement() {
		return Classement;
	}

	public void setClassement(int classement) {
		Classement = classement;
	}
	
	
	
	
	
}
