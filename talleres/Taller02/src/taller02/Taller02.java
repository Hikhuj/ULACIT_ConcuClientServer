/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller02;

/**
 *
 * @author roger
 */
public class Taller02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        *
        *
        *   TALLLER #2
        *
        *
        */
        
        
        // Cantidad de competidores
        int cantidadTiros = 10;
        
        // Nombres de competidores
        String[] competidoresArray = {"A","B","C","D","E","F","G","H","I","J"};
        
        // Enviar datos de hilo
        Hilo hilo1;
        
        // Iteracion que reciba cada nombre de competidor
        for (int i = 0; i < competidoresArray.length; i++) {
            
            hilo1 = new Hilo(competidoresArray[i], cantidadTiros);
            Thread thread = new Thread(hilo1);
            
            thread.start();
            
        }

        
        // Suma sencilla
        // 
        /*
        HiloSuma hilosSumas;
        
        Thread[] threads = new Thread[5];
        
        int[] numeros = new int[5];
        
        for (int i = 0; i < 5; i++) {
            
            // Inicializacion de Instancia de Hilo
            hilosSumas = new HiloSuma(numeros,i);
            
            threads[i] = new Thread(hilosSumas);
            
            threads[i].start();
            
        }
        
        for (int i = 0; i < 5; i++) {
            
            try{
                threads[i].join();
            }catch(InterruptedException ex){
                System.out.println("Error: " + ex);
            }
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }
        */
        
        
    }
    
}
