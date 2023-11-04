public enum Grad {
    TRAVNIK("038"),
    ODZAK("031"),

    ZENICA ("032"),

    SARAJEVO ("033"),
    LIVNO ("034"),
    TUZLA ("035"),
    MOSTAR("036"),
    BIHAC("037"),
    GORAZDE("038"),
    POSUSJE("039"),

    BRCKO ("049"),
    MRKONJIC_GRAD("050"),
    BANJA_LUKA ("051"),
    PRIJEDOR("052"),
    DOBOJ ("053"),
    SAMAC("054"),
    BIJELJINA("055"),
    ZVORNIK("056"),

    PALE("057"),
    FOCA ("058"),
    TREBINJE("059");
    public String pozivniBroj;
    public String getPozivniBroj() { return this.pozivniBroj; }
    public static Grad izPozivnog (String pozivni) {
        for (Grad g : Grad.values()) {
            if (g.equals(pozivni)) {
                return g;
            }
        }


        return null;
    }





    Grad(String pozivniBroj) {
        this.pozivniBroj = pozivniBroj;
    }

    public void setPozivniBroj(String pozivniBroj) {
        this.pozivniBroj = pozivniBroj;
    }
}
