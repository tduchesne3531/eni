public class Livre extends Document implements Empruntable{

    private int nbPages;


    public Livre(String titre, int nbPages) {
        super(titre);
        this.nbPages = nbPages;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "nbPages=" + nbPages +
                ", titre='" + titre + '\'' +
                '}';
    }
}
