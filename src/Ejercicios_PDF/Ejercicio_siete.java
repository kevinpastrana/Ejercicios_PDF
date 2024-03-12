package Ejercicios_PDF;

import java.util.Scanner;

/*@author Kevin Felipe Pastrana Soto*/
 /*@codigo_estudiantil 20232215370*/
 /*Una institución educativa estableció un programa para estimular a los alumnos con buen
rendimiento académico y que consiste en lo siguiente:
▪ Si el promedio es de 9.5 o más y el alumno es de tecnología, entonces este podrá cursar
55 créditos y se le hará un 25% de descuento.
▪ Si el promedio es mayor o igual a 9 pero menor que 9.5 y el alumno es de tecnología,
entonces este podrá cursar 50 créditos y se le hará un 10% de descuento.
▪ Si el promedio es mayor que 7 y menor que 9 y el alumno es de tecnología, este podrá
cursar 50 créditos y no tendrá ningún descuento.
▪ Si el promedio es de 7 o menor, el número de materias reprobadas es de 0 a 3 y el
alumno es de tecnología, entonces podrá cursar 45 créditos y no tendrá descuento.
▪ Si el promedio es de 7 o menor, el número de materias reprobadas es de 4 o más y el
alumno es de tecnología, entonces podrá cursar 40 créditos y no tendrá ningún
descuento.
▪ Si el promedio es mayor o igual a 9.5 y el alumno es de profesional, entonces podrá
cursar 55 créditos y se le hará un 20% de descuento.
▪ Si el promedio es menor de 9.5 y el alumno es de profesional, entonces podrá cursar 55
créditos y no tendrá descuento.
Obtener el total que tendrá que pagar un alumno si el valor de la matrícula para alumnos de
profesional es de $30.000 por cada cinco créditos y para alumnos de tecnología es de $18.000
por cada cinco créditos.*/
public class Ejercicio_siete {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuál es tu promedio?: ");
        double promedio = sc.nextDouble();

        System.out.print("¿Cuántas materias reprobaste?: ");
        int materiasReprobadas = sc.nextInt();

        System.out.print("¿Qué programa estás cursando? (Profesional/Tecnologia): ");
        String programa = sc.next();

        int creditos = 0;
        int descuento = 0;

        if (programa.equalsIgnoreCase("Tecnologia")) {
            if (promedio >= 9.5) {
                creditos = 55;
                descuento = 25;
            } else if (promedio >= 9.0) {
                creditos = 50;
                descuento = 10;
            } else if (promedio >= 7.0) {
                creditos = 50;
                descuento = 0;
            } else if (promedio <= 7.0 && materiasReprobadas <= 3) {
                creditos = 45;
                descuento = 0;
            } else if (promedio <= 7.0 && materiasReprobadas >= 4) {
                creditos = 40;
                descuento = 0;
            }
        } else if (programa.equalsIgnoreCase("Profesional")) {
            if (promedio >= 9.5) {
                creditos = 55;
                descuento = 20;
            } else if (promedio <= 9.5) {
                creditos = 50;
                descuento = 0;
            }
        } else {
            System.out.println("Error: Programa no reconocido.");
            return;
        }

        int valorCreditos = 0;
        if (programa.equalsIgnoreCase("Profesional")) {
            valorCreditos = 30000;
        } else if (programa.equalsIgnoreCase("Tecnologia")) {
            valorCreditos = 18000;
        }

        double valorParcial = (creditos / 5.0) * valorCreditos;
        double valorDescuento = (descuento / 100.0) * valorParcial;
        double valorTotal = valorParcial - valorDescuento;

        System.out.println("El número de créditos a cursar es: " + creditos);
        System.out.println("El descuento es de: " + descuento + "%");
        System.out.println("El precio parcial es: " + valorParcial);
        System.out.println("El precio del descuento es: " + valorDescuento);
        System.out.println("El precio total es: " + valorTotal);
    }
}
