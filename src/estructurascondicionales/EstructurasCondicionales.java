/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurascondicionales;
import java.util.Scanner;
/**
 *
 * @author adria
 */
public class EstructurasCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        //El número a verificar si es par
        int num = 0;
        
        System.out.println("Programa para verificar si un número es par");
        System.out.println("Ingrese el numero a verificar");
        num = leer.nextInt();     //Ingresa el nuemro
        
        if (num % 2 == 0){
            System.out.println("El número "+num + " es par");
        } else {
            System.out.println("El número "+num + " no es par");
        }
    }
    
}
