   import java.util.Scanner;

public class FiguraTetraedro {
            public static void main(String[] args){
            Scanner lector = new Scanner (System.in);
           
            int a ;
            double area , volumen , altura;
    
            System.out.println ("Valor de la arista:  ");
            a = lector.nextInt();
    
            area = Math.sqrt(3) *a*a;
            volumen = Math.sqrt(2)/12 *a*a*a ;
            altura = Math.sqrt(6)/3 *a ;
    
            System.out.println("Area del Tetraedro :" + area + "Unidades cuadradas.");
            System.out.println("Volumen del Tetraedro :" + volumen + "Unidades cuadradas.");
            System.out.println("Altura del Tetraedro :" + altura + "Unidades cuadradas.");
    
    
            lector.close();
        }
    }

}
