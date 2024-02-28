package Ejercicios_PDF;

import java.util.Scanner;

/*@author Kevin Felipe Pastrana Soto*/
 /*@codigo_estudiantil 20232215370*/
 /*Un proveedor de reproductores de música ofrece un descuento del 10% sobre el precio sin IVA,
de algún aparato, si esta cuesta U$500 o más. Además, independientemente de esto, ofrece un
5% de descuento si la marca es “NOSY”. Determinar cuánto pagará, con IVA incluido, un cliente
cualquiera por la compra de su aparato. El IVA es del 19%.*/
public class Ejercicio_tercero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuánto vale el producto sin IVA?: ");
        double precioSinIVA = Double.parseDouble(scanner.nextLine());
        System.out.println("Ingresa la marca del producto: ");
        String marcaProducto = scanner.nextLine();

        if (precioSinIVA >= 500) {
            double porcentajeDescuento = 0.10;
            double descuento = precioSinIVA * porcentajeDescuento;
            precioSinIVA = precioSinIVA - descuento;
        }

        if (marcaProducto.equalsIgnoreCase("NOSY")) {
            double descuentoMarca = precioSinIVA * 0.05;
            precioSinIVA = precioSinIVA - descuentoMarca;
        }

        double impuestoIVA = precioSinIVA * 0.19;
        double precioTotal = precioSinIVA + impuestoIVA;

        // Convertir el precio total a int
        int precioFinal = (int) precioTotal;

        System.out.println("El precio a pagar total sería de: " + precioFinal);
    }
}
