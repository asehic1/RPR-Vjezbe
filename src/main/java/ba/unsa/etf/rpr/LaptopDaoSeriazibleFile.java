package ba.unsa.etf.rpr;

import java.util.*;
import java.io.*;

public class LaptopDaoSeriazibleFile implements LaptopDao, Serializable{

    private File file;
    private ArrayList<Laptop> laptopi;

    public Laptop getLaptop(String procesor) {
        for(Laptop l : laptopi){
            if(l.getProcesor().equals(procesor)){
                return l;
            }
        }
        return null;
    }

    public LaptopDaoSeriazibleFile(File file) {
        laptopi = new ArrayList<>();
        this.file = file;
    }
    @Override
    public void dodajLaptopUListu(Laptop laptop){
        laptopi.add(laptop);
    }
    @Override
    public void dodajLaptopUFile(Laptop laptop){

            try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
                laptopi.add(laptop);
                outputStream.writeObject(laptopi);
        }catch(Exception e){
                e.printStackTrace();
        }
    }


    @Override
    public void napuniListu(ArrayList<Laptop> laptopi) {
        this.laptopi = laptopi;
    }
    @Override
    public void vratiPodatkeIzDatoteke() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            laptopi = (ArrayList<Laptop>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }



}
