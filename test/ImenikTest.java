import junit.framework.TestCase;

public class ImenikTest extends TestCase {
private static Imenik imenik=new Imenik();
    public static void setup(){
        imenik.dodaj("Amar", new FiksniBroj("Grad.SARAJEVO, "111-111));

    }
    public void testdajBroj() {
        String broj=Imenik.dajBroj("Amar");
        assertEquals(broj, "033/111-111");
    }

    public void testdajBrojnf() {
        String broj=Imenik.dajBroj("Amarrrr");
        assertNull(broj);
    }

    public void testDodaj() {
    }

}