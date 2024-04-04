package Exercice2.fr.eni.annuaire.bo;

public abstract class Contact{

    private long numero;
    private String nom;
    private String telephone;
    private String adresseMail;
    private boolean favoris;
    private Adresse adresse;


    public Contact(long numero, String nom, String telephone, String adresseMail, Adresse adresse) {
        this.numero = numero;
        this.nom = nom;
        this.telephone = telephone;
        this.adresseMail = adresseMail;
        this.adresse = adresse;
    }

    protected String getNature() {
        return getClass().getSimpleName();
    };

    @Override
    public String toString() {
        return "Contact{" +
                "numero=" + numero +
                ", nom='" + nom + '\'' +
                ", telephone='" + telephone + '\'' +
                ", adresseMail='" + adresseMail + '\'' +
                ", favoris=" + favoris +
                ", nature='" + getNature() + '\'' + // Affichage de la nature du contact ici
                ", adresse=" + adresse +
                '}';
    }


    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresseMail() {
        return adresseMail;
    }

    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
    }

    public boolean isFavoris() {
        return favoris;
    }

    public void setFavoris(boolean favoris) {
        this.favoris = favoris;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}
