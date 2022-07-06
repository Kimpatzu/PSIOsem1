package osoba_i_dziedziczące_klasy;

public abstract class Osoba {
    private String imie;
    private String nazwisko;
    private String pesel;
    private String data_urodzenia;
    public Osoba(String imie, String nazwisko, String pesel, String data_urodzenia){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.data_urodzenia = data_urodzenia;
    }
    public String getImie(){
        return this.imie;
    }
    public String getNazwisko(){
        return this.nazwisko;
    }
    public String getPesel(){
        return this.pesel;
    }
    public String toString(){
        return "\n" + this.imie + "  " + this.nazwisko + "\n" + "PESEL: " + this.pesel + "\n" + "Data_ur: " + this.data_urodzenia;
    }
}
