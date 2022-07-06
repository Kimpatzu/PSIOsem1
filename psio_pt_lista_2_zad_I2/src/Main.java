//oblicz sumę cyfr  danej liczby naturalnej K

import java.util.Scanner;       //zaimportowanie klasy Scanner z biblioteki"util"javy
import java.util.ArrayList;     //zaimportowanie klasy ArrayList w celu dynamicznego  tworzenia tablic

public class Main {             //klasa główna Main
    public static void main(String[] args){         //metoda main
        Scanner scanner = new Scanner(System.in);   //stworzenie obiektu klasy Scanner
        long K = scanner.nextInt();                 //wczytanie z klawiatury liczby K
        long dzielnik = 10;                         //zainicjowanie dzielnika
        int suma=0;                                 //zainicjowanie sumy
        ArrayList<Long> tablica = new ArrayList<Long>();       //stworzenie dynamicznej tablicy typu long
        int i=0;
        while(dzielnik/10<K){                       //pętlą działająca tak długo aż dzielnik nie jest większy o 2 rzędy od K, czyli np 1000 dla K=83
            tablica.add(i++, (K%dzielnik)/(dzielnik/10));      //dodawanie do tabeli kolejnych cyfr liczby K
            dzielnik=dzielnik*10;   //dzielnik jako iterator
        }
        for (int j=0; j<tablica.size(); j++){ //pętla przeglądająca tablicy (ilość powtórzeń zależna od wielkości tablicy)
            suma+=tablica.get(j); //pomimo, że tablica jest przeglądana od 0, to pierwsze wartości są ostatnimi cyframi K
        }
        System.out.println(suma); //wyświetlenie sumy cyfr liczby K
    }
}
