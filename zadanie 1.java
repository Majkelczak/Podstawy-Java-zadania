//Laborki 2
package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        // TODO code application logic here
    /* zad 1    
        int a = 0;
        int b = 0;
        
     Scanner r = new Scanner(System.in);
     System.out.println ("Podaj pierwszą liczbę;");
     a = r.nextInt();
     System.out.println ("Podaj drugą liczbę;");
     b = r.nextInt();
     
     for (int i=a; i<=b; i++)
     {
         if (i%5==0 ||i%7==0 || i%11==0)
         {System.out.println (i);}
     }
     */
    
	/* zad 2
	Scanner r=new Scanner(System.in);
        double a=0;
        double b=0;
        double c=0;
        double delta=0;
        System.out.println("Podaj a");
        a=r.nextDouble();
        System.out.println("Podaj b");
        b=r.nextDouble();
        System.out.println("Podaj c");
        c=r.nextDouble();
        
        if(a==0)
            System.out.println("To nie jest funkcja kwadratowa");
        else 
        {
            delta=b*b-4*a*c;
            System.out.println("Delta wynosi " + delta);
            if(delta>0)
				{
                System.out.println("x1= " + (-b-Math.sqrt(delta))/(2*a));
                System.out.println("x2= " + (-b+Math.sqrt(delta))/(2*a));
				}
				else if(delta==0)
					{
					System.out.println("x0= " + ((-b)/(2*a)));
					}else if(delta<0)
					{
						System.out.println("Brak rozwiązań");
					}
        }*/
        
     /* zad 3   
     double n =0;
     double a=2;
     double b=3;
     
     Scanner r = new Scanner(System.in);
     System.out.println ("Podaj liczbę;");
     n = r.nextInt();
     
     for (double i=0; ; i++)
     { a = a*2;
     if (a<n)
     {System.out.println (a);
     }else break;
     }
 
     for (double i=0; ; i++)
     { b = b*3;
     if (b<n)
     {System.out.println (b);
     } else break;
    }
    */
        
       /* zad 4
        
        double a =0;
        double min =0;
        double max =0;
        double sum =0;
        double avg =0;
        Scanner r = new Scanner(System.in);
        System.out.println ("Podaj liczbę;");
        a = r.nextDouble();
        
        for (double i=0; ; i++)
        {
            if (a!=0)
            {System.out.println ("Podaj liczbę;");
            a = r.nextInt();
            
            sum+=a;
            avg = sum/i;
            if (max<= a)
            {max = a;}
            if (min >= a)
            {min = a;}
            }else
            {System.out.println (sum);
             System.out.println (avg);
             System.out.println (min);
             System.out.println (max); 
             break;
            }
        }
        
        */
     
    }
   
}


//Laborki 3

package lab.pkg3;

import java.util.Random;
import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {
     /*  zad 1
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

		*/
		
        /*zad 2
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
       */ 
    }
    
}
