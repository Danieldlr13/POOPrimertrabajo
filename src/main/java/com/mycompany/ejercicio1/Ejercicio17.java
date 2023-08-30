/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author Daniel
 */
import java.util.Scanner;

public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    System.out.println("Ingrese el radio del circulo: ");
    Double radio = entrada.nextDouble();
    Double rad = Math.pow (radio,2);
    Double area = Math.PI*rad;
    Double longitud = 2*Math.PI*radio;
    System.out.println("El area del circulo con radio "+ radio + " es: " + area);
    System.out.println("La longitud del circulo con radio "+ radio + " es: "+ longitud);
    entrada.close();
    }
    }