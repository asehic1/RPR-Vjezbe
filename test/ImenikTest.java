import junit.framework.TestCase;

public class ImenikTest{
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
        TelefonskiImenik br= new MobilniBroj(61, "777-777");
        imenik.dodaj("thor", br);
        String a=dajBroj("thor");
        assertEquals(a,"061-777-777");
    }
    public void testMockExternal(){
        Imenik i = Mockito.nock(Imenik.class);
        Mockito.when(i.dajBroj("Eldar")).thenReturn("Nema nista"):
        String test = i.dajBroj("Eldar");
        assertEquals (test, "Nema nista"):
    }

    @Test
    public void testMockInternal(){
        Map<String, TelefonskiBroj> mapa = Mockito.mock(Map.class) ;
        Mockito.when(mapa.get ("Eldar")).thenReturn (new FiksniBroj (Grad.MOSTAR, "225-883"));
        imenik.setBrojevi(mapa);

        String br = imenik.dajBroj ("Eldar");
                assertNotEquals(br, "033/225-883");
                assertEquals(br, 036/225-883");

}       }