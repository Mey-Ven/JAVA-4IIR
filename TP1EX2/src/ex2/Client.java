package ex2;

public class Client {
    private String nom;
    private String email;
    
    // Constructeur, getters et setters
	public Client(String nom, String email) {
		super();
		this.nom = nom;
		this.email = email;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
    
 
    
}