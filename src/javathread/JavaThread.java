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
public class JavaThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
//        Processo T1 = new Processo("T1");
//        Processo T2 = new Processo("T2");
//        T1.start();
        
//        T2.start();
//        ProcessoRunnable p1= new ProcessoRunnable("p1");
//        Thread t1 = new Thread (p1);
//        t1.start();
//        Thread.sleep(5000);
//        p1.stoppa();
        Conto conto = new Conto(2000);
        Sportello atm1 = new Sportello(conto,"mamma");
        Sportello atm2 = new Sportello(conto,"papà");
        Thread mamma = new Thread (atm1);
        Thread papa = new Thread (atm2);
        mamma.start();
        papa.start();
        int qualeThread; // 0 = mamma -- 1 = papà
        int cheOperazione;//0 = versa -- 1 = preleva
        int quanto;
        
        while(true){
            
            qualeThread = (int)(Math.random()*2);
            cheOperazione = (int)(Math.random()*2);
            quanto = (int)(Math.random()*501);
            
            if (qualeThread == 0){
                if (cheOperazione == 0){
                    atm1.versa(quanto);
                    System.out.println("mamma versa "+ quanto + "€");
                }else{
                    atm1.preleva(quanto);
                    System.out.println("mamma preleva "+ quanto + "€");
                }
            }else{
                if (cheOperazione == 0){
                    atm2.versa(quanto);
                    System.out.println("papà versa "+ quanto + "€");
                }else{
                    atm2.preleva(quanto);
                    System.out.println("papà preleva "+ quanto + "€");
                }
            }
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ex){
                System.out.println("eccezzione nel main");
            }
            
            if (qualeThread == 0){
                atm1.stampaSaldo();
            }else{
                atm2.stampaSaldo();
            }
            try{
                Thread.sleep(2000);
            }catch(InterruptedException ex){
                System.out.println("eccezzione nel main");
            }
            
        }
//        sport1.versa(500);
//        sport2.versa(800);
    }
    
}
