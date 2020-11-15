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
public class MayorNumCondAnidadas {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaracion de variables
        double n1, n2, n3;
        n1 = 0; n2 = 0; n3 =0;
        
        //Ingreso de datos de entrada
        System.out.println("Programa para averiguar cuál es el número mayor de tres números\n");
        
        System.out.println("Ingrese el primer número");
        n1 = leer.nextDouble();
        System.out.println("Ingrese el segundo número");
        n2 = leer.nextDouble();
        System.out.println("Ingrese el tercero número");
        n3 = leer.nextDouble();
        
        //Proceso
        if (n1 > n2){
            if (n1 > n3){
                System.out.println("El primer número: "+n1+ " es el mayor");
            }
        }
        if (n2 > n1){
            if (n2 > n3) {
                System.out.println("El segundo número: "+n2+ " es el mayor");
            }
        }
        if (n3 > n1) {
            if (n3 > n2){
                System.out.println("El tercer número: "+n3+ " es el mayor");
            }
        }
        else {
            System.out.println("Los valores que ingresaste son iguales");
        }
    }
}
