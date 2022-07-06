package wykaz_klasy_wyswietlane;

public class Wycieczka implements ListaDanych {
    private String program_wycieczki;
    private Osoba[] wykaz_uczestnikow;

    public Wycieczka(String program_wycieczki, Osoba[] wykaz_uczestnikow) {
        this.program_wycieczki = program_wycieczki;
        this.wykaz_uczestnikow = wykaz_uczestnikow;
    }

    public String getProgram_wycieczki() {
        return program_wycieczki;
    }

    public Osoba[] getWykaz_uczestnikow() {
        return wykaz_uczestnikow;
    }

    @Override
    public String getTytul_zestawienia() { //postanowiłem dać program wycieczki w jej tytule, to jest treści przed tabelą
        return "Program wycieczki: "+ "\n" + program_wycieczki + "\n" + "Uczestnicy Wycieczki";
    }

    @Override
    public String getNaglowek_zestawienia() {
        return "L.p     Imie    Nazwisko    Pesel   Kwota Wpłaty";
    }

    @Override
    public String getWiersz_zestawienia(int i) {
        return (i+1)+"  "+wykaz_uczestnikow[i].getImie()+"   "+wykaz_uczestnikow[i].getNazwisko()+"     "+wykaz_uczestnikow[i].getPesel()+"      "+wykaz_uczestnikow[i].getKwota_wplaty();
    }

    @Override
    public int getRozmiar_zestawienia() {
        return wykaz_uczestnikow.length;
    }

    @Override
    public String getDodatkowe_informacje() { //oblicz a następnie zwraca sumę wpłat
        double suma_wplat=0;
        for (int i=0; i<this.getRozmiar_zestawienia(); i++){
            suma_wplat += wykaz_uczestnikow[i].getKwota_wplaty();
        }
        return "Suma wpłat wszystkich uczestników wycieczki wynosi: " + suma_wplat;
    }
}
