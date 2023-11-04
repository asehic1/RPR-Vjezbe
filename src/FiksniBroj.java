import java.util.Objects;

public class FiksniBroj extends TelefonskiBroj{
    private String broj;
    private Grad grad;

    public FiksniBroj(Grad grad, String broj) {


        this.broj = broj;
        this.grad = grad;
    }

    @Override
    public String ispisi() {
        if(grad != null && broj != null){
            return grad.getPozivniBroj()+"/"+broj;
        }else{
            return null;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FiksniBroj that = (FiksniBroj) o;
        return Objects.equals(broj, that.broj) && grad == that.grad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(broj, grad);
    }

    public String getBroj() {
        return broj;
    }

    public Grad getGrad() {
        return grad;
    }
}
