package pliki;    

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Test implements Serializable{
    int pole;
    static int numer = 0;
    public Test(int n){
        pole = n;
        numer++;
    }
    public void metoda(Test t){
        t.pole = 25;
    }
    public void metoda(int x){
        //...
    }
 
    public int getPole(){
        return pole;
    }
    public void setPole(int _pole){
        pole = _pole;
    }
    public static int getNumer(){
        return numer;
    }
    
    @Override
    public String toString(){
        return "abc";
    }
}
class Test2 extends Test{
    public Test2(){
        super(10);
        super.metoda(4);
    }
}
 
class Plik{
    private FileReader pl;
    
    public Plik(FileReader pl){
        this.pl = pl;
    }
    
    public Plik(String nazwa){
        try {
            pl = new FileReader(nazwa);
        } catch (FileNotFoundException ex) {
        }
    }
    
    public String czytajLinie() throws IOException{
        String linia = "";
        char znak = (char)pl.read();
        while(znak!=-1 && znak!='\n'){
            linia+=znak;
            znak = (char)pl.read();
        }
        return linia;
    }
    
    public String czytajSlowo() throws IOException{
        String linia = "";
        char znak = (char)pl.read();
        while(znak!=-1 && !Character.isWhitespace(znak)){
            linia+=znak;
            znak = (char)pl.read();
        }
        return linia;
    }
}
/* public class JavaApplication12 {
    public static void zapisDoPliku(String nazwa, Test t) throws IOException{
        ObjectOutputStream pl = null;
        try{
            pl = new ObjectOutputStream(new FileOutputStream(nazwa, true));
            
            pl.writeObject(t);
        } finally{
            if(pl!=null){
                pl.close();
            }
        }
    }
    
    public static void odczytZPliku(String nazwa) throws IOException, ClassNotFoundException{
        ObjectInputStream pl = null;
        try{
            pl = new ObjectInputStream(new FileInputStream(nazwa));
            
            Test t = (Test)pl.readObject();
            System.out.println(t.getPole());
            t = (Test)pl.readObject();
            System.out.println(t.getPole());
        } finally{
            if(pl!=null){
                pl.close();
            }
        }
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
        Test t = new Test(10);
        System.out.printf("%d %d\n", t.getPole(), Test.getNumer());
        Test t2 = new Test(100);
        System.out.printf("%d %d\n", t.getPole(), Test.getNumer());
        System.out.printf("%d %d\n", t2.getPole(), Test.getNumer());
 
        System.out.println(t.getPole());
        System.out.println(t2.getPole());
 
        t.metoda(t2);
        
        t2.setPole(99);
        
        System.out.println(t.getPole());
        System.out.println(t2.getPole());
        
        
        Plik p = new Plik("/home/michal/NetBeansProjects/JavaApplication12/src/javaapplication12/JavaApplication12.java");
        System.out.println(p.czytajLinie());
        System.out.println(p.czytajSlowo());
        System.out.println(p.czytajSlowo());
        */
        Test t = new Test(5);
        //System.out.println(t.toString());
        //zapisDoPliku("test.dat", t);
        odczytZPliku("test.dat");
    }
    
}