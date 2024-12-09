package ex2;

public class Chambre {
    private int numChambre;
    private String type;
    private int capacite;
    private boolean disponible;

    public Chambre(int numChambre, String type, int capacite, boolean disponible) {
        this.numChambre = numChambre;
        this.type = type;
        this.capacite = capacite;
        this.disponible = disponible;
    }

    // Getters et setters
	public int getNumChambre() {
		return numChambre;
	}

	public void setNumChambre(int numChambre) {
		this.numChambre = numChambre;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

    
}