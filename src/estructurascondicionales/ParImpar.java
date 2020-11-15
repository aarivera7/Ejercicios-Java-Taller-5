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
public class ParImpar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //El número a verificar si es par
        int num = 0;
        String tipo = "";
        
        System.out.println("Programa para verificar si un número es par o impar\n");
        System.out.println("Ingrese el número a verificar:");
        num = leer.nextInt();     //Ingresa el nuemro
        
        if (num % 2 == 0){
            tipo = "par";
        } 
        else {
            tipo = "impar";
        }
        System.out.println("\nEl número "+num+ " es " + tipo);
    }
}
