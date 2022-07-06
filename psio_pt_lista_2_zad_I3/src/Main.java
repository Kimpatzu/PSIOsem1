import java.util.Scanner;       //importowanie klasy Scanner z biblioteki "util" javy
import java.lang.Math;      //importowanie klasy Math z biblioteki "lang" javy

public class Main {     //główna klasa main
    public static void main(String[] args){     //główna metoda main
        Scanner scan = new Scanner(System.in);  //stworzenie obiektu scan klasy Scanner
        System.out.println("Podaj liczbę naturalną K: "); //wyświetlenie prośby o podanie K
        long K = scan.nextLong();       //wczytanie K z klawiatury jako zmienną typu long
        System.out.println("Podaj liczbę naturalną która będzie skalą dokładności liczby K");   //wyświetlenie prośby o podanie dokładności
        long dokladnosc = scan.nextInt();       //wczytanie dokladnosc z klawiatury
        int i=0;        //zainicjowanie iteratora i
        boolean czy_przekracza = false;     //zainicowanie zmiennej czy_przkeracza wskazującej na to czy pod dodaniu/odjęciu dokladnosc od K zmienia się tylko tyle samo cyfr ile ma dokladnosc czy jedna wiecej
        while(dokladnosc>Math.pow(10, i)){  //pętla zwiększająca iterator i jako wykładnika potęgi oo podstawie 10. (np. dla 32 i=2, bo 32<100, dla 345, i=3 itd.)
            i++;
        }
        long pom = K%((long)Math.pow(10, i));   //zmienna pomocnicza pomogająca stwierdzić wartość czy_przekracza
        if ((pom-dokladnosc)<0 || (pom+dokladnosc)>Math.pow(20, i)){
            czy_przekracza = true;
        }
        if (!czy_przekracza){ //jeśli czy_przekracza=false, to odejmuje 1 od i
            i--;
    }
        int ilosc_cyfr_znaczacych =(int)(Math.log10(K)-i); //ilosc cyfr znaczących jest otrzymywane poprzez odjęcie od zrzutowanego na typ int logarytmu o podstawie 10 z K i odjęcie od niego iteratora
        System.out.println("ilosc cyfr znaczących: " + ilosc_cyfr_znaczacych);
    }   //metoda main
}   //class Main
