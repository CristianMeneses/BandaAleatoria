/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Estudiantes
 */
public class Oboe implements Instrumento{

    @Override
    public void afinar() {
        System.out.println("Afinando Oboe");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Oboe");
    }
    
}
