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
public class ProcessoRunnable implements Runnable {
    
    private String s;
    private boolean stop;
    public ProcessoRunnable(String s) {
        this.s=s;
        stop = false;
    }
    
    public void run(){
        while(!stop){
            System.out.println(s);
        }
    }
    public void stoppa (){
        stop = true;
    }
}
