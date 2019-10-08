/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec04;

/**
 *
 * @author roger
 */
public class Lec04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Colecciones c = new Colecciones();
        
        System.out.println("-----------------------------------------------");
        c.probarSet();
        System.out.println("-----------------------------------------------");
        c.probarList();
        System.out.println("-----------------------------------------------");
        c.probarOrdenamientoSet();
        System.out.println("-----------------------------------------------");
        c.probarOrdenamientoSetComparador();
        
    }
    
}
