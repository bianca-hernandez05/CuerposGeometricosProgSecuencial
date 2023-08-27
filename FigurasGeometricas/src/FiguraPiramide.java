  
import java.util.Scanner;

public class FiguraPiramide {

    public static void main(String[] args)  {
        Scanner lector = new Scanner(System.in);
        
        int CantidadLados;
        double altura, apotemaBase, perimetroBase, ApotemaPiramide;
        double LongitudLados, areaLateral, areaTotal, volumen,AreaBase;

       System.out.println ("Cantidad de lados: ");
        CantidadLados = lector.nextInt();

        System.out.println("Altura: ");
        altura= lector.nextDouble();

        System.out.println("Longitud de lados: ");
        LongitudLados = lector.nextDouble();

        apotemaBase = LongitudLados /Math.sqrt(12);
        ApotemaPiramide= (Math.sqrt(altura*altura) +(apotemaBase*apotemaBase));
        perimetroBase= CantidadLados*LongitudLados;
        areaLateral= (perimetroBase*ApotemaPiramide)/2;
        AreaBase=perimetroBase*2*(apotemaBase+ApotemaPiramide);
        volumen= (AreaBase+altura)/3;
        areaTotal= areaLateral+AreaBase;

        System.out.println(" Area lateral: " + areaLateral + "unidades cuadradas.");
        System.out.println(" Area total: " + areaTotal +"unidades cuadradas.");
        System.out.println(" Volumen: " + volumen + "unidades cuadradas.");


       lector.close();
    }
}
}
