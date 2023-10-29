public class Sat{

    private int h,m,s;
    public Sat(int h, int m, int s)
    {
        postavi(h,m,s);
    }
    public void postavi(int h, int m, int s)
    {
        this.h=h;
        this.m=m;
        this.s=s;
    }
    public void sljedeci() {
        s++;
        if (s == 60) {
            s = 0;
            m++;
        }
        if (m == 60) {
            m = 0;
            h++;
        }
        if (h == 24) h = 0;
    }

    public void prethodni() {
        s--;
        if (s == -1) {
            s = 59;
            m--;
        }
        if (m == -1) {
            m = 59;
            h--;
        }
        if (h == -1) h= 23;
    }


    public void pomjeriZa(int pomak) {
        if (pomak > 0) {
            for (int i = 0; i < pomak; i++) {
                sljedeci();
            }
        } else {
            for (int i = 0; i < -pomak; i++) {
                prethodni();
            }
        }
    }

    public int dajSate() {
        return h;
    }

    public int dajMinute() {
        return m;
    }

    public int dajSekunde() {
        return s;
    }

    public void ispisi() {
        System.out.println(h + ":" + m + ":" + s);
    }

}

