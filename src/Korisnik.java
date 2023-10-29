public class Korisnik extends Osoba {
    private Racun r;
    public Korisnik(){
    }
    public Korisnik(String i, String p){
       super(i,p);
    }
    public Korisnik(String ime, String prezime, Racun rr){
        super(ime, prezime);
        this.r=rr;
    }
}
