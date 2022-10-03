import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner console = new Scanner(System.in);
        Double faren, celc;
        System.out.println("Informe a temperatura em graus Fahrenheit: ");
        faren = console.nextDouble();
        celc = 5 * ((faren - 32) / 9);
        
        System.out.println("A temperatura em graus Celsius é de: " + celc );
    }
}
