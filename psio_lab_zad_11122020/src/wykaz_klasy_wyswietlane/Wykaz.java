package wykaz_klasy_wyswietlane;

public class Wykaz {
    private ListaDanych wykaz;

    public Wykaz(ListaDanych wykaz) {
        this.wykaz = wykaz;
    }
    public String toString(){   //wykaz zwraca wszystko czego potrzebujemy metodą toString
        String output="";
        output += wykaz.getTytul_zestawienia() + "\n";
        output += wykaz.getNaglowek_zestawienia() + "\n";
        for (int i=0; i< wykaz.getRozmiar_zestawienia(); i++){
            output += wykaz.getWiersz_zestawienia(i) + "\n";
        }
        output += wykaz.getDodatkowe_informacje() + "\n";
        return output;
    }
}
