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
public class Bajo implements Instrumento{
     @Override
    public void afinar() {
        System.out.println("Afinando Bajo");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Bajo");
    }
}
