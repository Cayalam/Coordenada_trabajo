package ejecutable;
import modelo.Coordenada;

public class Test {
    public static void main(String[]args)
    {
        Coordenada C1= new Coordenada(5, 10);
        System.out.println(C1);
        Coordenada C2 = new Coordenada(5, 10);
        System.out.println(C2);
        if (C1.equals(C2)){
            System.out.println("Son iguales");
            }
    
            else{
            System.out.println("Son diferentes"); 
        }
        System.out.println("\nDistancia entre coordenadas:");
        System.out.println("distancia(c1, c2) = " + C1.distancia(C2));
    }

    
       
}