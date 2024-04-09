package fr.diginamic.banque.entites;

public class Compte {
	private String numCompte;
	private double solde;
	
	public Compte(String numCompte, int solde) {
		super();
		this.numCompte = numCompte;
		this.solde = solde;
	}
	
	

	public String getNumCompte() {
		return numCompte;
	}

	
	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}
}
