import java.util.*;
import java.io.*;
public class KolekcijaImena {
    private List<String> lista;

    public String getNajduzeIme() {
        String s=new String();
        for(String i : this.lista){
            if(i.length()>s.length()){
                s=i;
            }
        }
        return s;
    }

}
