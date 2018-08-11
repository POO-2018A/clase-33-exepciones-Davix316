/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionejercicio2;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class ExcepcionEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner datos = new Scanner (System.in);
        
        double numerador;
        double denominador;
        boolean a=true;
        
        while(a){
            try{
                
        System.out.println("    Bienvenido");
        System.out.println("Ingrese el numerador: ");
        numerador = datos.nextInt();
        System.out.println("Ingrese el denominador: ");
        denominador = datos.nextInt();
        System.out.println("El resultado es: "+numerador/denominador);
        a=false;
        
        }catch(java.lang.ArithmeticException e1){
            System.out.println("No existe division para cero!!!");
        }catch(java.util.InputMismatchException e2){
            datos.nextLine();
            System.out.println("Ingrese numeros!!!");
        }
        }
     
    }
    
}
