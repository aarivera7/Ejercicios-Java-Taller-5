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
public class TotalFactura {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        //Declaracion e inalizacion de variables
        
        double subtotal, total, descuento, desc;
        int limite1, limite2;
        
        subtotal = 0; total = 0; descuento = 0; desc = 0;
        limite1 = 200; limite2 =500;
        
        System.out.println("Programa para calcular el valor total de una factura con descuento");
        
        //Ingresar datos de entrada
        System.out.println("Ingrese el subtotal de la compra: ");
        subtotal = leer.nextDouble();
        
        if ((subtotal >= limite1) && (subtotal < limite2)){
            descuento = 0.10;
        }
        else {
            if (subtotal >= limite2){
                descuento = 0.15;
            }
        }
        total = subtotal - (subtotal*descuento);
        desc = subtotal*descuento;
        if (subtotal < limite1){
            System.out.println("No hay descuento por su compra por ser menor a 200 dolares");
        }
        //Presenta salida de datos
        System.out.println("El total de la factura es $" +total+ " con un descuento de $" +desc+" del " +descuento*100+"%");
    }
}
