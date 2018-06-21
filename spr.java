package spr1;

import java.util.Random;

public class Spr1 {

    public static void main(String[] args) {
        //zad 1
        /*   Random r = new Random();
        
        int parz =0;
        int nieparz =0;
        int sumaparz=0;
        int sumanieparz=0;

        int max1 = -999;
        int max2 = -999;
        int max3 = -999;
        
        
        for (int i = 0; i<100;i++)
        {
            int randnum =r.nextInt((100 - (-100))+1)+(-100) ;
            System.out.println(randnum);
            if (randnum %2 ==0 || (randnum < 0 && randnum % 2 == 0))
            {
                parz++;
                sumaparz+=randnum;
            }else
            {
                nieparz++;
                sumanieparz+=randnum;
            }
            
            if (randnum>=0)
            {
                if(randnum>max1 && randnum>max2 &&randnum>max3)
                {   max1=randnum;
                }else if(randnum>max2 && randnum>max3)
                {   max2=randnum;
                }else if (randnum>max3)
                {   max3=randnum;
                }
            }
            else if (max3 == -999)
            {
                System.out.println("Nie ma 3 liczb dodatnich ");
            }
            
         }   
            double avgparz = (double)(sumaparz)/parz;
            double avgnieparz =(double)(sumanieparz)/nieparz;
            
            System.out.println("Średnia parzystych: " + avgparz);
            System.out.println("Średnia nieparzystych: " + avgnieparz);
            System.out.println(parz);
            System.out.println(nieparz);
            System.out.println(max1);
            System.out.println(max2);
            System.out.println(max3);
        */        
            
        int tablica[][] = new int[40][40];
        Random r = new Random();
        for(int i = 0; i < tablica.length; i++) {
            for(int j = 0; j < tablica.length; j++) {
                if(i%2 == 0 || j%2 == 0) 
                     tablica[i][j] = i+j;
                
                tablica[i][j] = r.nextInt(50-(-50)+1) + (-50);
            }
        }
        System.out.println("TABLICA PRZED 'INWERSJ„':");
        for(int i = 0; i < tablica.length; i++) {
            for(int j = 0; j < tablica.length; j++) {
                System.out.print(tablica[i][j]+"\t");
            }
            System.out.println();
        }
        
        for(int i = 0; i < tablica.length; i++) {
            for(int j = 0; j < tablica.length; j++) {
                tablica[i][j] = tablica[i][tablica.length-j-1];
            }
        }
        
        System.out.println("\nTABLICA PO 'INWERSJI':");
        for(int i = 0; i < tablica.length; i++) {
            for(int j = 0; j < tablica.length; j++) {
                System.out.print(tablica[i][j]+"\t");
            }
            System.out.println();
        }

    }
    
}
