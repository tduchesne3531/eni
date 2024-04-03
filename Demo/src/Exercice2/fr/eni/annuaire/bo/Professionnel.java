package Exercice2.fr.eni.annuaire.bo;

import java.time.LocalDate;

public class Professionnel extends Contact {

    private String nomEntreprise;

    public Professionnel(long numero, String nom, String telephone, String adresseMail, Adresse adresse, String nomEntreprise) {
        super(numero, nom, telephone, adresseMail, adresse);
    }

    @Override
    protected String getNature() {
        return super.getNature();
    }

    @Override
    public String toString() {
        return "Professionnel{" +
                "nomEntreprise='" + nomEntreprise + '\'' +
                "} " + super.toString() + getNature();
    }
}
