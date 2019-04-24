/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banda;

import Logica.Banda;

/**
 *
 * @author Estudiantes
 */
public class BandaAleatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banda b = new Banda();
        System.out.println("Musicos: " + b.getCantidad());
        b.crearBanda();
        System.out.println("Afinando la Banda: \n");
        b.afinarBanda();
        System.out.println("\nTocando la Banda: \n");
        b.tocarBanda();
        
    }

}
