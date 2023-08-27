 import java.util.Scanner;

public class FiguraHexaedro {
    public static void main(String[] args){
        
        Scanner lector = new Scanner (System.in);
       
        int a ;
        double area , volumen , diagonal;

        System.out.println ("Valor de lados:  ");
        a = lector.nextInt();

        area = 6*(a*a);
        volumen = a*a*a ;
        diagonal = Math.sqrt(3)*a;

        System.out.println("Area del Tetraedro :" + area + "Unidades cuadradas.");
        System.out.println("Volumen del Tetraedro :" + volumen + "Unidades cuadradas.");
        System.out.println("Diagonal del Tetraedro :" + diagonal + "Unidades cuadradas.");

        lector.close();
    }
}
}
