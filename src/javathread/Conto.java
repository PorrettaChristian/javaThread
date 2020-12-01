/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javathread;

/**
 *
 * @author porretta.christian
 */
public class Conto {
    private int totale;
    private int tasse = 100;
        
    public Conto(int totale) {
        this.totale=totale;
    }
    synchronized void versa(int somma){
        totale = totale+somma-tasse;
        System.out.println("conto : "+ totale);
    }
    synchronized int saldo(){
        return totale;
    }
}