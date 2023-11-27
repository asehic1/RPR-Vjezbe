import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<String> listaImena = List.of("Ana", "Marko", "Milica");
        KolekcijaImena kolekcijaImena = new KolekcijaImena(listaImena);

        String najduzeIme = kolekcijaImena.getNajduzeIme();
        System.out.println("Najduže ime: " + najduzeIme);

        // Primer korišćenja KolekcijaImenaIPrezimena
        List<String> listaImenaIPrezimena = List.of("Ana", "Marko", "Milica");
        List<String> listaPrezimena = List.of("Anić", "Marković", "Milić");
        KolekcijaImenaIPrezimena kolekcijaIP = new KolekcijaImenaIPrezimena(listaImenaIPrezimena, listaPrezimena);

        int indeksNajduzegPara = kolekcijaIP.getIndexNajduzegPara();
        System.out.println("Indeks najdužeg para: " + indeksNajduzegPara);

        String imeIPrezime = kolekcijaIP.getImeiPrezime(indeksNajduzegPara);
        System.out.println("Najduže ime i prezime: " + imeIPrezime);

        // Primer korišćenja Pobjednik
        Pobjednik pobjednik = new Pobjednik(kolekcijaImena);

        System.out.println("Pobjednik:");
        System.out.println("Ime: " + pobjednik.getIme());
        System.out.println("Prezime: " + pobjednik.getPrezime());
        System.out.println("Broj znakova: " + pobjednik.getBrojZnakova());
    }
}