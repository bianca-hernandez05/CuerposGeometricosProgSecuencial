 
    import java.util.Scanner;

public class FiguraOrtoedro {

    public class App {
        
        public static void main(String[] args) {
            Scanner lector = new Scanner (System.in);
    
            int a, b, c;
            double area , volumen , diagonal;
    
            System.out.println ("Valor de la longitud lado  A: ");
            a = lector.nextInt();
    
            System.out.println ("Valor de la longitud lado  B: ");
            b = lector.nextInt();
    
            System.out.println ("Valor de la longitud lado  C: ");
            c = lector.nextInt();
    
            area = 2*(a*b + a*c + b*c);
            volumen = a*b*c;
            diagonal = (Math.sqrt(a*a + b*b + c*c));
    
            System.out.println ("Area del ortoedro : " + area + "unidades cuadradas.");
            System.out.println ("Volumen del ortoedro : " + volumen + "unidades cuadradas.");
            System.out.println ("Diagonal del ortoedro : " + diagonal + "unidades cuadradas.");
    
            lector.close();
        }
    }

        
       