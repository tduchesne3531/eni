package Exercice2.fr.eni.annuaire.dal.impl;

import Exercice2.fr.eni.annuaire.bo.Utilisateur;
import Exercice2.fr.eni.annuaire.dal.UtilisateurDao;
import Exercice2.fr.eni.annuaire.dal.tools.SerialiseurBinaire;
import Exercice2.fr.eni.annuaire.data.Utilisateurs;

public class UtilisateurBinaryImplDao implements UtilisateurDao {

    private Utilisateurs utilisateurs;

    public UtilisateurBinaryImplDao() {
        this.utilisateurs = SerialiseurBinaire.importerUtilisateursFromBinary("storage/utilisateurs.bin");
    }

    @Override
    public Utilisateur selectBy(String pseudo, String motPasse) {
        for (Utilisateur ele : utilisateurs.utilisateurs()) {
            if(ele.getPseudo().equals(pseudo) && ele.getMotPasse().equals(motPasse)) {
                return ele;
            }
        }
        return null;
    }
}
