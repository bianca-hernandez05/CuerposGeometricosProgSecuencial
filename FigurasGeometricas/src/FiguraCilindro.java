import java.util.Scanner;

public class FiguraCilindro {
    public static void main(String[] args)  {
        Scanner lector = new Scanner(System.in);
         
        double areaBase , areaTotal, areaLateral, perimetroBase;
        double altura,volumen,radio;

        System.out.println ("Altura: ");
        altura = lector.nextDouble();

        System.out.println("Radio: ");
        radio = lector.nextDouble();
      
        perimetroBase = (Math.PI*2*radio);
        areaLateral = perimetroBase*altura;
        areaBase= (Math.PI*radio*radio);
        volumen =areaBase*altura;
        areaTotal = areaLateral*(altura+radio);

        System.out.println ("Area lateral: " + areaLateral + "unidades cuadradas.");
        System.out.println ("Area Total: " + areaTotal + "unidades cuadradas.");
        System.out.println ("Volumen: " + volumen + "unidades cuadradas.");

        lector.close();
    }
}
}
