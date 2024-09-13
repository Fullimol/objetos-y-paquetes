package ejercicioC2;

import java.util.Random;

public class Adivinadora {

    //atributos
    int numeroSecreto; //genera numeros aleatorios
    int intentos;

    //constructor:
    public Adivinadora() {
        intentos = 0;
        Random random = new Random();
        numeroSecreto = random.nextInt(10) + 1; // Genera un número entre 1 y 10
    }
    
   
    public String adviniar(int numero){
        String mensaje;
        intentos ++;
        
        if (numero < numeroSecreto){
            mensaje = "menor";
        } else if (numero > numeroSecreto){
            mensaje = "mayor";
        } else {
            mensaje = "igual";
        }
        return mensaje;
    }
}
