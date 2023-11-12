package ba.unsa.etf.rpr;
import ba.unsa.etf.rpr.Laptop;
import java.util.*;
public interface LaptopDao {
    void dodajLaptopUListu(Laptop laptop);
    void dodajLaptopUFile(Laptop laptop);
    Laptop getLaptop(String procesor);
    void napuniListu(ArrayList<Laptop> laptopi);
    void vratiPodatkeIzDatoteke();


}
