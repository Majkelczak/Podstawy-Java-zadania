package kropkiwm;

import java.io.*;
import java.util.Scanner;

public class KropkiWM {
    /**
     * @param plik
     * @param args the command line arguments
     */
    
    
    public static int kropki(String plik) throws IOException{
        File pliczek = new File(plik);
        FileReader fr = new FileReader(pliczek);
        BufferedReader br = new BufferedReader(fr);
        Scanner sc = new Scanner(pliczek);
        
        int licznik=0;
        int c = 0;
        /*while ((c - fr.read()) !=-1){
            System.out.print((char) c);
        }*/
        String wm = br.readLine();
        while(wm != null){
            wm = br.readLine();
        }
        
        int i=0;
        
        while(wm!=null) {
            System.out.println(wm.charAt(i));
        if(wm.charAt(i)=='.'){
                licznik++;
            }
        i++;
        
        }
        return licznik;
    }
    public static void main(String[] args) throws Exception {
       
       System.out.println(kropki("WM.txt"));
    }
    
}
