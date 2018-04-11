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
public class Zadanie3 {
    private int tab[];
    static void zadanie3(){
     float s=0;
    int[] tab= new int[10];
    System.out.println("Podaj wart. tablicy:");
    for(int i=0;i<10;i++){
        Scanner a=new Scanner(System.in);
        tab[i]=a.nextInt();
        s=s+tab[i];
        
    }
    System.out.println("Srednia arytmetyczna="+s/10);
    System.out.println("Zawartosc tablicy:");
    
    for(int a=0;a<10;a++){
        System.out.println(a+1+"."+tab[a]);
    }
}
}
