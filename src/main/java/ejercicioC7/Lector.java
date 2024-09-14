package ejercicioC7;

public class Lector {

    // Atributos:
    private String nombre;
    private Libro libroPrestado;

    // Constructor
    public Lector(String nombre) {
        this.nombre = nombre;
        this.libroPrestado = null;
    }

    // metodo tomar prestado:
    public void tomarPrestado(Libro libro) {
        if (libro.getDisponible()) {
            libroPrestado = libro;
            libro.prestar();
        } else {
            System.out.println("El libro '" + libro.getTitulo() + "' no esta disponible");
        }
    }

    // metodo devolver libro:
    public void devolverLibro() {
        if (libroPrestado != null) {
            libroPrestado.devolver();
            libroPrestado = null;
        } else {
            System.out.println("El lector no tiene ningun libro para devolver.");
        }
    }

    // metodo mostrar informacion.
    public void mostrarInformacion() {
        System.out.println("Nombre del lector: " + nombre);
        if (libroPrestado != null) {
            System.out.println("El libro prestado: " + libroPrestado.getTitulo());
        } else {
            System.out.println("No tiene ningun libro prestado");
        }

    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
