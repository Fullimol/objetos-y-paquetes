package ejercicioC3;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

    //atributos:
    private String nombre;
    private LocalDate fechaDeNacimiento;
    private int dni;
    private int edad;

    //constructor
    public Persona(String nombre, LocalDate fechaDeNacimiento, int dni) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.dni = dni;
    }
    
    
    private int calcularEdad() {
        LocalDate hoy = LocalDate.now();
        return edad = Period.between(fechaDeNacimiento, hoy).getYears();
    }
    
    
    public String mostrar(){
        String mensaje = "Nombre: " + nombre + " | DNI " + dni + " | Nacimiento: " + fechaDeNacimiento + " | Edad: " + calcularEdad() + " | ";
        return mensaje;
    } 
    
    public String esMayorDeEdad(){
        if(edad < 18){
            return "Es menor de edad";
        } else {
            return "Es mayor de edad";
        }
    }
    
    //getters
    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public int getDni() {
        return dni;
    }

    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
