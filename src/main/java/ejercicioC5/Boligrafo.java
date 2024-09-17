/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioC5;

public class Boligrafo {
    private int CANTIDAD_MAXIMA_TINTA = 100;
    private String color;
    private short tinta;
    
    
    //getters
    public String getColor(){
        return color;
    }
    
    public short getTinta(){
        return tinta;
    }
    
    //setters:
    public void setTinta(short cantidad) {
        short nuevaTinta = (short) (this.tinta + cantidad); // Conversión explícita a short
        if (nuevaTinta >= 0 && nuevaTinta <= CANTIDAD_MAXIMA_TINTA) {
            this.tinta = nuevaTinta;
        }
        // Si no es válido, no se modifica el atributo ni se realiza ninguna acción.
    }
    
    public void recargar(short cantidad){
        setTinta(cantidad);
    }
    
    public void pintar(){
        
    }
    
}
