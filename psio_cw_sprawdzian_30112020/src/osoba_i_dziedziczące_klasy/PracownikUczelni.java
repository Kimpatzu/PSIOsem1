package osoba_i_dziedziczące_klasy;

public class PracownikUczelni extends Pracownik{
    private String budynek;
    private int nr_pokoju;

    public PracownikUczelni(String imie, String nazwisko, String pesel, String data_urodzenia, String stanowisko_pracy, int pensja, String budynek, int nr_pokoju) {
        super(imie, nazwisko, pesel, data_urodzenia, stanowisko_pracy, pensja);
        this.budynek = budynek;
        this.nr_pokoju = nr_pokoju;
    }
    public String getBudynek() {
        return this.budynek;
    }
    public int getNr_pokoju() {
        return this.nr_pokoju;
    }
    public String toString() {
        return super.toString() + "\n" + this.budynek + "\n" + this.nr_pokoju;
    }
}
