import Pojazd_i_klasy_pochodne.*;
import java.util.Random;    //zaimportowanie klasy random do losowania wartości i pakietu z moimi klasami

public class Main {

    public static Pojazd losowanie(){   //funkcja losowanie, losująca przykładowe Pojazdy (bardziej kwestia wizualna niż poprawne działanie klas)
        Random random = new Random();
        String[] tablica_imion = {"Jan", "Krzysztof", "Wojciech", "Łukasz", "Andrzej", "Paulina", "Kamila", "Marzena", "Klaudia", "Julia"}; //tablica z przykładowymi imionami
        String[] tablica_nazwisk = {"Kowal", "Jaworek", "Buczak", "Ciepły", "Smolarczyk", "Kaczmarek", "Dudek", "Brudnik", "Cybulak", "Hawrysz"}; //tablica z przykładowymi nazwiskami
        String[] tablica_nadwozia = {"sedan", "kombi", "hatch-back","pick-up", "kabriolet", "SUV"}; //tablica z przykładowymi typami nadwozie
        String[] tablica_kolorów = {"czerwony", "niebieski", "biały", "czarny", "srebrny", }; //tablica z przykładowymi kolorami
        String[] tablica_kodów = {"DOA", "DWR", "DKL", "DGL", "DJE"}; //przykładowe pierwsze części nr. rejestracyjnego
        String[] tablica_modeli = {"A","B","C","D","E","F","G","H","I","J","K"}; //przykładowe modele
        int losowanie_imienia = random.nextInt(tablica_imion.length);       //losowanie przy pomocy random które miejsce tablicy zostanie wybrane do stworzenia Pojazdu
        int losowanie_nazwiska = random.nextInt(tablica_nazwisk.length);
        int losowanie_nadwozia = random.nextInt(tablica_nadwozia.length);
        int losowanie_kolorów = random.nextInt(tablica_kolorów.length);
        int losowanie_modelu = random.nextInt(tablica_modeli.length);
        int losowanie_kodu = random.nextInt(tablica_kodów.length);
        String losowanie_nr_rejestracyjnego = Integer.toString(random.nextInt(899)+100); //losuje drugą część kodu rejestracyjnego
        String losowanie_pesel = Integer.toString(random.nextInt(90)+10) + "0" + Integer.toString(random.nextInt(9)+1) + Integer.toString(random.nextInt(18)+10) + Integer.toString(random.nextInt(90000)+10000);  //przyjmujemy kilka uproszczeń w losowaniu peselu (miesiące 1-9, rok urodzenia 1910-1999, dzień 10-28), brak uwzględnienia płci, niepoprawna cyfra kontrolna, możliwość powtarzania się peselu (znikoma szansa)
        Osoba losowanie_właściciela =new Osoba(losowanie_pesel, tablica_imion[losowanie_imienia], tablica_nazwisk[losowanie_nazwiska]); //stworzenie właściciela tutaj zamiast w konstruktorze pojazdu dla większej przejrzystości
        boolean samochód_czy_motocykl = random.nextBoolean(); //boolean od którego zależy czy wygenerowany zostanie Samochód czy motocykl (boolean bo są tylko dwie możliwości)
        if(samochód_czy_motocykl){ //genereowanie Samochodu lub motocyklu w zależności od booleana, dla większej ilości podklas Pojazd'u lepszy byłby switch
            return new Samochod(tablica_nadwozia[losowanie_nadwozia],losowanie_właściciela, tablica_modeli[losowanie_modelu], tablica_kodów[losowanie_kodu] + " " + Integer.toString(random.nextInt(899)+100));
        }
        else{
            return new Motocykl(losowanie_właściciela, tablica_modeli[losowanie_modelu], tablica_kodów[losowanie_kodu] + " " + Integer.toString(random.nextInt(899)+100), tablica_kolorów[losowanie_kolorów]);
        }
    } //metoda losowanie()
    public static void main(String[] args){ //metoda main
        int poczatkowy_rozmiar_wykazu = 20; //rozmiar tabeli do której zostaną wprowadzone losowe Pojazdy
        Pojazd[] poczatkowa_tab = new Pojazd[poczatkowy_rozmiar_wykazu];
        for (int i=0; i<poczatkowy_rozmiar_wykazu; i++){    //wprowadzenie losowych pojazdów do tabeli
            poczatkowa_tab[i] = losowanie();
        }
        WykazPojazdow wykaz = new WykazPojazdow(poczatkowa_tab); //stworzenie obiektu klasy WykkazPojazdów z tabeli, która ma w sobie losowe pojazdy
        System.out.println(wykaz.toString());   //wyświetlenie wykazu
        Osoba wlasciciel_do_dodania = new Osoba("12345678901", "Jan", "Sobieski"); //stworzenie osoby poza konstruktorem pojazdu dla ptzejrzystości
        Samochod do_dodania = new Samochod("limuzyna", wlasciciel_do_dodania, "cybertruck", wykaz.getWykaz_pojazdow()[2].getNr_rejestracyjny()); //Stworzenie testowego pojazdu do sprawdzenie metody .addPojazd(), w przypadku aktualnego nr_rejestracyjengo, testowy pojazd nie jest dodawany
        wykaz.addPojazd(do_dodania); //dodanie testowego pojazdu
        System.out.println(wykaz.toString()); //wyświetlenie pojazdu po dodaniu

    } //metoda main
} //klasa Main
