package lab.pkg3;

import java.util.Random;
import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {
     //  zad 1
        int sum=0;
        double avg =0;
        int min =999;
        int max=-999;
        int roz =0;
        int a =0;
        int b =0;
        int c =0;
        Random r = new Random();
        Scanner g =new Scanner(System.in);
        
        System.out.println("Podaj dolny zakres przedziału");
        a=g.nextInt();
        System.out.println("Podaj górny zakres przedziału");
        b=g.nextInt();
        
        int tab[] = new int[10];
        for (int i=0;i<tab.length;i++)
        {   tab[i]= r.nextInt(b-a+1)+a;
            sum +=tab[i];
            avg = ((double)sum /tab.length);
            if(tab[i]>max)
                max=tab[i];
            if(tab[i]<min)
                min=tab[i];
            roz=max-min;
            
        }
        System.out.println("Tablica");
        for (int i =0;i<tab.length;i++)
        {
            System.out.print(tab[i]+" ");
        }
        System.out.println();
        System.out.println("Wyniki");
        System.out.println(sum);
        System.out.println(avg);
        System.out.println(min);
        System.out.println(max);
        System.out.println(roz);

        //zad 2
       int tab2[]=new int[10]; 
        for (int i=1;i<tab.length;i++)
        { tab[i]=c;
            if(tab[i]<tab[i-1])
            {
                tab2[i]=c;
            }
        }
        System.out.println("Tablica");
        for (int i =0;i<tab.length;i++)
        {
            System.out.print(tab2[i]+" ");
        }
        
    }
    
}
