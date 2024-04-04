package Exercice2.fr.eni.annuaire.data;

import Exercice2.fr.eni.annuaire.bo.Utilisateur;

import java.io.Serializable;
import java.util.List;

public record Utilisateurs(List<Utilisateur> utilisateurs) implements Serializable {


}
