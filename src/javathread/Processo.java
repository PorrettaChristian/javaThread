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
public class Processo extends Thread {
    String a;
    public Processo(String a) {
        this.a=a;
        this.start();
    }
    public void run(){
        for (;;) System.out.println(a);
    }
}
