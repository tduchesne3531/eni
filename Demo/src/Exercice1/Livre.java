package Exercice1;

import Exercice1.Document;
import Exercice1.Empruntable;

public class Livre extends Document implements Empruntable {

    private int nbPages;


    public Livre(String titre, int nbPages) {
        super(titre);
        this.nbPages = nbPages;
    }

    @Override
    public String toString() {
        return "Exercice1.Livre{" +
                "nbPages=" + nbPages +
                ", titre='" + titre + '\'' +
                '}';
    }
}
