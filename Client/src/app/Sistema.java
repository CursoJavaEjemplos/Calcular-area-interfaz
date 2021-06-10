package app;

import Datos.Rectangulo;
import Datos.Triangulo;

public class Sistema {
   
    private static Triangulo tri;
    private static Rectangulo rec;

    public Sistema() {
        super();
    }

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        
        tri = new Triangulo();
        rec = new Rectangulo();
        
        
        Float rTri = tri.calcular();
        
        
        System.out.println(rTri);
               
        
        
    }
}
