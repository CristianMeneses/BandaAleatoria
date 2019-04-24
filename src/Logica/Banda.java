/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author Estudiantes
 */
public class Banda {

    ArrayList<Musico> musicos = new ArrayList<Musico>();
    Random r = new Random();
    private int cantidad = r.nextInt(20);

    public int getCantidad() {
        return cantidad;
    }

    public void crearBanda() {
        for (int i = 0; i < cantidad; i++) {
            musicos.add(new Musico());
        }
        for (Iterator<Musico> iterator = musicos.iterator(); iterator.hasNext();) {
            Musico next = iterator.next();
            next.asignarInstrumento(this.generarInstrumento(r.nextInt(8)));
        }
    }

    public void afinarBanda() {
        for (Iterator<Musico> iterator = musicos.iterator(); iterator.hasNext();) {
            Musico next = iterator.next();
            next.afinarInstrumento();
        }
    }

    public void tocarBanda() {
        for (Iterator<Musico> iterator = musicos.iterator(); iterator.hasNext();) {
            Musico next = iterator.next();
            next.tocarInstrumento();
        }
    }

    private Instrumento generarInstrumento(int aleatorio) {
        switch (aleatorio) {
            case 1:
                return new Guitarra();
            case 2:
                return new Guacharaca();
            case 3:
                return new Oboe();
            case 4:
                return new Piano();
            case 5:
                return new Bajo();
            case 6:
                return new Sintetizador();
            case 7:
                return new FlautaDulce();
            default:
                return new Violin();
        }
    }
}
