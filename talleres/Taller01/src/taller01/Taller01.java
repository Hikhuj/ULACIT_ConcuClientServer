/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller01;

import java.util.Calendar;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Taller01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        *
        *   Taller 01 para el Curso de Programacion Concurrente Cliente-Servidor
        *
        */
        
        Calendar today = Calendar.getInstance();
        today.set(Calendar.HOUR_OF_DAY, 0);
        
        System.out.println("Fecha de hoy: " + today.getTime());
        
        
    }
    
}
