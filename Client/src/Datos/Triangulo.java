package Datos;

public class Triangulo extends Figura implements Interface1 {
    
    
    
    public Triangulo() {
        super();
        
    }


    @Override
    public Float calcular() {
        // TODO Implement this meth
        
        return (this.getAltura() * this.getBase()/2);
    }

}
