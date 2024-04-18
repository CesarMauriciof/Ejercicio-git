
public class Persona {
    private int numero;
    private int tipo;
    private double tarifa;
    private double precioFinal;

    public Persona(int numero, int tipo, double tarifa, double precioFinal) {
        this.numero = numero;
        this.tipo = tipo;
        this.tarifa = tarifa;
        this.precioFinal = precioFinal;
    }

    public int getNumero() {
        return numero;
    }

    public int getTipo() {
        return tipo;
    }

    public double getTarifa() {
        return tarifa;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }
    
    
            
   
    public static void main(String[] args) {
       
        
        Persona persona1 = new Persona(1, 5, 50, 40);
        System.out.println(""+persona1.getTipo());
        
        
                
                
    }
    
}
