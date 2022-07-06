package Pojazd_i_klasy_pochodne;

public class Samochod extends Pojazd {
    private String typ_nadwozia;
    public Samochod(String typ_nadwozia,Osoba wlasiciel, String model, String nr_rejestracyjny){
        super(wlasiciel,model,nr_rejestracyjny);
        this.typ_nadwozia=typ_nadwozia;
    }
    public String getTyp_nadwozia(){
        return this.typ_nadwozia;
    }
    public String toString(){
        return super.toString() + "Typ madwozia: " + this.typ_nadwozia +"\n";
    }
}
