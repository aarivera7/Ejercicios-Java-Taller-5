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
public class Calculadora {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaracion e inalizacion de variables
        double n1, n2, r;
        int O;
        n1 = 0; n2 = 0; r =0; O = 0;
        
        System.out.println("Calculadora de operaciones básicas\n");
        
        //Lectura de datos
        System.out.println("Ingrese el primer número");
        n1 = leer.nextDouble();
        System.out.println("Ingrese el segundo número");
        n2 = leer.nextDouble();
        
        //Menú de opciones
        System.out.println("Escoga una de las siguientes opciones\n");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        
        //Selección de opciones
        O = leer.nextInt();
        
        switch (O) {
            case 1: {
                r = n1 + n2;
                System.out.println("La respuesta de la suma es: "+r);
            }
            break;
            case 2: {
                r = n1 - n2;
                System.out.println("La respuesta de la resta es: "+r);
            }
            break;
            case 3: {
                r = n1 * n2;
                System.out.println("La respuesta de la multiplicación es: "+r);
            }
            break;
            case 4: {
                r = n1 / n2;
                System.out.println("La respuesta de la división es: "+r);
            }
            break;
            default:
                System.out.println("Opción invalida");
            break;
        }
    }
}
