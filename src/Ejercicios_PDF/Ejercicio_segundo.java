package Ejercicios_PDF;

import java.util.Scanner;

/*@author Kevin Felipe Pastrana Soto*/
 /*@codigo_estudiantil 20232215370*/
 /*En una serviteca se ha establecido una promoción de las llantas marca “Pinchadas”, que consiste 
en lo siguiente: 
• Si se compran menos de cinco llantas el precio es de U$100 cada una, de U$75 si se 
compran de cinco a 10 y de U$50 si se compran más de 10. 
• Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas 
que compra y la que tiene que pagar por el total de la compra.*/
public class Ejercicio_segundo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("¿Cuantas llantas desea comprar?");

        int llantas = sc.nextInt(); 
        sc.nextLine(); 

        System.out.println("Las llantas que llevas son: " + llantas); 

        int precio = 0;

        if (llantas < 5) {
            precio = 100;
        } else if (llantas >= 5 && llantas <= 10) {
            precio = 75;
        } else if (llantas > 10) {
            precio = 50;
        }

        int precioTotal = llantas * precio;

        System.out.println("El precio por cada llanta es: $" + precio);
        System.out.println("La cantidad total a pagar por las llantas es: $" + precioTotal);
    }
}
