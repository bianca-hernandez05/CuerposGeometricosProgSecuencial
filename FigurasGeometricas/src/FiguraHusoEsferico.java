    import java.util.Scanner;

public class FiguraHusoEsferico {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);

        double HusoEsfericoArea,CuñaEsfericaVolumen, radio, grados;

        System.out.println(" Radio de la esfera: ");
        radio = lector.nextDouble();

        System.out.println(" numero de grados: ");
        grados = lector.nextDouble();

        HusoEsfericoArea = Math.PI *4 *(radio*radio*grados)/360;
        CuñaEsfericaVolumen = 4/3*(Math.PI *radio*radio*radio*grados/360);

        System.out.println(" El area de la esfera es de: " + HusoEsfericoArea + "Unidades Cuadradas.");
        System.out.println(" El Volumen de la esfera es de: " + CuñaEsfericaVolumen + "Unidades Cuadradas.");

        lector.close();
    }
}


}
