/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller02;

/**
 *
 * @author rogerjoseulaterivera
 */
public class HiloSuma extends Thread{
    
    private int multiplicador = 2;
    private int numero;
    private int [] numeros;
    
    public HiloSuma(int[] numeros, int numero){
        super("Hilo");
        this.numeros = numeros;
        this.numero = numero;
    }
    
    @Override
    public void run(){
        
        try{
            
            Thread.sleep((long) (Math.random() * 5000));
            
        }catch(InterruptedException ex){
            System.out.println("Error: " + ex);
        }
        
        this.numeros[this.numero] = numero * multiplicador;
        
    }

    public int getNumero() {
        return numero;
    }
    
}
