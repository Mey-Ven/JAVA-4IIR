package ex2;

public class Produit {
    private String nom;
    private double prix;
    private String categorie;

    public Produit(String nom, double prix, String categorie) {
        this.nom = nom;
        this.prix = prix;
        this.categorie = categorie;
    }

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
}