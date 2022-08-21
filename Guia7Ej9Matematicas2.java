/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia7ej9matematicas2;

/**
 *
 * @author Ruben
 */
import entidad.Matematica2;

public class Guia7Ej9Matematicas2 {

    public static void main(String[] args) {
        Matematica2 Matematicas = new Matematica2();
        Matematicas.setNum1(Math.random() * 10);
        Matematicas.setNum2(Math.random() * 10);
        System.out.println("Número 1: " + Matematicas.getNum1());
        System.out.println("Número 2: " + Matematicas.getNum2());
        
        Matematicas.devolvermayor();
        //System.out.println("Número mayor: " + Math.max(Matematicas.getNum1(),Matematicas.getNum2()));
        Matematicas.calcularPotencia();
        Matematicas.calculaRaiz();
        
    }
}
