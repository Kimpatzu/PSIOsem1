package osoba_i_dziedziczące_klasy;

public class PracownikUczelniNaukowoDydaktyczny extends Pracownik {
    private String wydzial;
    private float wartosc_dorobku;
    public PracownikUczelniNaukowoDydaktyczny(String imie, String nazwisko, String pesel, String data_urodzenia, String stanowisko_pracy, int pensja, String wydzial, float wartosc_dorobku) {
        super(imie, nazwisko, pesel, data_urodzenia, stanowisko_pracy, pensja);
        this.wydzial = wydzial;
        this.wartosc_dorobku = wartosc_dorobku;
    }
    public String getWydzial() {
        return this.wydzial;
    }
    public float getWartosc_dorobku() {
        return wartosc_dorobku;
    }

    public String toString(){
        return super.toString() + "\n" + this.wydzial + "\n" + this.wartosc_dorobku;
    }
}
