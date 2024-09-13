/*
[C.01] - Creo que necesito un préstamo
Crear una aplicación de consola que contenga la clase Cuenta.
Deberá tener los atributos:
● titular que contendrá la razón social del titular de la cuenta.
● cantidad que será un número decimal que representa al monto actual de dinero en la cuenta.

Construir los siguientes métodos para la clase:
● Un constructor que permita inicializar todos los atributos.
● Un método getter para cada atributo.
● mostrar retornará una cadena de texto con todos los datos de la cuenta.
● ingresar recibirá un monto para acreditar a la cuenta. Si el monto ingresado es negativo, no se hará nada.
● retirar recibirá un monto para debitar de la cuenta. La cuenta puede quedar en negativo.
En el método main, simular depósitos y extracciones de dinero de la cuenta, e ir mostrando como va variando el
saldo.
 */
package ejercicioC1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();
        

        
        while (true) {
            System.out.println(" **** ");
            System.out.println("Titular: " + cuenta.getTitular() + " || " + "Dinero: $" + cuenta.getCantidad());
            
            System.out.println("Seleccione una opcion: ");
            System.out.println("1) Ingresar dinero.");
            System.out.println("2) Retirar dinero.");
            System.out.println("3) Mostrar datos.");
            
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Dinero a depositar: ");
                    double monto = scanner.nextDouble();
                    cuenta.acreditar(monto);
                    break;
                case 2:
                    System.out.print("Dinero a retirar: ");
                    double retiro = scanner.nextDouble();
                    cuenta.retirar(retiro);
                    break;
                case 3:
                    System.out.println(cuenta.mostrar());
            }
        }

    }
}
