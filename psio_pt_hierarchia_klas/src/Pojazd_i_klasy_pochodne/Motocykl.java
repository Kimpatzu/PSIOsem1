package Pojazd_i_klasy_pochodne;

public class Motocykl extends Pojazd{
    private String kolor;
    public Motocykl(Osoba wlasiciel, String model, String nr_rejestracyjny, String kolor){
        super(wlasiciel,model,nr_rejestracyjny);
        this.kolor = kolor;
    }
    public String getKolor(){
        return this.kolor;
    }
    public String toString(){
        return super.toString() + "Kolor: " + this.kolor + "\n";
    }
}
