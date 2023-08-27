  import java.util.Scanner;

public class FiguraTroncoDePiramide {
            public static void main(String[] args) {
            
            Scanner lector = new Scanner (System.in);
              
            int cantidadLados;
             double altura, perimetroMayor,perimetroMenor;
             double apotemaMayor,apotemaMenor, areabaseMayor, areabaseMenor;
             double longitudLadosMayor, longitudLadosMenor, Apotema; 
             double areaTotal , volumen , areaLateral;
    
               System.out.println ("Ingrese altura del Tronco de Piramide:  ");
               altura = lector.nextDouble();
    
               System.out.println ("Ingrese Cantidad de lados del Tronco de Piramide:  ");
               cantidadLados = lector.nextInt();
                
               System.out.println (" Ingrese Longitud de lados mayor: ");
               longitudLadosMayor = lector.nextDouble();
               
               System.out.println (" Ingrese Longitud de lados menor: ");
               longitudLadosMenor = lector.nextDouble();
              
               System.out.println (" Ingrese apotema base mayor : ");
               apotemaMayor = lector.nextDouble();
               
               System.out.println (" Ingrese apotema base menor: ");
               apotemaMenor = lector.nextDouble();
    
               perimetroMayor = cantidadLados*longitudLadosMayor;
               perimetroMenor = cantidadLados*longitudLadosMenor;
               areabaseMayor= perimetroMayor* apotemaMayor /2;
               areabaseMenor = perimetroMenor *apotemaMenor /2;
               Apotema = Math.sqrt(altura + ((apotemaMayor-apotemaMenor)*(apotemaMayor-apotemaMenor)/2));
               areaLateral = perimetroMayor+perimetroMenor/2 *Apotema;
               areaTotal = areaLateral +areabaseMayor + areabaseMenor;
               volumen = 1/3* altura*(areabaseMayor + areabaseMenor + Math.sqrt(areabaseMayor*areabaseMenor));
    
              System.out.println("Area Total del Tronco de cono :" + areaTotal +  "Unidades cuadradas.");
              System.out.println("Volumen del Tronco de cono :" + volumen +  "Unidades cuadradas.");
              System.out.println("Area Lateral del Tronco de cono :" + areaLateral + "Unidades cuadradas.");
            
    
            lector.close();
    
        }
    }

}
