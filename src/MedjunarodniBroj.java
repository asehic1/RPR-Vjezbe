import java.util.Objects;
public class MedjunarodniBroj extends TelefonskiBroj{
    private String drzava;
    private String broj;

    public MedjunarodniBroj(String drzava, String broj) {
        this.drzava = drzava;
        this.broj = broj;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String ispisi() {
        if(drzava != null && broj != null){
            return drzava+broj;
        }else{
            return null;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(drzava, broj);
    }
}
