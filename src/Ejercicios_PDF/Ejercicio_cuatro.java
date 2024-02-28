package Ejercicios_PDF;

import java.util.Scanner;

/*@author Kevin Felipe Pastrana Soto*/
 /*@codigo_estudiantil 20232215370*/
 /*Una frutería ofrece las manzanas con descuento según la siguiente tabla:
NUM. DE KILOS COMPRADOS         %   DESCUENTO
0 - 2                                   0%
2.01 - 5                                10%
5.01 - 10                               15%
10.01 en adelante                       20%
Determinar cuánto pagara una persona que compre manzanas es esa frutería.*/
public class Ejercicio_cuatro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos kilos de manzanas desea comprar?: ");
        
        double kg = sc.nextDouble();
        double precioFinal = kg * 1000; // Convertir kilogramos a gramos
        double descuento = 0;
        
        if (kg >= 0 && kg <= 2) { 
            descuento = (precioFinal * 0);
        }
        if (kg >= 2.01 && kg <= 5) { 
            descuento = (precioFinal * 0.10);
        }
        if (kg >= 5.01 && kg <= 10) { 
            descuento = (precioFinal * 0.15);
        }
        if (kg > 10.01) {
            descuento = (precioFinal * 0.20);
        }
        double precioDescuento = precioFinal - descuento;
        System.out.println("El precio a pagar antes de aplicar el descuento: "+ precioFinal);
        System.out.println("El precio a pagar con descuento es de: "+ precioDescuento);
    }
}
