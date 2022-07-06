package osoba_i_dziedziczące_klasy;

public abstract class Pracownik extends Osoba {
    private String stanowisko_pracy;
    private int pensja;
    public Pracownik(String imie, String nazwisko, String pesel,String data_urodzenia, String stanowisko_pracy, int pensja){
        super(imie, nazwisko, pesel, data_urodzenia);
        this.stanowisko_pracy = stanowisko_pracy;
        this.pensja = pensja;
    }
    public String getStanowisko_pracy(){
        return this.stanowisko_pracy;
    }
    public int getPensja(){
        return this.pensja;
    }
    public String toString(){
        return super.toString() + "\n" + this.stanowisko_pracy + "\n" + this.pensja;
    }
}
