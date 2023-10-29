public class Osoba{
    private String ime=null;
    private String prezime=null;
    Osoba(String a, String b){
        this.ime=a;
        this.prezime=b;
    }
    Osoba(){

    }
    public String getIme(){
        return ime;
    }
    public String getPrezime(){
        return prezime;
    }
    public void setIme(String i){
        this.ime=i;
    }
    public void setPrezime(String p){
        this.ime=p;
    }

}