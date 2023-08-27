import java.util.Scanner;

public class FiguraTroncoDeCono {
        public static void main(String[] args) {
           
              Scanner lector = new Scanner (System.in);
           
             double altura, radioMayor, radioMenor, genetrz ;
             double areaTotal , volumen , areaLateral, areabaseMayor, areabaseMenor;
    
               System.out.println ("Ingrese altura del Tronco de cono :  ");
               altura = lector.nextDouble();
    
               System.out.println (" Ingrese Radio Mayor del Tronco de cono : ");
               radioMayor = lector.nextDouble();
    
               System.out.println (" Ingrese Radio menor del Tronco de cono : ");
               radioMenor = lector.nextDouble(); 
    
             areabaseMayor =  Math.PI*(radioMayor*radioMayor);
             areabaseMenor = Math.PI*(radioMenor*radioMenor);
             genetrz = Math.sqrt(altura*altura + (radioMayor-radioMenor)*(radioMayor-radioMenor));
             areaLateral = Math.PI *genetrz*(radioMayor+radioMenor);
             areaTotal = areaLateral + areabaseMayor + areabaseMenor;
             volumen = 1/3*Math.PI*altura*(radioMayor*radioMayor + radioMenor*radioMenor + radioMayor*radioMenor); 
        
        
              System.out.println("Area Total del Tronco de cono :" + areaTotal +  "Unidades cuadradas.");
              System.out.println("Volumen del Tronco de cono :" + volumen +  "Unidades cuadradas.");
              System.out.println("Area Lateral del Tronco de cono :" + areaLateral + "Unidades cuadradas.");
            
    
            lector.close();
    
        }
    }

}
