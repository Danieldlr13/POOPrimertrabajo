/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author Daniel
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int horastrabajadas = 48;
        double valorhora = 5000;
        double retencion = 12.5;
        double salarioBruto = horastrabajadas * valorhora;
        double retencionFuente = salarioBruto * (retencion/100);
        double salarioNeto = salarioBruto - retencionFuente;
        System.out.println("El salario bruto es: "+salarioBruto);
        System.out.println("La retencion en la fuente es: "+retencionFuente);
        System.out.println("El salario neto es: "+ salarioNeto);
    }
    
}
