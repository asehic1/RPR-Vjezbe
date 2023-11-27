import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Primer korišćenja
        LicneInformacije osobaInfo = new LicneInformacije();
        MozeOcijeniti objekat = x -> new Ocjena(osobaInfo, x);

        System.out.println("Unesite ocjenu (između 1 i 9):");
        int ocjena = scanner.nextInt();

        System.out.println("Da li ste student? (true/false):");
        boolean isStudent = scanner.nextBoolean();

        if (isStudent) {
            // Student može oceniti i predmet i nastavnika
            System.out.println("Unesite ocjenu za nastavnika (između 1 i 9):");
            int ocjenaNastavnika = scanner.nextInt();
            Ocjena ocjenaZaPredmet = objekat.ocijeni(ocjena);
            Ocjena ocjenaZaNastavnika = objekat.ocijeni(ocjenaNastavnika);

            System.out.println("Ocjena za predmet: " + ocjenaZaPredmet.getOcjena());
            System.out.println("Ocjena za nastavnika: " + ocjenaZaNastavnika.getOcjena());
        } else {
            // Ostali mogu samo oceniti predmet
            Ocjena ocjenaZaPredmet = objekat.ocijeni(ocjena);
            System.out.println("Ocjena za predmet: " + ocjenaZaPredmet.getOcjena());
        }
    }
}