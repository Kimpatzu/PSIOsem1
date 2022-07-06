import ksztaltki.*;
import java.util.Scanner;

public class Main {

    public static Koszty zlecenie(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę kształtek");
        int liczba_ksztaltek = input.nextInt();
        int typ_figury;
        double promien;
        double bok_a;
        double bok_b;
        double pole=0;
        double obwod=0;
        Figura_zlozona zamowienie = new Figura_zlozona(liczba_ksztaltek);
        for (int i=0; i< zamowienie.getDlugosc(); i++){
            System.out.println("Jakim typem kształki będzie "+(i+1)+" figura?");
            System.out.println("1. Koło");
            System.out.println("2. Prostokąt");
            System.out.println("3. Kwadrat");
            typ_figury = input.nextInt();
            if (typ_figury==1){
                System.out.println("Podaj promień koła: ");
                promien = input.nextDouble();
                zamowienie.setFigura(i, new Kolo(promien));
            } else if (typ_figury==2){
                System.out.println("Podaj pierwszy bok prostokąta: ");
                bok_a = input.nextDouble();
                System.out.println("Podaj drugi bok prostokąta: ");
                bok_b = input.nextDouble();
                zamowienie.setFigura(i, new Prostokat(bok_a,bok_b));
            } else if (typ_figury==3){
                System.out.println("Podaj bok kwadratu: ");
                bok_a = input.nextDouble();
                zamowienie.setFigura(i, new Kwadrat(bok_a));
            }
        }
        for (int i=0; i< zamowienie.getDlugosc(); i++){
            pole += zamowienie.getFigura(i).pole();
            obwod += zamowienie.getFigura(i).obwod();
        }
        System.out.println(obwod);
        System.out.println(pole);
        return new Koszty(obwod, pole);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę zleceń: ");
        int n = input.nextInt();
        Koszty[] koszty = new Koszty[n];
        double suma_kosztów=0;
        for (int i=0; i<n; i++){
            System.out.println("Zlecenie nr. " + (i+1));
            koszty[i] = zlecenie();
            suma_kosztów += koszty[i].getKoszty_produkcji()+koszty[i].getKoszty_materiału();
        }
        for (int i=0; i<n; i++){
            System.out.println("Koszty produkcji " + (i+1) + " zlecenia wynoszą: " + koszty[i].getKoszty_produkcji());
            System.out.println("Koszty materiału " + (i+1) + " zlecenia wynoszą: " + koszty[i].getKoszty_materiału());
        }
        System.out.println("Co razem daje: " + suma_kosztów);
    }
}
