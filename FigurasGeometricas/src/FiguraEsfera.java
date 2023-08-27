 import java.util.Scanner;

public class FiguraEsfera {
    public static void main(String[] args) {
       Scanner lector= new Scanner (System.in);
        
       double area,volumen,radio ;

       System.out.println("Radio de la esfera: ");
       radio = lector.nextDouble();

       area = (Math.PI*4*radio*radio);
       volumen= (4/3*Math.PI*radio*radio*radio);

    System.out.println ("El area de la esfera:" + area + "unidades cuadradas.");
    System.out.println ("El Volumen de la esfera:" + volumen + "unidades cuadradas.");

        lector.close();
    }
}
}
