/*
[C.02] - Adivinar el numerín, crack!
Crear un juego simple de adivinanza de números. El jugador debe adivinar un número secreto generado
aleatoriamente. La aplicación dará pistas sobre si el número ingresado es mayor o menor que el número a ser
adivinado, mientras muestra la cantidad de intentos realizados por el jugador.
Crear el proyecto de Java AdivinarNumeros que contenga la clase Adivinadora, la cual tendrá los siguientes
miembros:
Atributos:
● numeroSecreto el cual contiene un valor aleatorio entero.
● intentos indicará la cantidad de veces que el jugador ha intentado adivinar el número secreto.
Métodos:
● Constructor que inicialice el atributo numeroSecreto con un valor aleatorio entre uno y cien (utilizar el
método de instancia ‘nextInt’ de la clase Random) y en cero al atributo intentos.
● adivinar(int) compara el número recibido cómo parámetro con el atributo numeroSecreto. Retornará la
cadena de texto “Mayor”, “Menor”o “Igual”, según corresponda. Cada vez que es invocado, incrementará
en una unidad el valor del atributo intentos.

En el método main, crear una instancia de la clase Adivinadora y permitir que el jugador ingrese un número mientras
no lo haya adivinado. La aplicación le indicará si el número ingresado es menor o mayor al número secreto y en todo
momento sabrá la cantidad de intentos realizados.
Cuando el jugador haya ganado, mostrar la cantidad de intentos realizados y en número secreto con el siguiente
formato:
“Ganaste!!! El número 31 lo adivinaste en 912 intentos!!!”
Siendo 31 el número secreto y 912 la cantidad de intentos realizados.






                                                ¡¡¡¡ME FALTA HACER ESTA PARTE!!!!

Nota: generar una versión que tenga en cuenta distintos niveles de dificultad. Nivel fácil, cantidad ilimitada de
intentos fallidos. Nivel medio, hasta 50 intentos. Nivel difícil, hasta 10 intentos.
 */
package ejercicioC2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Adivinadora adivinar = new Adivinadora();

        System.out.print("Ingrese un numero:");
        int numeroIngresado = scanner.nextInt();

        String respuestaAdivinadora = adivinar.adviniar(numeroIngresado); // Llamar al metodo para ingresar numeros.

        switch (respuestaAdivinadora) {
            case "mayor":
                System.out.println("(Tu numero es mayor)");
                break;
            case "menor":
                System.out.println("(Tu numero es menor)");
                break;
            case "igual":
                System.out.println("GANASTE!! con " + adivinar.intentos + " intentos!!");
                break;
        }

        while (!respuestaAdivinadora.equals("igual")) {
            System.out.println("INTENTOS: " + adivinar.intentos);
            System.out.print("Ingrese un numero: ");
            numeroIngresado = scanner.nextInt();

            respuestaAdivinadora = adivinar.adviniar(numeroIngresado);

            //System.out.println("Tu numero es: " + respuestaAdivinadora);
            switch (respuestaAdivinadora) {
                case "mayor":
                    System.out.println("(Tu numero es mayor)");
                    break;
                case "menor":
                    System.out.println("(Tu numero es menor)");
                    break;
                case "igual":
                    System.out.println("GANASTE!! con " + adivinar.intentos + " intentos!!");
                    System.out.println("NUMERO SECRETO: " + adivinar.numeroSecreto);
                    break;
            }
        }
    }
}
