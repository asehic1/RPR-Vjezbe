
import java.util.Scanner;
public class fakt{

        public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);
            System.out.println("Unesite broj: ");
            double n = scanner.nextDouble();
            int f=10;

            int faktorijel = 1;
            for (int i=1; i<=f; i++) {
                faktorijel *= i;
            }
            System.out.println("Faktorijel broja " + f + " je: " + faktorijel);

            // Računanje sinusa
            double sinus = Math.sin(n);
            System.out.println("Sinus broja " + f + " je: " + sinus);
        }
}




