  import java.util.Scanner;

public class FiguraOctaedro {
    public static void main(String[] args){
        Scanner lector = new Scanner (System.in);
       
        int a ;
        double area , volumen ;

        System.out.println ("Valor de la longitud de la arista:  ");
        a = lector.nextInt();

        area = 2*a*a* Math.sqrt(3);
        volumen = Math.sqrt(2)/3 *a*a*a ;
       
        System.out.println("Area del Octaedro :" + area + "Unidades cuadradas.");
        System.out.println("Volumen del Octaedro :" + volumen + "Unidades cuadradas.");
        

        lector.close();
    }
}
}
