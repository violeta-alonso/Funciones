import java.util.Scanner;

public class Palindromo {
    public static boolean esPalindromo(String texto) {
        String limpio = texto.toLowerCase().replace(" ", "");
        String invertido = new StringBuilder(limpio).reverse().toString();
        return limpio.equals(invertido);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una cadena de texto: ");
        String texto = sc.nextLine();
        
        if (esPalindromo(texto)) {
            System.out.println("Es un palindromo");
        } else {
            System.out.println("No es palindromo");
        }
    }    
}
