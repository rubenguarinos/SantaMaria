/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author Ruben
 */
public class Matematica2 {
  Double Num1;
  Double Num2;

    public Matematica2() {
    }

    public Matematica2(Double Num1, Double Num2) {
        this.Num1 = Num1;
        this.Num2 = Num2;
    }

    public Double getNum1() {
        return Num1;
    }

    public void setNum1(Double Num1) {
        this.Num1 = Num1;
    }

    public Double getNum2() {
        return Num2;
    }

    public void setNum2(Double Num2) {
        this.Num2 = Num2;
    }
   public void devolvermayor(){
        System.out.println("Número mayor: " + Math.max(getNum1(), getNum2()));
   }
   public void calcularPotencia(){
       Double mayor = Math.max(getNum1(), getNum2());
       Double menor = Math.min(getNum1(), getNum2());
       System.out.println("Mayor redondeado: " + Math.round(mayor));
       System.out.println("Menor redondeado: " + Math.round(menor));
       long mayorRedondeado = Math.round(mayor);
       long menorRedondeado = Math.round(menor);
       System.out.println("Potencia redondeados: " + Math.pow(mayorRedondeado, menorRedondeado));
      System.out.println("Potencia sin redondear: " + Math.pow(mayor, menor));
      
      
   }
   public void calculaRaiz(){
       Double menor = Math.min(getNum1(), getNum2());
       Double menorabsoluto = Math.abs(menor);
       Double raizNumMenor = Math.sqrt(menorabsoluto);
       System.out.println("Número menor: " + menor);
       System.out.println("Número menor absoluto: " + menorabsoluto);
       System.out.println("Raíz del número menor: " + raizNumMenor);
       
             
       
   }
}
