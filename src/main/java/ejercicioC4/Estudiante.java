package ejercicioC4;

import java.util.Random;

public class Estudiante {

    //Atributos:
    private String apellido;
    private String legajo;
    private String nombre;
    private int notaPrimerParcial;
    private int notaSegundoParcial;
    private static Random random;

    // Bloque estático: Este bloque se ejecuta una vez cuando la clase se carga en memoria, 
    // antes de que se cree cualquier instancia de la clase.
    static {
        random = new Random();
    }

    //constructor
    public Estudiante(String nombre, String apellido, String legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    //setters
    public void setNotaPrimerParcial(int primerNota) {
        notaPrimerParcial = primerNota;
    }

    public void setNotaSegundoParcial(int segundaNota) {
        notaSegundoParcial = segundaNota;
    }

    private double calcularPromedio() {
        int suma = notaPrimerParcial + notaSegundoParcial;
        return suma / 2;
    }

    public int calcularNotaFinal() {
        // nextInt(5) genera un número entre 0 y 4, sumando 6 obtenemos un número entre 6 y 10
        int notaAleatoria = 6 + random.nextInt(5);
        
        if (notaPrimerParcial >= 4 && notaSegundoParcial >= 4) {
            return notaAleatoria;
        } else {
            return -1;
        }
    }

    public void mostrar() {
        // Crear una instancia de StringBuilder
        StringBuilder mensaje = new StringBuilder("Nombre: " + nombre + " | Apellido: " + apellido + " | legajo: " + legajo + "\n");

        mensaje.append("Primer parcial: " + notaPrimerParcial + "| Segundo parcial: " + notaSegundoParcial + "\n");
        mensaje.append("El promedio es: " + calcularPromedio() +"\n");
        
        if(calcularNotaFinal() > 0){
            mensaje.append("Nota Final:" + calcularNotaFinal());
        } else {
            mensaje.append("Alumno desaprobado");
        }
        
        System.out.println(mensaje.toString());
    }
}
