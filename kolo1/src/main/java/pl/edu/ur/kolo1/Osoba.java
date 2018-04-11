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
 * 
 */
public class Osoba {
    
    private String imie;      
    private String nazwisko;  
    private int wiek;
    private int wzrost;
    private float waga;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getWzrost() {
        return wzrost;
    }

    public void setWzrost(int wzrost) {
        this.wzrost = wzrost;
    }

    public float getWaga() {
        return waga;
    }

    public void setWaga(float waga) {
        this.waga = waga;
    }

    public Osoba(String imie, String naziwsko){
        this.imie=imie;
        this.nazwisko=naziwsko;
    }
    public Osoba(String naziwsko, int wiek){
        this.nazwisko= naziwsko;
        this.wiek= wiek;
    }
    
   public void PokazDane(){
 
        System.out.println("Imie: "+this.imie);
        System.out.println("Nazwisko: "+this.nazwisko);
        
}
static void dane() {
     Scanner scan = new Scanner(System.in);
      System.out.println("Podaj imie i nazwisko");
      String imie = scan.next();
      String nazwisko = scan.next();
      
}  
}
