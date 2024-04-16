package listes;

import java.util.Objects;

public class Ville {
	 private String nom;
	    private int nbHabitants;

	    public Ville(String nom, int nbHabitants) {
	        this.nom = nom;
	        this.nbHabitants = nbHabitants;
	    }

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public int getNbHabitants() {
			return nbHabitants;
		}

		public void setNbHabitants(int nbHabitants) {
			this.nbHabitants = nbHabitants;
		}

		@Override
		public int hashCode() {
			return Objects.hash(nbHabitants, nom);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Ville other = (Ville) obj;
			return nbHabitants == other.nbHabitants && Objects.equals(nom, other.nom);
		}

}
