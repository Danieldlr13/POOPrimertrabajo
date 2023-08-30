/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

/**
 *
 * @author Daniel
 */
import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la edad de Juan: ");
        int edadJuan = entrada.nextInt();
        
        int edadAlberto = 2 * edadJuan / 3;
        int edadAna = 4 * edadJuan / 3;
        int edadMadre = edadAlberto + edadJuan + edadAna;
        System.out.println("LAS EDADES SON:");
        System.out.println("ALBERTO: "+edadAlberto + " JUAN: "+edadJuan);
        System.out.println("ANA: "+edadAna +" MAMA: "+edadMadre);
        entrada.close();
    }
}