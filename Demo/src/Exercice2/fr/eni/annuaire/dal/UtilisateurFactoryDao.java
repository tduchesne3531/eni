package Exercice2.fr.eni.annuaire.dal;

import Exercice2.fr.eni.annuaire.dal.impl.UtilisateurBinaryImplDao;
import Exercice2.fr.eni.annuaire.dal.impl.UtilisateurJsonImplDao;

public abstract class UtilisateurFactoryDao {
    public static UtilisateurDao createInstance(String type) {
        if(type.equalsIgnoreCase("Binary")) return new UtilisateurBinaryImplDao();
        if(type.equalsIgnoreCase("JSON")) return new UtilisateurJsonImplDao();
        return null;
    }
}
