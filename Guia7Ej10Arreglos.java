/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia7ej10arreglos;

/**
 *
 * @author Ruben
 */
import java.util.Arrays;

public class Guia7Ej10Arreglos {

    public static void main(String[] args) {
        Double[] A = new Double[50];
        Double[] B = new Double[20];
        
                
        for (int i=0;i<A.length;i++)
  A[i] = (Double) (Math.random()*50)+1;
        
        for (int i=0;i<B.length;i++)
  B[i] = (Double) (Math.random()*20)+1;
        
   for  (int i=0; i<A.length; i++)
  System.out.print(" ["+A[i]+ "] "); 
  
   System.out.println(" ");
   
   for  (int i=0; i<B.length; i++)
  System.out.print(" ["+B[i]+ "] "); 
  
   System.out.println(" ");
   
   Arrays.sort(A);
   
  for  (int i=0; i<A.length; i++)
  System.out.print(" ["+A[i]+ "] "); 
  
  System.out.println(" ");
  
  
System.arraycopy(A, 0, B, 0, 10);  
Arrays.fill(B,10, 20, 0.5);

for  (int i=0; i<B.length; i++)
  System.out.print(" ["+B[i]+ "] "); 

    }
    
}
