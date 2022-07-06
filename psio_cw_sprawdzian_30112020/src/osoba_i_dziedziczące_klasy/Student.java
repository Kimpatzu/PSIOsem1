package osoba_i_dziedziczące_klasy;

public class Student extends Osoba{
    private String kierunek;
    private String specjalnosc;
    private String stopien_studiow;
    private int nr_albumu;
    Kurs[] kursy;
    public Student(String imie, String nazwisko, String pesel,String data_urodzenia, String kierunek, String specjalnosc, String stopien_studiow, int nr_albumu, Kurs[] kursy){
        super(imie, nazwisko, pesel, data_urodzenia);
        this.kierunek = kierunek;
        this.specjalnosc = specjalnosc;
        this.stopien_studiow = stopien_studiow;
        this.nr_albumu = nr_albumu;
        this.kursy = kursy;
    }
    public String getKierunek(){
        return this.kierunek;
    }
    public String getSpecjalnosc(){
        return this.specjalnosc;
    }
    public String getStopien_studiow(){
        return  this.stopien_studiow;
    }
    public int getNr_albumu(){
        return  this.nr_albumu;
    }
    public Kurs[] kursy(){
        return this.kursy;
    }
    public String toString(){
        return super.toString() + "\n"  + this.kierunek + "\n" + this.specjalnosc + "\n" + this.stopien_studiow + "\n" + this.nr_albumu;
    }


}
