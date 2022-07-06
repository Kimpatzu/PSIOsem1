package wykaz_klasy_wyswietlane;

public class Towar {
    private String nazwa;
    private double cena_podstawowa;
    private double cena_promocyjna;

    public Towar(String nazwa, double cena_podstawowa, double cena_promocyjna) {
        this.nazwa = nazwa;
        this.cena_podstawowa = cena_podstawowa;
        this.cena_promocyjna = cena_promocyjna;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena_podstawowa() {
        return cena_podstawowa;
    }

    public double getCena_promocyjna() {
        return cena_promocyjna;
    }
}
