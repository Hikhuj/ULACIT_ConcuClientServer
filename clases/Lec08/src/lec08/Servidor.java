/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec08;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Servidor extends Observable implements Runnable{

    private int puerto;

    public Servidor(int puerto) {
        this.puerto = puerto;
    }
    
    
    
    @Override
    public void run() {
        ServerSocket sc = null;
        Socket s = null;
        DataInputStream in;
        try {
            sc = new ServerSocket(puerto);
            System.out.println("Servirdor arriba...");
            while(true){
                s = sc.accept();
                System.out.println("Cliente conectado");
                in = new DataInputStream(s.getInputStream());
                String mensaje = in.readUTF();
                System.out.println(mensaje);
                
                // vvv Clases heredadas por Observable.
                // Setear cambio
                this.setChanged();
                // Notificar al observador, el "mensaje" es lo que me interesa.
                this.notifyObservers(mensaje);
                // limpio el cambio.
                this.clearChanged();
                
                s.close();
                System.out.println("Cliente desconectado");
                
            }
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
