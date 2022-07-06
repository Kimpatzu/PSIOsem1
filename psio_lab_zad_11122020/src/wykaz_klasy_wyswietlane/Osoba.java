package wykaz_klasy_wyswietlane;

public class Osoba {
    private String imie;
    private String nazwisko;
    private String pesel;
    private double kwota_wplaty;

    public Osoba(String imie, String nazwisko, String pesel, double kwota_wplaty) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.kwota_wplaty = kwota_wplaty;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public double getKwota_wplaty() {
        return kwota_wplaty;
    }
}
