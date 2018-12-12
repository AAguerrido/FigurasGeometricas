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
public class Circulo {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
       double pi= 3.14;
       
        System.out.println("Ingrese el radio:");
        double radio= scn.nextDouble();
        
        double diametro= 2*radio;
        double perimetro= 2*radio*pi;
        double area= pi*Math.pow(radio, 2);
        
        System.out.println("diamtero:" +diametro);
        System.out.println("perimetro:" +perimetro);
        System.out.println("area:" +area);
        
        
        
        
        
    }
    
}
