
package ejercicioC1;

public class Cuenta {
    //Atributos:
    private String titular;
    private double cantidad;
    
    //Constructor:
    public Cuenta(){
        this.titular = "Juan";
        this.cantidad = 0.0;
    }
    
    //Metodos:
    public String mostrar(){
        String texto = "El titular es " + titular + " con dinero en cuenta: $" + cantidad;
        return texto;
    }
    
    public void acreditar(double monto){
        if (monto >= 0) {
            cantidad = cantidad + monto;
        } else {
            
        }
        
    }
    
    public void retirar(double retiro) {
        cantidad = cantidad - retiro;
    }
    
    
    public String getTitular(){
        return titular;
    }
    
    public double getCantidad(){
        return cantidad;
    }
}
