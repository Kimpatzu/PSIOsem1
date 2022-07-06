package Int1;

public class Sinus_x implements Funkcja {
    @Override
    public double f(double x) {
        double suma = 0;
        double mianownik = 1;
        double licznik = x;
        int k = 1;
        while (licznik / mianownik > 0.0000000001f) { //pętla wykonująca się tak długo, jak kolejne wyrazy sumy są większe od pewnej wartości granicznej (liczenie dalej nnie ma sensu, bo praktycznie nie zmienia wyniku)
            if ((k - 1) % 2 == 0) {    //if sprawdzający dla wcześniej wyliczonego wyrazu licznik/mianownik w jakiej postaci jest (-1)^k (może być +1 zamiast -1, ponieważ liczymy resztę z dzielenia przez 2)
                suma += licznik / mianownik;
            } else {
                suma -= licznik / mianownik;
            }
            licznik = licznik *  x *  x; //przygotowanie mianownika i licznika kolejnego  elementu sumy
            mianownik = mianownik * 2 * k * (2 * k + 1);
            k++;
        }
        return suma;
    }
    @Override
    public String wzor () {
        return "f(x)=sinx";
    }
}

