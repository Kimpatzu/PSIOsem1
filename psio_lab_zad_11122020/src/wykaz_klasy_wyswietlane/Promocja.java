package wykaz_klasy_wyswietlane;

public class Promocja implements ListaDanych {
    private String nazwa_promocji;
    private Towar[] wykaz_towarow;

    public Promocja(String nazwa_promocji, Towar[] wykaz_towarow) {
        this.nazwa_promocji = nazwa_promocji;
        this.wykaz_towarow = wykaz_towarow;
    }

    public String getNazwa_promocji() {
        return nazwa_promocji;
    }

    public Towar[] getWykaz_towarow() {
        return wykaz_towarow;
    }

    @Override
    public String getTytul_zestawienia() {
        return "Towary objęte promocją" + nazwa_promocji;
    }

    @Override
    public String getNaglowek_zestawienia() { //nagłówek
        return "L.p.    Nazwa towaru    Cena podstawowa     Cena promocyjna";
    }

    @Override
    public String getWiersz_zestawienia(int i) { //zwraca pojedyńczy wiersz zestawienia w zależności od podanego iteratora
        return (i+1)+"  "+wykaz_towarow[i].getNazwa()+"     "+wykaz_towarow[i].getCena_podstawowa()+"   "+wykaz_towarow[i].getCena_promocyjna();
    }

    @Override
    public int getRozmiar_zestawienia() { //rozmiar zestawienia jako długość tablicy towarów
        return wykaz_towarow.length;
    }

    @Override
    public String getDodatkowe_informacje() {       //oblicza kwote średniego rabatu iterując po towarach a następnie ją zwraca
        double suma_cen_prom=0;
        double suma_cen_podst=0;
        int kwota_średniego_rabatu=0;
        for (int i=0; i<wykaz_towarow.length; i++){
            suma_cen_podst += wykaz_towarow[i].getCena_podstawowa();
            suma_cen_prom += wykaz_towarow[i].getCena_promocyjna();
        }
        kwota_średniego_rabatu = (int)(100*((suma_cen_prom-suma_cen_podst)/suma_cen_podst));
        return "Kwota średniego rabatu wynosi: " + kwota_średniego_rabatu + "%";
    }
}
