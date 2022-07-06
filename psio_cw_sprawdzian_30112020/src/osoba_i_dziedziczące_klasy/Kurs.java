package osoba_i_dziedziczące_klasy;

public class Kurs {
    private String kod_kursu;
    private int ects;
    String nazwa_kursu;
    public Kurs (String kod_kursu, int ects, String nazwa_kursu){
        this.kod_kursu = kod_kursu;
        this.ects = ects;
        this.nazwa_kursu = nazwa_kursu;
    }
    public String getKod_kursu(){
        return this.kod_kursu;
    }
    public int getEcts(){
        return this.ects;
    }
    public String getNazwa_kursu(){
        return this.nazwa_kursu;
    }
}
