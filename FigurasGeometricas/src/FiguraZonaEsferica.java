import java.util.Scanner;

public class FiguraZonaEsferica {
    public static void main(String[] args) {
       Scanner lector = new Scanner (System.in);

        double altura , radiodeEsfera , radiodelCirculoMayor;
        double volumen, area;

        System.out.println (" Radio de la esfera: ");
        radiodeEsfera = lector.nextDouble();

        System.out.println (" Radio del circulo mayor: ");
        radiodelCirculoMayor = lector.nextDouble();

        System.out.println (" Altura: ");
        altura = lector.nextDouble();

        area= Math.PI*2*(radiodeEsfera * altura);
        volumen = Math.PI*altura*(altura*altura + 3*radiodeEsfera*radiodeEsfera +3*radiodelCirculoMayor*radiodelCirculoMayor)/6;

        System.out.println (" Area de la zona esferica : " + area + " unidades cuadradas.");
        System.out.println (" Volumen de la zona esferica : " + volumen + " unidades cuadradas.");

        lector.close();
    }
}
}
