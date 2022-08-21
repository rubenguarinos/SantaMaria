/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia7ej11date;

/**
 *
 * @author Ruben
 */
import java.util.Date;
import java.util.Scanner;

public class Guia7Ej11Date {

    public static void main(String[] args) {
        
int dia;
int mes;
int anio;
Scanner leer = new Scanner(System.in);
 System.out.println("Ingrese día:");
 //leer = new Scanner(System.in);
dia = leer.nextInt();
 System.out.println("Ingrese mes:");
 //leer = new Scanner(System.in);
 mes = leer.nextInt();
 System.out.println("Ingrese año:");
 //leer = new Scanner(System.in);
 anio = leer.nextInt();
 Date fecha = new Date((anio - 1900), (mes - 1), dia);
 System.out.println(fecha);
 Date fechaActual = new Date();
 System.out.println(fechaActual);
 int anioActual = fechaActual.getYear();
 System.out.println("Cantidad de años de diferencia: " + (anioActual - (anio -1900)));
 
    }

    public Guia7Ej11Date() {
    }

    
}
