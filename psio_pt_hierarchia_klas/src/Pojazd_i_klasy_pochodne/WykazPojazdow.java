package Pojazd_i_klasy_pochodne;

public class WykazPojazdow {
    private Pojazd[] wykaz_pojazdow;
    private int maksymalna_liczba_pojazdow;
    public WykazPojazdow(Pojazd[] tablica_pojazdow){
        this.wykaz_pojazdow = tablica_pojazdow;
        this.maksymalna_liczba_pojazdow=20+tablica_pojazdow.length;
    }
    public Pojazd[] getWykaz_pojazdow(){
        return this.wykaz_pojazdow;
    }
    public Pojazd[] getSamochody(){
        int licznik=0;
        for (int i=0; i<this.wykaz_pojazdow.length; i++){
            if (this.wykaz_pojazdow[i] instanceof Samochod){
                licznik++;
            }
        }
        Pojazd[] wykaz_samochodow = new Pojazd[licznik];
        int j=0;
        for (int i=0; i<this.wykaz_pojazdow.length; i++){
            if (this.wykaz_pojazdow[i] instanceof Samochod){
                wykaz_samochodow[j] = this.wykaz_pojazdow[i];
                j++;
            }
        }
        return wykaz_samochodow;
    }
    public Pojazd[] getMotocykle(){
        int licznik=0;
        for (int i=0; i<this.wykaz_pojazdow.length; i++){
            if (this.wykaz_pojazdow[i] instanceof Motocykl){
                licznik++;
            }
        }
        Pojazd[] wykaz_motocykli = new Pojazd[licznik];
        int j=0;
        for (int i=0; i<this.wykaz_pojazdow.length; i++){
            if (this.wykaz_pojazdow[i] instanceof Motocykl){
                wykaz_motocykli[j] = this.wykaz_pojazdow[i];
                j++;
            }
        }
        return wykaz_motocykli;
    }
    public Pojazd[] getPojazdyWlasciciela(String pesel){
        int licznik=0;
        for (int i=0; i<this.wykaz_pojazdow.length; i++){
            if (this.wykaz_pojazdow[i].getWlasiciel().getPesel().equals(pesel)){
                licznik++;
            }
        }
        Pojazd[] pojazdy_wlasciciela = new Pojazd[licznik];
        int j=0;
        for (int i=0; i<this.wykaz_pojazdow.length; i++){
            if (this.wykaz_pojazdow[i].getWlasiciel().getPesel().equals(pesel)){
                pojazdy_wlasciciela[j] = this.wykaz_pojazdow[i];
                j++;
            }
        }
        return pojazdy_wlasciciela;
    }
    public Osoba getDaneWlasciciela(String nr_rejestracyjny){
        for (int i=0; i<this.wykaz_pojazdow.length; i++){
            if(this.wykaz_pojazdow[i].getNr_rejestracyjny().equals(nr_rejestracyjny)){
                return this.wykaz_pojazdow[i].getWlasiciel();
            }
        }
        return null;
    }
    public String toString(){
        String informajca_zwrotna = "";
        String pom = "";
        for (int i=0; i<this.wykaz_pojazdow.length ; i++){
            informajca_zwrotna+= this.wykaz_pojazdow[i].toString();
        }
        return informajca_zwrotna;
    }
    public boolean addPojazd(Pojazd pojazd){
        boolean czy_mozna_dodac =true;
        if(this.wykaz_pojazdow.length == maksymalna_liczba_pojazdow){
            czy_mozna_dodac = false;
        }
        for (int i=0; i<this.wykaz_pojazdow.length; i++){
            if (pojazd.getNr_rejestracyjny().equals(this.wykaz_pojazdow[i].getNr_rejestracyjny())){
                czy_mozna_dodac = false;
                break;
            }
        }
        if (czy_mozna_dodac){
            Pojazd[] nowa_tablica = new Pojazd[this.wykaz_pojazdow.length+1];
            for (int i=0; i<this.wykaz_pojazdow.length; i++){
                nowa_tablica[i]=this.wykaz_pojazdow[i];
            }
            nowa_tablica[nowa_tablica.length-1] = pojazd;
            this.wykaz_pojazdow = nowa_tablica;
        }

        return czy_mozna_dodac;

    }

}
