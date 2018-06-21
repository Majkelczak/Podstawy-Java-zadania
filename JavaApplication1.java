/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Student2
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
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
