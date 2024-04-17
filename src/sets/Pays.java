package sets;

public class Pays {
    private String nom;
    private int nombreHabitants;
    private double PIBParHabitant;

    public Pays(String nom, int nombreHabitants, double PIBParHabitant) {
        this.nom = nom;
        this.nombreHabitants = nombreHabitants;
        this.PIBParHabitant = PIBParHabitant;
    }

    public String getNom() {
        return nom;
    }

    public int getNombreHabitants() {
        return nombreHabitants;
    }

    public double getPIBParHabitant() {
        return PIBParHabitant;
    }

    public double getPIBTotal() {
        return nombreHabitants * PIBParHabitant;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
