package Datos;

public class Rectangulo extends Figura implements Interface1 {
    
    public Rectangulo() {
        super();
    }


    @Override
    public Float calcular() {
        // TODO Implement this method
        return(this.getAltura() * this.getBase());
    }


}
