package Exercice2.fr.eni.annuaire.dal.tools;

import Exercice2.fr.eni.annuaire.data.Utilisateurs;
import java.io.*;

public class SerialiseurBinaire {

    private static void serialiser(String filename,Object o) {
        // Try with resources
        try(
                FileOutputStream file = new FileOutputStream(filename);
                ObjectOutputStream out = new ObjectOutputStream(file);
        ){
            out.writeObject(o);
            System.out.println("L'objet est sérialisé avec succès 😊");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private static Object deserialiser(String filename) {
        // Try with resources
        try(
                FileInputStream file = new FileInputStream(filename);
                ObjectInputStream out = new ObjectInputStream(file);
        ){
            return out.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void exporterUtilisateursToBinary(String filename, Utilisateurs usersContainer) {
        serialiser(filename,usersContainer);
    }

    public static Utilisateurs importerUtilisateursFromBinary(String filname) {
        return (Utilisateurs) deserialiser(filname);
    }
}
