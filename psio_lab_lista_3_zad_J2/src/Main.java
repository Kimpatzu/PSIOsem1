import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int[] tworzenieZbioru(int n, int k){
        int[] zbior = new int[n];
        int i = 0;
        int nowy_element;
        boolean juz_byl = false;
        Random random = new Random();
        while (i<n){
            nowy_element = (int)(1+(random.nextFloat()*k));
            for (int j=0; j<=i; j++){
                if(zbior[j] == nowy_element){
                    juz_byl = true;
                    break;
                }
            }
            if (!juz_byl){
                zbior[i] = nowy_element;
                i++;
            }
            juz_byl = false;
        }
        return zbior;
    }
    public static void wyswietl(int[] tab){
        for (int i=0; i< tab.length; i++){
            System.out.println(tab[i]);
        }
    }
    public static void wyswietlWOdwrotnejKolejnosci(int[] tab){
        for (int i= tab.length-1; i>=0 ; i--){
            System.out.println(tab[i]);
        }
    }
    public static void main(String[] args){
        int n = 20;
        int k = 30;
        int[] ciag = new int[n];
        int[] zbior = new int[n];
        for (int i=0; i<n; i++){
            ciag[i] = (2*((i+1) + (i+1)*(i+1)));
        }
        zbior = tworzenieZbioru(n,k);
        System.out.println("---------------------------------------");
        wyswietl(ciag);
        System.out.println("---------------------------------------");
        wyswietlWOdwrotnejKolejnosci(ciag);
        System.out.println("---------------------------------------");
        wyswietl(zbior);
        System.out.println("---------------------------------------");
        wyswietlWOdwrotnejKolejnosci(zbior);
        System.out.println("---------------------------------------");
    }
}
