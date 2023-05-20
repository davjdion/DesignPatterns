package org.example.produs;

public class Ciocolata implements Produs {

    private String nume;
    private Integer pret;

    public Ciocolata(String nume, Integer pret) {
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public Integer getPret() {
        return pret;
    }

    @Override
    public String getNume() {
        return nume;
    }
}
