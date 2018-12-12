/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aaguerrido.vista;

import java.util.Scanner;

/**
 *
 * @author Alfonso
 */
public class Triangulo {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        
        System.out.println(" ÁREA DE UN TRIÁNGULO");
        System.out.println("Ingrese la base:");
        double base=scn.nextDouble();
        System.out.println("Ingrese la altura:");
        double altura= scn.nextDouble();
        
        double area= base* altura/2;
        System.out.println("El área de un triángulo es:" +area);
        
        System.out.println("PERÍMETRO DE UN TRIÁNGULO");
        int perimetro;
        System.out.println("Ingrese el valor de su lado");
        int lado= scn.nextInt();
        perimetro= lado+lado+lado;
        System.out.println("El perímetro de un triágulo es:" + perimetro);
  
    }
    
}
