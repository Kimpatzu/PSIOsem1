import java.util.Random;
import java.util.Scanner;
import objects.*;

public class Main {
    public static int[] generowanieTablicy(int n){  //metoda do generowania losowych tablic
        int[] tab = new int[n];
        Random random = new Random();
        for (int i=0; i<n; i++){
            tab[i]= random.nextInt(200)-100;
        }
        return tab;
    } //generowanieTablicy
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość elementów w tablicy: ");
        int n = scanner.nextInt();
        int[] przyklad = {1,2,3,4};      //generowanie obiektu typu Tablicy przy pomocy tablicy przyklad, pozwalajace na ustawienie konkretnych watosci
        Tablica tablica = new Tablica(generowanieTablicy(n));            //zamiast przyklad można wpisac generowanieTablicy(n) , by wygenorowała się losowa tablica n elementów o wartości z przedziału -100;100
        System.out.println("Zawartość tablicy: " + "\n");
        System.out.println(tablica);
        System.out.println("Suma elementów tablicy: " + "\n");
        System.out.println(tablica.getSumaElementów());
        System.out.println("Najwyższa wartość w tablicy");
        System.out.println(tablica.getMaksymalnaWartosc());
        System.out.println("Indeks najwyższej wartości: ");
        System.out.println(tablica.getIndeksMaksymalnejWartosci());
        System.out.println("Podaj zakres szukania: ");
        int zakres = scanner.nextInt();
        System.out.println("Podaj szukaną wartość: ");
        int wartosc = scanner.nextInt();
        if (tablica.czyJestwNPoczatkowychElementow(zakres,wartosc)){
            System.out.println("Znajduje sie");
        } else System.out.println("Nie znajduje sie");
        System.out.println("Jest Różnowartosciowa: " + tablica.czyRoznowartosciowa());
        System.out.println("Jaką wartość chcesz usunąć: ");
        int wartoscDoUsuniecia = scanner.nextInt();
        tablica.usunWystapienia(wartoscDoUsuniecia);
        System.out.println(tablica);
        tablica.usunPowtorzenia();
        System.out.println("Tablica bez powtórzeń: " + "\n");
        System.out.println(tablica);
    } //main
} // Main
