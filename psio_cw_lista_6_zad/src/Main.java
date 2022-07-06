import packageFunkcje.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj x");
        float x = scanner.nextFloat();
        System.out.println("Podaj wykładnik");
        int n = scanner.nextInt();
        System.out.println("Wybierz strategię 1 lub 2");
        int decyzja = scanner.nextInt();
        Potegowanie potegowanie;
        if (decyzja ==1){
            potegowanie = new Potegowanie_metoda_1(x,n);
            System.out.println(potegowanie.policz_potege());
            System.out.println(potegowanie.wypisz_kroki());
        }
        else if (decyzja ==2){
            potegowanie = new Potegowanie_metoda_2(x,n);
            System.out.println(potegowanie.policz_potege());
            System.out.println(potegowanie.wypisz_kroki());
        }

    }
}
