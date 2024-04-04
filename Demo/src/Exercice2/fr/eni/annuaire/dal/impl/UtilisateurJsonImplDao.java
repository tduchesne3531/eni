package Exercice2.fr.eni.annuaire.dal.impl;

import Exercice2.fr.eni.annuaire.bo.Utilisateur;
import Exercice2.fr.eni.annuaire.dal.UtilisateurDao;

public class UtilisateurJsonImplDao implements UtilisateurDao {
    @Override
    public Utilisateur selectBy(String pseudo, String motPasse) {
        System.out.println("JSON : Utilisateur trouvé");
        return null;
    }
}
