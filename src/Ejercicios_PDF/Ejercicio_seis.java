package Ejercicios_PDF;

import java.util.Scanner;

/*@author Kevin Felipe Pastrana Soto*/
 /*@codigo_estudiantil 20232215370*/
 /*Tomando como base los resultados obtenidos en un laboratorio de análisis clínicos, un médico
determina si una persona tiene anemia o no, lo cual depende de su nivel de hemoglobina en la
sangre, de su edad y de su sexo. Si el nivel de hemoglobina que tiene una persona es menor
que el rango que le corresponde, se determina su resultado como positivo y en caso contrario
como negativo. La tabla en la que el medico se basa para obtener el resultado es la siguiente:

EDAD                    NIVEL HEMOGLOBINA
0 - 1 mes               13 - 26 g%
> 1 y < = 6 meses       10 - 18 g%
> 6 y < = 12 meses      11 - 15 g%
> 1 y < = 5 años        11.5 - 15 g%
> 5 y < = 10 años       12.6 - 15.5 g%
> 10 y < = 15 años      13 - 15.5 g%
Mujeres > 15 años       12 - 16 g%
Hombres > 15 años       14 - 18 g%*/
public class Ejercicio_seis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuál es tu nivel de hemoglobina?: ");
        double hemoglobina = sc.nextDouble();
        sc.nextLine(); 
        System.out.println("Ingrese su edad en meses: ");
        int edad = sc.nextInt();
        sc.nextLine(); 
        
        if (edad > 0 &&  edad <=180) {
            if (edad <= 1) {
                if (hemoglobina < 13.0) {
                    System.out.println("Positivo para anemia");
                } else {
                    System.out.println("Negativo para anemia");
                }
            } else if (edad <= 6) {
                if (hemoglobina < 10.0) {
                    System.out.println("Positivo para anemia");
                } else {
                    System.out.println("Negativo para anemia");
                }
            } else if (edad <= 12) {
                if (hemoglobina < 11.0) {
                    System.out.println("Positivo para anemia");
                } else {
                    System.out.println("Negativo para anemia");
                }
            } else if (edad <= 60) {
                if (hemoglobina < 11.5) {
                    System.out.println("Positivo para anemia");
                } else {
                    System.out.println("Negativo para anemia");
                }
            } else if (edad <= 120) {
                if (hemoglobina < 12.6) {
                    System.out.println("Positivo para anemia");
                } else {
                    System.out.println("Negativo para anemia");
                }
            } else if (edad <= 180) {
                if (hemoglobina < 13.0) {
                    System.out.println("Positivo para anemia");
                } else {
                    System.out.println("Negativo para anemia");
                }
            }
        } else {
            System.out.println("Error en la edad");
        }
        if (edad > 0 && edad <= 180) {
            System.out.println("Ingrese su sexo (1)Hombre, (2)Mujer: ");
            int sexo = sc.nextInt();
            if (sexo == 2) {
                if (hemoglobina < 12.0) {
                    System.out.println("Positivo para anemia");
                } else {
                    System.out.println("Negativo para anemia");
                }
            } else if (sexo == 1) {
                if (hemoglobina < 14.0) {
                    System.out.println("Positivo para anemia");
                } else
                    System.out.println("Negativo para anemia");
            }
        }
    }
}
