package com.Openbootcamp;
import java.util.Scanner;

//Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido
//el iva es de 21% en Argentina
public class Tema2 {
    static double calcularIva(double precio) {
        double iva;
        iva = precio * 0.21;
        return iva;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double precioDeProducto, iva;
          System.out.println("Ingrese el precio del producto");
          precioDeProducto = entrada.nextDouble();
          iva = calcularIva(precioDeProducto);
          System.out.println("El precio del producto con el IVA incluido es: $ " +(precioDeProducto + iva));
      }
    }