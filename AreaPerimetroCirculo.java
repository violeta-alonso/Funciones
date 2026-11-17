import java.util.Scanner;

public class AreaPerimetroCirculo {
    public static double calcularArea(double radio) {
        return 3.1416 * radio * radio;
    }
    
    public static double calcularPerimetro(double radio) {
        return 2 * 3.1416 * radio;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radio del circulo: ");
        double radio = sc.nextDouble();

        System.out.println("Area: " + calcularArea(radio));
        System.out.println("Perimetro: " + calcularPerimetro(radio));
    }   
}
