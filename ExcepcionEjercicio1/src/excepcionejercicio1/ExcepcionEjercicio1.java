/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class ExcepcionEjercicio1 {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner (System.in);
        int tamanio;
        int posicion;
        
        boolean a= true;
        
        while(a){
        try{
        System.out.println("Ingrese el tamaño del arreglo");
        tamanio = lector.nextInt();
        int [] arreglo = new int [tamanio];
        lector.nextLine();
        System.out.println("Ingrese los numeros enteros del arreglo: ");
        for(int i=0; i<arreglo.length; i++){
            arreglo [i] = lector.nextInt();
        }
        lector.nextLine();
        System.out.println("Sus numeros son: ");
        for(int i=0; i<arreglo.length; i++){
            System.out.print(arreglo[i]+" , ");
        }
        System.out.println("");
        System.out.println("Indique la posición del número que desea visualizar: ");
        posicion= lector.nextInt();
        
        a = false;
        
        for(int i=0; i<arreglo.length; i++){
            if(i==posicion){
                System.out.println("El numero es: "+arreglo[i-1]);
            }
        }
        System.out.println("");
               
        }catch(InputMismatchException e1){
            lector.nextLine();
            System.out.println("El valor ingresado no es número entero");
        }catch(NegativeArraySizeException e2){
            lector.nextLine();
            System.out.println("El numero ingresado es negativo");
        }catch(ArrayIndexOutOfBoundsException e3){
            lector.nextLine();
            System.out.println("La posicion esta fuera del arreglo");
        }
        }

    }
    
}
