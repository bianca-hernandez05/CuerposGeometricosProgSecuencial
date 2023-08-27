  import java.util.Scanner;

public class FiguraCono {
    public static void main(String[] args)  {
        Scanner lector = new Scanner(System.in);
         
        double areaBase ,areaTotal, areaLateral, perimetroBase;
        double altura, volumen,gentriz,radio;

        System.out.println("Altura: ");
        altura = lector.nextDouble();

        System.out.println ("Radio: ");
        radio = lector.nextDouble();
        
        areaBase = (Math.PI*radio*radio);
        perimetroBase = (Math.PI*radio*altura+ Math.PI*radio*radio); 
        gentriz = (Math.sqrt(altura*altura)+(radio*radio)); 
        areaLateral= (perimetroBase*gentriz)/2;  
        areaTotal= areaLateral+areaBase;
        areaLateral= (perimetroBase*gentriz)/2;
        volumen=(areaBase*altura)/3;

        System.out.println("Area Lateral: " + areaLateral + "unidades cuadradas.");
        System.out.println("Area Total: " + areaTotal + "unidades cuadradas.");
        System.out.println("Volumen: " + volumen + "unidades cuadradas.");

        lector.close();
    }
}
}
