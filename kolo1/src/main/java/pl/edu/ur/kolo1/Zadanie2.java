/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.kolo1;

import java.util.Scanner;

/**
 *
 * @author Lkusta
 */
public class Zadanie2 {
    static void zadanie2(){
        
        System.out.println("Podaj n ciagu");
        Scanner fib=new Scanner(System.in);
        int n=fib.nextInt();
        System.out.println("Suma ciagu: "+ciag(n));
         
        
                
     } 
public static int ciag(int n){
   if(n==1 ||n==2) return 1;
   else return ciag(n-1)+ciag(n-2);
}
}
