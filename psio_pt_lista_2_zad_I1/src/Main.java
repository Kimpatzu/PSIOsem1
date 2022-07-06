/*
Program dla ciągu n liczb rzeczywistych oblicza
a)sumę wszystkich liczb ciągu
b) średnią arytmetyczną dodatnich liczb ciągu
c) średnią arytmetyczną liczb występujących bezpośrednio po liczbach dodatnich
 */

import java.util.Scanner; //zaimportowanie klasy Scanner by z biblioteki "util" Javy by moć wczytywać dane z klawiatury

public class Main {

    public static void suma_wszystkich_liczb(float liczby[], int n) { //metoda odpowiedzialna za podpunkt a), przyjmująca argumenty w postaci tablicy z liczbami i zmiennej n określającej ilość liczb
        float suma = 0;                                                //zainicjowanie zmiennej suma
        for (int i = 0; i < n; i++) {                                  //pętla poruszająca się po wszystkich komórka liczby[] i sumująca przechowywane w nich wartości
            suma = suma + liczby[i];
        }
        System.out.println("a)" + suma);                               //wyświetlenie odpowiedzi do podpunktu a
    } //metoda suma_wszystkich_liczb

    public static void srednia_dodatnich(float liczby[],int n){        //metoda odpowiedzialna za b), argumenty takie same
        float suma=0;                                                  //zainicjowanie zmiennej  suma
        int licznik=0;                                                 //zainicjowanie zmiennej licznik liczącej ilość wykonanych sumowań
        for(int i = 0; i<n; i++){                                      //pętla poruszająca się po tablicy
            if(liczby[i]>0){                                           //dodanie do sumy obecnego elementu tablicy tylko liczb dodatnich
                suma = suma + liczby[i];
                licznik++;
            }
        }
        if (licznik==0) System.out.println("b) ciąg nie zawiera liczb dodatnich");  //sprawdzenie czy były jakiekolwiek liczby dodatnie by uniknąć dzielenia przez 0
        else System.out.println("b)" + suma/licznik);                  //wyświetlenie średniej jako odpowiedź do b)
    } //metoda srednia_dodatnich

    public static void srednia_po_dodatnich(float liczby[], int n){    //metoda odpowiedzialna za c), argumenty znowu te same
        float suma=0;                                                  //zainicjalizowanie sumy oraz licznika
        int licznik=0;
        for(int i = 0; i<(n-1); i++){                                  //pętla poruszająca się po tablicy bez ostatniego elementu
            if(liczby[i]>0){                                           //dodanie do sumy następnej liczby gdy obecna jest dodatnia
                suma = suma + liczby[i+1];
                licznik++;
            }
        }
        if (licznik==0) System.out.println("c) ciąg nie zawiera liczb dodatnich"); //obsługa dzielenia przez 0
        else System.out.println("c)" + suma/licznik);                  //odpowiedź do c)
    } //metoda srednia_po_dodatnich


    public static void main(String[] args){                            //główna metoda main
        Scanner scan = new Scanner(System.in);                         //tworzenia narzędzia do pobierania danych z konsoli
        System.out.println("Ile będzie liczb ciągu? ");                //wyświetlenie zapytania o ilość liczb w ciągu
        int n = scan.nextInt();                                        //wczytanie informacji o ilości liczb do zmiennej n
        float liczby[]=new float[n];                                   //inicjalizacja tablicy o wielkości n na kolejne liczby
        for(int i=0; i<n; i++) {                                       //pętla wprowadzająca kolejne liczby do tablicy liczby[]
            System.out.println("Wprowadź " + (i+1) + " liczbę ciągu");
            liczby[i] = scan.nextFloat();
        }
        suma_wszystkich_liczb(liczby, n);                               //wywałanie metody suma_wszystkich_liczb
        srednia_dodatnich(liczby, n);                                   //wywołanie metody srednia_dodatnich
        srednia_po_dodatnich(liczby, n);                                //wywołanie metody srednia_po_dodatnich
    } //metoda główna main
} //class Main
