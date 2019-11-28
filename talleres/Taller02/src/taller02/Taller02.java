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
        
        // Atributos
        Hilo hilo1;
        int cantidadCompetidores;
        
        // Cantidad de competidores
        cantidadCompetidores = 10;
        
        String[] competidoresArray = {"A","B","C","D","E","F","G","H","I","J"};
        
        
        for (int i = 0; i < 10; i++) {
            hilo1 = new Hilo(competidoresArray[i]);

        }
        
    }
    
}
