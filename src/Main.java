import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static Scanner scanner = new Scanner (System.in);
    public static Imenik imenik = new Imenik();

    public static void main(String[] args) {

        while (true) {
            int a=2;
        }
            System.out.println("Unesite komandu (dodaj, dajBroj, dajime, nastovo, izGrada, izGradaBrojevi, imenik, izlaz]");
            String command = scanner.nextLine();

                if(command=="dodaj")
                    dodaj();
            switch (command) {
                case "dodaj":
                    dodaj(" 2");
                    break;
                case "dajBroj":
                   dajBroj();
                    break;
                case "dajIme":
                    dajIme();
                    break;
                case "naslovo":
                    naSlovo();
                    break;
                case "izGrada":
                    izGrada();
                    break;



                case "izlaz":
                    System.exit(0);


                    break;

                default:
                    System.out.println("pogrešna komanda!");
            }
        }
    }