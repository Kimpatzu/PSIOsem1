package company.system;

public abstract class Pracownik {
    private String imie;
    private String nazwisko;
    private float czescEtatu;

    public Pracownik(String imie, String nazwisko, float czescEtatu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.czescEtatu = czescEtatu;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public float getCzescEtatu() {
        return czescEtatu;
    }

    public void setCzescEtatu(float czescEtatu) {
        this.czescEtatu = czescEtatu;
    }
    public abstract float getWyplata();

    public boolean isNierobtnik(){
        boolean is = false;
        if (this instanceof Nierobotnik){
            is = true;
        }
        return is;
    }
    @Override
    public String toString() {
        String output = "Nazwisko: " + nazwisko + "\n" + "Imię: " + imie + "\n" +  "Stanowisko: ";
        if (isNierobtnik()){
            output+="Nierobotnik";
        } else {
            output+="Robotnik";
        }
        return output+"\n";
    }
}
