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
    private int puntuacion;
    Thread t;
    
    
    // Constructor
    public Hilo(){
        t = new Thread(this,"Hilo 1");
        t.start();
    }
    
    public Hilo(String nombreCompetidor){
        this.nombreCompetidor = nombreCompetidor;
        t = new Thread("Hilo 1");
        t.start();
    }
    
    // Ejecucion del hilo
    @Override
    public void run(){
        
        try{
            
            // Iteracion que permite a jugador disparar 10 tiros
            for (int i = 0; i < cantidadTiros; i++) {
                // JUGADOR APUNTA
                System.out.println("Competidor " + getNombreCompetidor() + " apunta.");
                Thread.sleep(generarTiempoApuntar());
                
                // JUGADOR DISPARA Y ANOTA
                anotacion = generarAnotacion();
                System.out.println("Competidor " + getNombreCompetidor() + " dispara y anota: " + anotacion);
                Thread.sleep(generarTiempoDisparo());
                
                anotacion = anotacion + 1;
                
            }
            
        }catch(InterruptedException e){
            System.out.println("Error: " + e);
        }
        
    }
    
    // Metodos
    public void setNombreCompetidor(String nombreCompetidor){
        this.nombreCompetidor = nombreCompetidor;
    }
    
    public String getNombreCompetidor(){
        return this.nombreCompetidor;
    }
    
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
