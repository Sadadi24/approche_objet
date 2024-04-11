package fr.diginamic.banque.entites;

public class Compte {
	private String numCompte;
	private double solde;
	
	public Compte(String numCompte, double solde) {
		this.numCompte = numCompte;
		this.solde = solde;
	}
	


	@Override
	public String toString() {
		return "Compte numero " + numCompte + ", solde=" + solde ;
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
