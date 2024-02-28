package Ejercicios_PDF;

import java.util.Scanner;

/*@author Kevin Felipe Pastrana Soto*/
 /*@codigo_estudiantil 20232215370*/
 /*En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá 
del número de equipos que compre. Si las computadoras son menos de cinco se les dará un 
10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual 
a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un 
40% de descuento. El precio de cada computadora es de U$500. */
public class Ejercicio_primero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("¿Cuantas computadoras quieres llevar?");

        int computadoras = sc.nextInt();  
        sc.nextLine();  

        System.out.println("Las computadoras que llevas son: " + computadoras);  

        int precio = 0;
        int descuento = 0;
        int total = 0;

        if (computadoras <= 5) { // Verifica si son menos de 5 computadoras para aplicar un 10% de descuento
            precio = computadoras * 500;
            descuento = (int) (precio * 0.10);
            total = precio - descuento;
        } else if (computadoras >= 5 && computadoras < 10) { // Verifica si el número de computadoras es mayor o igual a 5 y menor que 10 para aplicar un 20% de descuento
            precio = computadoras * 500;
            descuento = (int) (precio * 0.20);
            total = precio - descuento;
        } else if (computadoras >= 10) { // Verifica si son mas de 10 computadoras para aplicar un 40% de descuento
            precio = computadoras * 500;
            descuento = (int) (precio * 0.40);
            total = precio - descuento;
        }
        System.out.println("El precio total de las computadoras es de: " + precio);
        System.out.println("El precio total con descuento es de: " + total);
    }
}
