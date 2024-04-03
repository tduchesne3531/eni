package Exercice1;

import java.util.*;

public class Client {

    private String nom;
    private String prenom;
    private int age;
    private List<Empruntable> emprunts = new ArrayList<Empruntable>();

    public Client(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public void emprunter(Empruntable e) throws Exception {
        if(emprunts.size()>= 3) {
            throw new Exception("Vous avez plus de 3 emprunts !");
        }
        emprunts.add(e);
    }

    public void rendre(Empruntable e) {
        emprunts.remove(e);
    }

    @Override
    public String toString() {
        return "Exercice1.Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", emprunts=" + emprunts +
                '}';
    }
}
