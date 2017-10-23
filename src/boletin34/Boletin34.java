/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin34;

/**
 *
 * @author pnocedalopez
 */
public class Boletin34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Restaurante pulpeiros=new Restaurante (5,2);
        pulpeiros.engadirPolbo(5);
        pulpeiros.engadirPatacas(1);
        System.out.println("Aforo= "+pulpeiros.calculaClientes());
    }
    
}
