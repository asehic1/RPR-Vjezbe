public class Ocjena {
    private LicneInformacije osoba;
    private int ocjena;

    public void setOcjena(int ocjena) {
        this.ocjena = ocjena;
    }

    public Ocjena(LicneInformacije osoba, int ocjena) {
        this.osoba = osoba;
        this.ocjena = ocjena;
    }

    public int getOcjena() {
        return ocjena;
    }
}
