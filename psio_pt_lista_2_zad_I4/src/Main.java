import java.util.Scanner; //zaimportowanie klasy Scanner z biblioteki "util" javy

public class Main {     //klasa Main
    public static void main(String[] args){ //metoda main
        Scanner scan = new Scanner(System.in);  ///obiekt scan klasy Scanner
        System.out.println("podaj liczbę  naturalną K: "); //wyświetlenie prośby o K
        long K = scan.nextLong(); //wczytanie K
        int max = 0; //inicjacja max
        long reszta = 0; //inicjacja reszty
        long i = 10; //inicjacja iteratora
        int pom=0; //zmienna pomocnicza do przechowywania kolejnych cyfr
        while(K>i){ //pętla poruszająca się po kolejnych cyfrach
            pom = (int)((K%i-reszta)/(i/10)); //pom przechowuje kolejne cyfry liczby K
            reszta=K%i; //reszta przechowuje reszte z dzielenia
            i*=10;
            if(pom>max){ //szukanie największej cyfry
                max=pom;
            }
        }
        System.out.println(max); //wyświetlenie największej cyfry
    } //metoda main
} //klasa Main
