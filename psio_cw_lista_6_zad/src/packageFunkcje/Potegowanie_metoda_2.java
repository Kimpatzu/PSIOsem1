package packageFunkcje;
import java.util.ArrayList;

import java.util.ArrayList;

public class Potegowanie_metoda_2 extends MetodaPotegowania implements Potegowanie{
    ArrayList<Integer> kroki;
    public Potegowanie_metoda_2(float x, int n){
       super(x,n);
    }

    @Override
    public float policz_potege() { //metoda wykonująca potęgowanie, przyjmuje podstawę X i wykładnik K
        float wynik = this.getX(); //podstawienie do zmiennej wynik wartość X, X w sam w sobie jest potrzebny później
        this.kroki = new ArrayList<Integer>(); //tworzenie obiektu typu arraylist do przechowywania kolejnych kroków potęgowania
        int K = this.getN();
        if (K == 1) { //przypadek gdy wykładnik=1
            return this.getX();
        }
        if (K == 0) { //przypadek gdy wykładnik=0
            return 1.0f;
        }
        while (K != 1) { //pętla zapisująca liczbę króków.
            if (K % 2 == 1) {    //Jeśli wykładnik K jest nieparzysty odejmuje 1
                kroki.add(1);
                K--;
            }
            if (K % 2 == 0) { //jeśli wykładnik jest parzysty, dzieli go przez dwa
                kroki.add(2);
                K = K / 2;
            }
        }

        for (int i = 0; i < kroki.size(); i++) { //pętla wykonująca kroki zgodnie z informacją zawartą w pętli
            if (kroki.get(kroki.size() - i - 1) == 1) { //pomnożenie jakiejś potęgi X przez X zwiększa wykładnik o 1
                wynik = wynik * this.getX();
            }
            if (kroki.get(kroki.size() - i - 1) == 2) {    //podniesienie jakiejś potęgi X do kwadratu (wymnożenie wykładnika przez 2)
                wynik = wynik * wynik;
            }
        }
        return wynik;
    }

    @Override
    public String wypisz_kroki() {
        String output = "";
        for (int i=0; i<kroki.size(); i++){ //pętla pokazująca zawartość obiketu kroki
            output += "tablica i ="+i+ " : " +kroki.get(i) + "\n";
        }
        return output;
    }
}
/*
program wykonujący potęgowanie, z najmniejszą liczbą mnożeń,
przykładowo wykonuje mniej niż 10 mnożeń dla wykładnika = 5687
Wyjaśnie programu dla wykłanika 56:
liczba 56 jest parzysta, dzielimy ją przez 2
liczba 28 (56/2) jest parzysta, dzielimy ją przez 2
liczba 14 (28/2) jest parzysta, dzielimy ją przez 2
liczba 7 (14/2) jest nieparzysta, odejmujemy od niej 1
liczba 6 (7-1) jest parzysta, dzielimy ją przez 2
liczba 3 (6/2) jest nieparzysta, odejmujemy od niej 1
liczba 2 (3-1) jest parzysta, dzielimy ją przez 2
liczba 1 jest punktem w którym przestajemy robić listę króków
liczbę 56 możemy zapisać jako:
((((((1*2)+1)*2)+1)*2)*2)*2= ((((3*2)+1)*2)*2)*2 = ((7*2)*2)*2 =(14*2)*2=28*2=56
z tej listy kroków program "wie", że x^56 możemy zapisać jako
((((((x^2)*x)^2)*x)^2)^2)^2=x^56
 */