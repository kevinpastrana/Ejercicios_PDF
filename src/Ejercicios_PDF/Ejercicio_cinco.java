package Ejercicios_PDF;

import java.util.Scanner;

/*@author Kevin Felipe Pastrana Soto*/
 /*@codigo_estudiantil 20232215370*/
 /*El dueño de una empresa desea planificar las decisiones financieras que tomara en el siguiente
año. La manera de planificarlas depende de lo siguiente:
Si actualmente su capital se encuentra con saldo negativo, pedirá un préstamo bancario para
que su nuevo saldo sea de U$10.000. Si su capital tiene actualmente un saldo positivo pedirá un
préstamo bancario para tener un nuevo saldo de U$20.000, pero si su capital tiene actualmente
un saldo superior a los U$20.000 no pedirá ningún préstamo.
Posteriormente repartirá su presupuesto de la siguiente manera:
• U$5.000 para equipo de computo
• U$2.000 para mobiliario
• El resto la mitad será para la compra de insumos y la otra para otorgar incentivos al personal.
Desplegar que cantidades se destinaran para la compra de insumos e incentivos al personal y,
en caso de que fuera necesario, a cuánto ascendería la cantidad que se pediría al banco.*/
public class Ejercicio_cinco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el capital de su empresa: ");
        double saldo = sc.nextDouble();
        double saldoNuevo = 0;
        double prestamo = 0;
        
        if (saldo < 0) {
            saldoNuevo = 10000;
            prestamo = 10000 - saldo;
        } else if (saldo > 0 && saldo < 20000) {
            saldoNuevo = 20000;
            prestamo = 20000 - saldo;
        } else {
            saldoNuevo = saldo;
        }
        
        double equipoComputo = 5000;
        double mobiliarario = 2000;
        double otra = saldoNuevo - equipoComputo - mobiliarario;
        double insumos = otra / 2;
        double incentivosPersonal = otra / 2;
        
        System.out.println("El presupuesto se repartirá de la siguiente manera:");
        System.out.println("Para el equipo de computo: $5000");
        System.out.println("Para el mobiliario: $2000");
        System.out.println("Para la compra de insumos: $" + insumos);
        System.out.println("Para la compra de incentivos al personal: $" + incentivosPersonal);
        
        if (prestamo > 0) {
            System.out.println("Se solicitará un préstamo al banco por un monto de $" + prestamo);
        } else {
            System.out.println("No se solicitará ningún préstamo al banco.");
        }
    }
}