/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller02;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author roger
 */
public class Hilo implements Runnable{
    
    // Atributos
    private int cantidadTiros;
    private String nombreCompetidor;
    private int puntuacionMin = 1;
    private int puntuacionMax = 10;
    private int esperaMin = 300;
    private int esperaMax = 500;
    private int disparoMin = 20;
    private int disparoMax = 50;
    private int anotacion = 0;
    private int puntuacionTotal = 0;
    
    public Hilo(String nombreCompetidor, int cantidadTiros){
        this.nombreCompetidor = nombreCompetidor;
        this.cantidadTiros = cantidadTiros;
    }

    // Ejecucion del hilo
    @Override
    public void run(){
        
        for (int i = 0; i < this.cantidadTiros; i++) {
            
            int puntuacion;
            
            try{
                // Tirador Apunta
                Thread.sleep(generarTiempoApuntar());
                System.out.println("Competidor " + this.nombreCompetidor + " apunta");
                
                // Tirador Dispara
                Thread.sleep(generarTiempoDisparo());
                System.out.println("Competidor " + this.nombreCompetidor + " dispara");
                
                puntuacion = generarAnotacion();
                
                System.out.println("Score de " + this.nombreCompetidor + "= " + puntuacion);
                
                this.puntuacionTotal += puntuacion;
                
                
            }catch(InterruptedException ex){
                System.out.println("Error: " + ex);
            }
        }
        
        System.out.println("Puntuacion total de " + this.nombreCompetidor + "= " + this.puntuacionTotal);
        
    }
    
    // Metodos
    public int generarAnotacion(){
        return ThreadLocalRandom.current().nextInt(puntuacionMin, puntuacionMax + 1);
    }
    
    public int generarTiempoDisparo(){
        return ThreadLocalRandom.current().nextInt(disparoMin, disparoMax + 1);
    }
    
    public int generarTiempoApuntar(){
        return ThreadLocalRandom.current().nextInt(esperaMin, esperaMax + 1);
    }
    
}
