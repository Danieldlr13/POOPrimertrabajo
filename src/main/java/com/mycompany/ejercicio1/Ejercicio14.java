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

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int doble = scanner.nextInt();
        

        int cuadrado = (int) Math.pow(doble, 2);
        int cubo = (int) Math.pow(doble, 3);

        System.out.println("El cuadrado de " + doble + " es: " + cuadrado);
        System.out.println("El cubo de " + doble + "es: " + cubo);
    }
    
}

