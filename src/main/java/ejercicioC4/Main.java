/*
[C.04] El ejemplo universal
Crear una aplicación de consola que contenga la clase del siguiente diagrama:
La clase Estudiante:
● Tendrá un bloque estático que inicializará el atributo estático random.
● Tendrá un constructor de instancia que inicializará los atributos nombre, apellido y legajo.
● El método setter setNotaPrimerParcial permitirá cambiar el valor del atributo notaPrimerParcial.
● El método setter setNotaSegundoParcial permitirá cambiar el valor del atributo notaSegundoParcial.
● El método privado calcularPromedio retornará el promedio de las dos notas.
● El método calcularNotaFinal deberá retornar la nota del final con un número aleatorio entre 6 y 10 incluidos
siempre y cuando las notas del primer y segundo parcial sean mayores o iguales a 4, caso contrario la
inicializará con el valor -1.
● El método mostrar utilizará StringBuilder para armar una cadena de texto con todos los datos de los
alumnos:
○ Nombre, apellido y legajo.
○ Nota del primer y segundo parcial.
○ Promedio.
○ Nota final. Se mostrará sólo si el valor es distinto de -1, caso contrario se mostrará la leyenda
"Alumno desaprobado".

En el método main:
1. Crear tres instancias de la clase Estudiante (tres objetos).
2. Cargar las notas del primer y segundo parcial a todos los alumnos. Dos deberán estar aprobados y uno
desaprobado.
3. Mostrar los datos de todos los alumnos.
IMPORTANTE
Para darle un valor aleatorio a la nota final utilice el método de instancia nextInt de la clase Random.

 */
package ejercicioC4;

public class Main {
    public static void main(String[] args) {
    Estudiante estudiante1 = new Estudiante("Juan", "Gonzalez", "9987");
    Estudiante estudiante2 = new Estudiante("Monica", "Wolovich", "8455");
    Estudiante estudiante3 = new Estudiante("Martin", "Fernandez", "4237");
    
    
    estudiante1.setNotaPrimerParcial(7);
    estudiante1.setNotaSegundoParcial(2);
    
    estudiante2.setNotaPrimerParcial(4);
    estudiante2.setNotaSegundoParcial(5);
    
    estudiante3.setNotaPrimerParcial(1);
    estudiante3.setNotaSegundoParcial(8);
    
    estudiante1.mostrar();
    estudiante2.mostrar();
    estudiante3.mostrar();
    }
}
