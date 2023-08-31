/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author Daniel
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double suma = 0;
        double x = 20;
        suma = (suma + x);
        double y = 40;
        x = (x + (int) Math.pow(y,2));
        suma = (suma + (x/y));
        System.out.println("El valor de la suma es: "+ suma);               
    }
    
}
