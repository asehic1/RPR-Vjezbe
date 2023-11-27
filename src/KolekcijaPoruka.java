import java.util.List;
import java.util.*;

public class KolekcijaPoruka {
    private List<String> poruke;

    public KolekcijaPoruka(List<? extends preds> p) {

        List<String> l=new ArrayList<>(p.size());
        this.poruke=l;
        // Postavljanje niza poruka na vrednosti poziva metode predstavi() za svaki element liste
        for (int i = 0; i < p.size(); i++) {
            this.poruke.get(i) = p.get(i).predstavi();
        }
    }

    public List<String> getPoruke() {
        return poruke;
    }
}
