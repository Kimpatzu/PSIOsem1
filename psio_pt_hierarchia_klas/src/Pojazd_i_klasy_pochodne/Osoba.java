package Pojazd_i_klasy_pochodne;

public class Osoba {
    private String pesel;
    private String imie;
    private String nazwisko;
    public Osoba(String pesel, String imie, String nazwisko){
        this.pesel = pesel;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public String getPesel(){
        return this.pesel;
    }
    public String getImie(){
        return this.imie;
    }
    public String getNazwisko(){
        return this.nazwisko;
    }
    public String toString(){
        return "Imię i nazwisko: " + this.imie+ " " + this.nazwisko + "\n" + "Pesel: " + this.pesel;
    }
    
}
