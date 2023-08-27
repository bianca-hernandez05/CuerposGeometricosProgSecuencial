   import java.util.Scanner;

public class FiguraIcosaedro {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner (System.in);
       
        int a ;
        double area , volumen;

        System.out.println ("Valor de la longitud de la arista:  ");
        a = lector.nextInt();

        area = 5*a*a*(Math.sqrt(3));
        volumen =5/12 * (3+ Math.sqrt(5)) *a*a*a ;
      
        System.out.println("Area del Icosaedro :" + area + "Unidades cuadradas.");
        System.out.println("Volumen del Icosaedro :" + volumen + "Unidades cuadradas.");
        

        lector.close();
    }
}

}
