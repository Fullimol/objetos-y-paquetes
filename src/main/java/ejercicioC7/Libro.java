
package ejercicioC7;


public class Libro {
    
    //atributos de la clase libro.
    private String titulo;
    private String autor;
    private boolean disponible;
    
    //constructor
    public Libro(String titulo, String autor, boolean disponible){
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }
    
    // Metodos setter y getter para cada atributo. 
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public boolean getDisponible(){
        return disponible;
    }
    
    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }
    
    // Metodo para imprimir la informacion
    public void mostrarInformacion(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Disponible: " + (disponible ? "si":"no"));
    }
    
    // Metodo prestar
    public void prestar(){
        if(disponible){
            disponible = false;
            System.out.println("El libro '" + titulo + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + titulo + "' no está disponible.");
        }
    }
    
    // Metodo devolver
    public void devolver(){
        disponible = true;
        System.out.println("El libro ha sido devuelto y ahora esta disponible");
    }
}
