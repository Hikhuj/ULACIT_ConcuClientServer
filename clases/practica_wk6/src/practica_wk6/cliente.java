/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_wk6;

/**
 *
 * @author roger
 */
public class cliente extends Thread{
    
    private int cantidadClientes;


    public int getCantidadClientes() {
        return cantidadClientes;
    }

    public void setCantidadClientes(int cantidadClientes) {
        this.cantidadClientes = cantidadClientes;
    }
    
    @Override
    public void run(){
        
        for (int i = 0; i < 10; i++) {
            
        }
        
    }
    
}
