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
public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaracion e inializacion de variables
        double n;
        n = 0;
        System.out.println("Programa que permite saber si un número es positivo o negativo");
        System.out.println("Ingrese un numero");
        n = leer.nextDouble();
        
        //Proceso
        if (n > 0){
            System.out.println("El número: "+n+ " es positivo.");
        } 
        else {
            if (n < 0){
                System.out.println("El número: "+n+ " es negativo.");
            }
            else {
                if (n == 0){
                    System.out.println("El número: "+n+ " no es ni positivo, ni negativo.");
                }
                else {
                    System.out.println("El valor que digitaste no es valido");
                }
            }
        }
    }
}
