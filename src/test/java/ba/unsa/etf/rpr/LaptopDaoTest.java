package ba.unsa.etf.rpr;

import java.util.*;
import java.io.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LaptopDaoTest {

    private LaptopDao laptopDao;
    private File file;

    @BeforeEach
    void setUp() {
        file = new File("testFile.txt");
        laptopDao = new LaptopDaoSerializableFile(file);
    }

    @Test
    void testDodajLaptopUFile() {
        Laptop laptop = new Laptop(/* Inicijalizacija laptopa */);

        // Postavite Mock objekat da simulira ObjectOutputStream
        try (ObjectOutputStream mockOutputStream = Mockito.mock(ObjectOutputStream.class)) {
            Mockito.when(new ObjectOutputStream(Mockito.any())).thenReturn(mockOutputStream);

            // Testirajte metodu dodajLaptopUFile
            laptopDao.dodajLaptopUFile(laptop);

            // Provjerite da li je mockOutputStream.writeObject pozvan s odgovarajućim argumentom
            Mockito.verify(mockOutputStream).writeObject(Mockito.any(ArrayList.class));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testGetLaptop() {
        Laptop laptop1 = new Laptop(/* Inicijalizacija laptopa 1 */);
        Laptop laptop2 = new Laptop(/* Inicijalizacija laptopa 2 */);

        laptopDao.dodajLaptopUListu(laptop1);
        laptopDao.dodajLaptopUListu(laptop2);

        assertEquals(laptop1, laptopDao.getLaptop("procesor1"));
        assertEquals(laptop2, laptopDao.getLaptop("procesor2"));

        // Testiranje situacije kada nema odgovarajućeg laptopa
        assertThrows(NeodgovarajuciProcesorException.class, () -> laptopDao.getLaptop("nepostojeciProcesor"));
    }

    // Dodajte slične testove za druge metode
}