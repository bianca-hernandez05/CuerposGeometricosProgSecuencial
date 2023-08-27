 import java.util.Scanner;

public class FiguraCasqueteEsferico {
    public static void main(String[] args)  {
       Scanner lector = new Scanner (System.in);
       
       double area, volumen;
       double radiodeEsfera, altura;

       System.out.println (" Radio de la Esfera: ");
       radiodeEsfera = lector.nextDouble();

       System.out.println (" Altura: ");
       altura = lector.nextDouble();

       area = Math.PI *2*(radiodeEsfera*altura);
       volumen = Math.PI *altura*altura*(3*radiodeEsfera-altura)/3;

       System.out.println (" El area del casquete esferico es : " + area + "unidades cuadradas.");
       System.out.println (" El volumen del casquete esferico es : " + volumen + "unidades cuadradas.");

       lector.close();
    }
}
}
