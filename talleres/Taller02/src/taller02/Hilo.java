/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller02;

import java.util.List;

/**
 *
 * @author roger
 */
public class Hilo implements Runnable{
    
    // Atributos
    private int numeroCompetidores;
    private int cantidadTirosCompetidores;
    private List<String> nombreCompetidores;
    
    // Constructor
    public Hilo(){
    }
    
    public Hilo(String nombreCompetidor){
        this.nombreCompetidor = nombreCompetidor;
        Thread t = new Thread();
    }
    
    // Ejecucion del hilo
    @Override
    public void run(){
        
        for (int i = 0; i < this.numeroCompetidor; i++) {
            
        }
        
    }
    
    
}
