package org.example.produs;

/**
 * @author aionescu
 */
public class Bax<T extends Produs> {
    private T produs;
    private Integer numarProduseInBax;

    public Bax(T produs, Integer numar) {
        this.produs = produs;
        this.numarProduseInBax = numar;
    }

    public T getProdus() {
        return this.produs;
    }

    public Integer getPret() {
        return this.numarProduseInBax * this.produs.getPret();
    }
}
