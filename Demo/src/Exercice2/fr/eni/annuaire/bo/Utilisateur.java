package Exercice2.fr.eni.annuaire.bo;

public class Utilisateur {

    private int id;
    private String nom;
    private String pseudo;
    private String motPasse;

    public Utilisateur(int id, String nom, String pseudo, String motPasse) {
        this.id = id;
        this.nom = nom;
        this.pseudo = pseudo;
        this.motPasse = motPasse;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", pseudo='" + pseudo + '\'' +
                ", motPasse='" + motPasse + '\'' +
                '}';
    }
}
