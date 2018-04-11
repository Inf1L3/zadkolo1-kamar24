package pl.edu.ur.kolo1;

import java.util.Scanner;

/**
 *
 * @author Lkusta
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO Uruchomienie zadań/stworzenie i działanie na obiektach
    Zadanie1.zadanie1();
    Zadanie2.zadanie2();
    Zadanie3.zadanie3();
    
     Scanner scan = new Scanner(System.in);
      System.out.println("Podaj imie i nazwisko");
      String imie = scan.next();
      String nazwisko = scan.next();
      
      Osoba student1=new Osoba(imie,nazwisko);
      student1.PokazDane();
    }
    
}
