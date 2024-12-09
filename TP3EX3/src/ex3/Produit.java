package ex3;

import java.util.Set;


// 1. Créez la classe Produit
class Produit {
    private String id;
    private String nom;
    private double prix;
    private String categorie;
    private int anneFabric;
    private Set<Integer> evaluations;

    public Produit(String id, String nom, double prix, String categorie, int anneFabric, Set<Integer> evaluations) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.categorie = categorie;
        this.anneFabric = anneFabric;
        this.evaluations = evaluations;
    }

   
    public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
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


	public int getAnneFabric() {
		return anneFabric;
	}


	public void setAnneFabric(int anneFabric) {
		this.anneFabric = anneFabric;
	}


	public Set<Integer> getEvaluations() {
		return evaluations;
	}


	public void setEvaluations(Set<Integer> evaluations) {
		this.evaluations = evaluations;
	}


	@Override
    public String toString() {
        return "Produit{id='" + id + "', nom='" + nom + "', prix=" + prix + ", categorie='" + categorie + "', anneFabric=" + anneFabric + ", evaluations=" + evaluations + '}';
    }
}