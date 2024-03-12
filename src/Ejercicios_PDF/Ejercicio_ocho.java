package Ejercicios_PDF;

import java.util.Scanner;

/*@author Kevin Felipe Pastrana Soto*/
 /*@codigo_estudiantil 20232215370*/
 /*El Seguro Social requiere clasificar a las personas que se jubilaran en el año 2004. Existen tres
tipos de jubilaciones: por edad, por antigüedad joven y por antigüedad adulta. Las personas
adscritas a la jubilación por edad deben tener 60 años o más y una antigüedad en su empleo de
menos de 25 años. Las personas adscritas a la jubilación por antigüedad joven deben tener
menos de 60 años y una antigüedad en su empleo de 25 años o más. Las personas adscritas a
la jubilación por antigüedad adulta deben tener 60 años o más y una antigüedad en su empleo
de 25 años o más.*/
public class Ejercicio_ocho {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos años tienes?: ");
        int edad = sc.nextInt();
        System.out.println("¿Cuántos años llevas trabajando?: ");
        int trabajo = sc.nextInt();

        int antiguedad = 2004 - (edad + trabajo);

        if (edad >= 60 && antiguedad < 25) {
            System.out.println("Usted está inscrito a jubilación por edad");
        } else if (edad < 60 && antiguedad >= 25) {
            System.out.println("Usted está inscrito a jubilación por antigüedad joven");
        } else if (edad >= 60 && antiguedad >= 25) {
            System.out.println("Usted está inscrito a jubilación por antigüedad adulta");
        } else {
            System.out.println("Usted no cumple con los requisitos para jubilarse según los criterios establecidos.");
        }
    }
}
