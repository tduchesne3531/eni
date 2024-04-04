package Exercice2.fr.eni.annuaire.dal;

import Exercice2.fr.eni.annuaire.bo.Utilisateur;

public interface UtilisateurDao {

     Utilisateur selectBy(String pseudo, String motPasse);


}
