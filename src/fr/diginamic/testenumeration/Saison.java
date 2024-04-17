package fr.diginamic.testenumeration;

public enum Saison {
	PRINTEMPS("Printemps", 1),
    ETE("Été", 2),
    AUTOMNE("Automne", 3),
    HIVER("Hiver", 4);

    private String libelle;
    private int numeroOrdre;
    
	private Saison(String libelle, int numeroOrdre) {
		this.libelle = libelle;
		this.numeroOrdre = numeroOrdre;
	}
	 public static Saison getSaisonByLibelle(String libelle) {
	        for (Saison saison : values()) {
	            if (saison.getLibelle().equalsIgnoreCase(libelle)) {
	                return saison;
	            }
	        }
	        return null;
	    }

	public String getLibelle() {
		return libelle;
	}

	public int getNumeroOrdre() {
		return numeroOrdre;
	}
}
