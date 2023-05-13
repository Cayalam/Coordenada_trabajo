package ejecutable;
import modelo.Coordenada;

public class Test {
    public static void main(String[]args)
    {
        Coordenada C1= new Coordenada(5, 10);
        System.out.println(C1);
        Coordenada C2 = new Coordenada(5, 20);
        System.out.println(C2);
    System.out.println("---PrimerPunto----");
        if (C1.equals(C2)){
            System.out.println("Son iguales");
            }
    
            else{
            System.out.println("Son diferentes"); 
        }
        System.out.println("---SegundoPunto--");
        System.out.println("Distancia entre coordenadas:");
        System.out.println("distancia(C1, C2) = " + C1.Distancia(C2));
    }

    
       
}