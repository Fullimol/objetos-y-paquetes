package ejercicioC7;

public class Biblioteca {

    public static void main(String[] args) {
        // crear instancias:
        Libro libro1 = new Libro("Sobre heroes y tumbas", "Juan H", true);
        Libro libro2 = new Libro("mi librito", "Verne", true);

        //crear lector
        Lector lector1 = new Lector("cachito");

        // Mostrar informacion inicial de libros y el lector.
        System.out.print("Informacion inicial: ");
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
        libro1.mostrarInformacion();

        // el lector toma prestado un libro
        lector1.tomarPrestado(libro1);

        // el lector pide prestado el que ya se prestó
        lector1.tomarPrestado(libro1);
        
        // Mostrar info despues de  préstamo
        libro1.mostrarInformacion();
        lector1.mostrarInformacion();
        
        // el lector devolucion
        lector1.devolverLibro();
        
        // Mostrar info despues de LA DEVOLUCION
        libro1.mostrarInformacion();
        lector1.mostrarInformacion();
    }
}
