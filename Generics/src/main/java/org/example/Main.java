package org.example;

import org.example.produs.ApaPlata;
import org.example.produs.Bax;
import org.example.produs.Ciocolata;
import org.example.produs.Produs;

public class Main {
    public static void main(String[] args) {
        System.out.println("Generics");

        Produs mars = new Ciocolata("Mars", 2);
        Produs bucovina = new ApaPlata("Bucovina", 3);

        Bax<Produs> cutieMars = new Bax<>(mars, 96);
        Bax<Produs> baxApa = new Bax<>(bucovina, 6);

        System.out.println("Pret total: " +
                (cutieMars.getPret() + baxApa.getPret()));
    }
}
