package Exercice2.fr.eni.annuaire.dal.tools;

import Exercice2.fr.eni.annuaire.data.Utilisateurs;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class SerialiseurJson
{

    public static void exporterUtilisateursToJson(String filename,Utilisateurs u) {
        // Try without resources
        try{
            File file = new File(filename);
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(file, u);
            System.out.println("L'objet est sérialisé avec succès 😊");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object importerUtilisateursFromJson(String filename) {
        // Try without resources
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            return  objectMapper.readValue(new File(filename), Utilisateurs.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
