/*
[C.03] - ¿Vos cuántas primaveras tenés?
Crear una aplicación de consola que contenga la clase Persona.
Deberá tener los atributos:
● nombre
● fechaDeNacimiento
● dni
Deberá tener un constructor que inicialice todos los atributos.
Construir los siguientes métodos para la clase:
● setter y getter para cada uno de los atributos.
● calcularEdad será privado y retornará la edad de la persona calculada a partir de la fecha de nacimiento.
● mostrar retornará una cadena de texto con todos los datos de la persona, incluyendo la edad actual.
● esMayorDeEdad si es mayor de edad devuelve el valor “Es mayor de edad", sino devuelve “es menor”.
1. Instanciar 3 objetos de tipo Persona en el método main.
2. Mostrar quiénes son mayores de edad y quiénes no.
 */
package ejercicioC3;
import java.time.LocalDate;

public class Main {
     public static void main(String[] args) {
         
        // Crear instancias de Persona
        Persona persona1 = new Persona("Juan Perez", LocalDate.of(1990, 5, 15), 3558117);
        Persona persona2 = new Persona("Maria Gomez", LocalDate.of(1985, 8, 22), 1625782);
        Persona persona3 = new Persona("Carlos Lopez", LocalDate.of(2015, 12, 30), 50158675);

        
        System.out.println(persona1.mostrar()  + persona1.esMayorDeEdad());
        System.out.println(persona2.mostrar()  + persona2.esMayorDeEdad());
        System.out.println(persona3.mostrar()  + persona3.esMayorDeEdad());
        
        
        // 2. Mostrar quiénes son mayores de edad y quiénes no.
    }
}
