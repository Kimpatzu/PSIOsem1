package Pojazd_i_klasy_pochodne;

public abstract class Pojazd {
    private Osoba wlasiciel;
    private String model;
    private String nr_rejestracyjny;
    public Pojazd(Osoba wlasiciel, String model, String nr_rejestracyjny){
        this.wlasiciel = wlasiciel;
        this.model = model;
        this.nr_rejestracyjny = nr_rejestracyjny;
    }
    public Osoba getWlasiciel(){
        return this.wlasiciel;
    }
    public String getModel(){
        return this.model;
    }
    public String getNr_rejestracyjny(){
        return this.nr_rejestracyjny;
    }
    public String toString(){
        String jaki_to_pojazd;
        if (this instanceof Samochod){
            jaki_to_pojazd = "Samochód";
        }
        else {
            jaki_to_pojazd = "Motocykl";
        }
        return "\n" + jaki_to_pojazd + "\n" + "Model: " + this.model + "\n" + "Numer Rejestracyjny: " + this.nr_rejestracyjny + "\n" + "Właściciel: " + "\n" + this.wlasiciel + "\n";
    }
}
