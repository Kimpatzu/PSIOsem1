import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int n = scanner.nextInt();
        System.out.println("Podaj k: ");
        int k = scanner.nextInt();
        Ciag ciag = new Ciag(n);
        Zbior zbior = new Zbior(n,k);
        System.out.println("---------------------------------------");
        ciag.tablica.wyswietl();
        System.out.println("---------------------------------------");
        zbior.tablica.wyswietl();
        System.out.println("---------------------------------------");
        ciag.tablica.wywietlWOdwrotnejKolejnosci();
        System.out.println("---------------------------------------");
        zbior.tablica.wywietlWOdwrotnejKolejnosci();
        System.out.println("---------------------------------------");
        ciag.tablica.podzbiorParzystych().wyswietl();
        System.out.println("---------------------------------------");
        ciag.tablica.podzbiorNieparzystych().wyswietl();
        System.out.println("---------------------------------------");
        zbior.tablica.podzbiorParzystych().wyswietl();
        System.out.println("---------------------------------------");
        zbior.tablica.podzbiorNieparzystych().wyswietl();
        System.out.println("---------------------------------------");
    }
}

