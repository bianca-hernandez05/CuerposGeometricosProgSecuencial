 import java.util.Scanner;

public class FiguraDodecaedro {
    
    public static void main(String[] args) {
       
         Scanner lector = new Scanner (System.in);
       
         int a ;
         double areaTotal , volumen , areaPentagonal,apotema;

           System.out.println ("Valor de la longitud del lado:  ");
           a = lector.nextInt();

         apotema = a/2 *Math.sqrt(3+ Math.sqrt (5));
         areaTotal = 3*(Math.sqrt(25) +10*Math.sqrt(5))*a*a;
         volumen = 0.25*(15+7*Math.sqrt(5))*a*a*a;
         areaPentagonal = 2.5*a*apotema;
      
          System.out.println("Area Total del dodecaedro :" + areaTotal +  "Unidades cuadradas.");
          System.out.println("Volumen del dodecaedro :" + volumen +  "Unidades cuadradas.");
          System.out.println("Area pentagonal del dodecaedro :" + areaPentagonal + "Unidades cuadradas.");
        

        lector.close();
    }
}
}
