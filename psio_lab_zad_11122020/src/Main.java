import wykaz_klasy_wyswietlane.*;

public class Main {
    public static void main(String[] args){
        Osoba osoba1 = new Osoba("Jan", "Sobieski", "12345678901", 234.23);     //tworzenie obiektów testowych pod wycieczke
        Osoba osoba2 = new Osoba("Bolesław", "Chrobry", "10987654321", 123.45);
        Osoba osoba3 = new Osoba("Władysław", "Jagiełło", "12312312312", 321.97);
        Osoba[] uczestnicy = new Osoba[3];
        uczestnicy[0] = osoba1;
        uczestnicy[1] = osoba2;
        uczestnicy[2] = osoba3;
        String program_wycieczki = "zwiedzanie lasu" +"\n" + "zwiedzanie lasu" + "\n" + "więcej zwiedzania lasu";
        Wycieczka wycieczka_na_podlasie = new Wycieczka(program_wycieczki, uczestnicy);                     //tworzenie wycieczki
        Towar towar1 = new Towar("mydło", 12.99, 9.99);                 //tworzenie obietków testowych pod promocje
        Towar towar2 = new Towar("Baton czekol", 2.49,2.00);
        Towar towar3 = new Towar("napój", 4.99, 4.50);
        Towar[] produkty = new Towar[3];
        produkty[0] = towar1;
        produkty[1] = towar2;
        produkty[2] = towar3;
        String nazwa_prom = "promocja_przedświąteczna";
        Promocja prom1 = new Promocja(nazwa_prom, produkty);                                               //tworzenie promocji
        Wykaz wykaz1 = new Wykaz(wycieczka_na_podlasie);        //stworzenie wykazów od wycieczki i promocji a następnie wyświetlenie ich
        Wykaz wykaz2 = new Wykaz(prom1);
        System.out.println(wykaz1.toString());
        System.out.println(wykaz2.toString());
    }
}
