public class Pobjednik {
    private String ime;
    private String prezime;
    private int brojZnakova;
    private KolekcijaImena kolekcijaImena;

    public Pobjednik(KolekcijaImena k) {
        this.ime=k.getNajduzeIme();
        int n=ime.length();
        this.brojZnakova=n;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getBrojZnakova() {
        return brojZnakova;
    }
}
