package Exercice2.fr.eni.annuaire.bo;

import java.time.LocalDate;

public class Personnel extends Contact {


    private LocalDate dateAnniversaire;


    public Personnel(long numero, String nom, String telephone, String adresseMail, Adresse adresse, LocalDate dateAnniversaire) {
        super(numero, nom, telephone, adresseMail, adresse);
    }

    @Override
    protected String getNature() {
        return super.getNature();
    }

    @Override
    public String toString() {
        return "Personnel{" +
                "dateAnniversaire=" + dateAnniversaire +
                "} " + super.toString() + getNature();
    }
}
