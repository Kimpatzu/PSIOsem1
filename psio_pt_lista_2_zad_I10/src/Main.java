import java.util.Scanner; //zaimportowanie klasy Scanner do wprowadzania danych z konsoli

/*
program obliczający wartości e^x, sin(x) i cos(x) dla wprowadzonych z konsoli wartości x
 */

public class Main { //klasa Main
    public static float e_do_x(float x){ //metoda e_do_x wyliczajająca wartość e^x dla wprowadzonego x
        float mianownik=1; //przygotowanie pierwszych elementów sumy
        float licznik=x;
        int k=1; //iterator
        float suma=1;
        while (licznik/mianownik>0.0000000001f){    //pętla wykonująca się tak długo, jak kolejne wyrazy sumy są większe od pewnej wartości granicznej (liczenie dalej nnie ma sensu, bo praktycznie nie zmienia wyniku)
            suma=suma + licznik/mianownik; //dodanie do sumy obecnej wartości licznik/mianownik
            k++;
            mianownik=mianownik*k; //przygotowanie nowych wartości licznik/mianownik (kolejnego elementu sumy)
            licznik=licznik*x;
        }
        return suma;
    } //metoda e_do_x
    public static float sin_x(float x){ //metoda sin_x obliczająca cosinus wprowadzonej wartości
        float suma=0; //inicjacja sumy, która przechowuje wartość sin(x)(funkcji trygonometrycznej)
        float mianownik =1; //mianownik dla pierwszego wyrazu sumy to 1, a licznik to x
        float licznik =x;
        int k=1; //iterator
        while (licznik/mianownik>0.0000000001f){ //pętla wykonująca się tak długo, jak kolejne wyrazy sumy są większe od pewnej wartości granicznej (liczenie dalej nnie ma sensu, bo praktycznie nie zmienia wyniku)
            if ((k+1)%2==0){    //if sprawdzający dla wcześniej wyliczonego wyrazu licznik/mianownik w jakiej postaci jest (-1)^k (może być +1 zamiast -1, ponieważ liczymy resztę z dzielenia przez 2)
                suma+= licznik/mianownik;
            }
            else{
                suma-= licznik/mianownik;
            }
            licznik= licznik*x*x; //przygotowanie mianownika i licznika kolejnego  elementu sumy
            mianownik = mianownik*2*k*(2*k + 1);
            k++;
        }
        return suma;
    } //metoda sin_x
    public static float cos_x(float x){ //metoda cos_x obliczająca cosinus wprowadzonej wartości
        float suma=0; //inicjacja sumy, która przechowuje wartość cos(x)(funkcji trygonometrycznej)
        int k=1; //iterator
        float licznik= 1; //licznik i mianownik dla pierwszego wyrazu sumy są równe 1
        float mianownik= 1;
        while (licznik/mianownik>0.0000000001f){ //pętla wykonująca się tak długo, jak kolejne wyrazy sumy są większe od pewnej wartości granicznej (liczenie dalej nnie ma sensu, bo praktycznie nie zmienia wyniku)
            if ((k+1)%2==0){ //if sprawdzający dla wcześniej wyliczonego wyrazu licznik/mianownik w jakiej postaci jest (-1)^k (może być +1 zamiast -1, ponieważ liczymy resztę z dzielenia przez 2)
                suma+= licznik/mianownik;
            }
            else{
                suma-= licznik/mianownik;
            }
            licznik = licznik*x*x; //przygotowanie licznika kolejnego elementu
            mianownik = mianownik*(2*k)*(2*k-1);    //przygotowanie mianownika kolejnego elementu
            k++; //post incementacja
        }
        return suma; //zwrócenie sumy, czyli wartości cos(x)
    } //metoda cos_x
    public static void main(String[] args){     //metoda main
        Scanner input = new Scanner(System.in); //obiekt input klasy Scanner do wprowadzenia danych z konsoli
        System.out.println("Podaj x: ");        //wyświetlenie zapytania o wprowadzenie x
        float x = input.nextFloat();            //przyjęcie x typu float z konsoli
        System.out.println(e_do_x(x));          //wyświeetlenie wartości zwracanej przez metode e_do_x po wprowadzeniu do niej x
        System.out.println(sin_x(x));           //wyświeetlenie wartości zwracanej przez metode sin_x po wprowadzeniu do niej x
        System.out.println(cos_x(x));           //wyświeetlenie wartości zwracanej przez metode cos_x po wprowadzeniu do niej x
    } //metoda main
} // class main
