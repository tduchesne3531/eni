package Exercice1;

import Exercice1.Document;

import java.time.LocalDate;

public class Journal extends Document {

    private LocalDate dateParution;


    public Journal(String titre, LocalDate dateParution) {
        super(titre);
        this.dateParution = dateParution;
    }
}
