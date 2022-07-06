package company.system;

public class Robotnik extends Pracownik {
    private float stawkaGodzinowa;
    private float liczbaPrzepracowanychGodzin;
    private float LIMIT;

    public Robotnik(String imie, String nazwisko, float czescEtatu, float stawkaGodzinowa, float liczbaPrzepracowanychGodzin, float LIMIT) {
        super(imie, nazwisko, czescEtatu);
        this.stawkaGodzinowa = stawkaGodzinowa;
        this.liczbaPrzepracowanychGodzin = liczbaPrzepracowanychGodzin;
        this.LIMIT=LIMIT;
    }

    public float getLiczbaPrzepracowanychGodzin() {
        return liczbaPrzepracowanychGodzin;
    }

    public void setLiczbaPrzepracowanychGodzin(float liczbaPrzepracowanychGodzin) {
        this.liczbaPrzepracowanychGodzin = liczbaPrzepracowanychGodzin;
    }

    public float getStawkaGodzinowa() {
        return stawkaGodzinowa;
    }

    public void setStawkaGodzinowa(float stawkaGodzinowa) {
        this.stawkaGodzinowa = stawkaGodzinowa;
    }

    @Override
    public float getWyplata(){
        float  wyplata=0;
        if (liczbaPrzepracowanychGodzin>LIMIT*getCzescEtatu()){
            wyplata+=LIMIT*getCzescEtatu()*stawkaGodzinowa;
            wyplata+=(liczbaPrzepracowanychGodzin-LIMIT*getCzescEtatu())*stawkaGodzinowa*0.5;
        } else {
            wyplata+=LIMIT*getCzescEtatu()*stawkaGodzinowa;
        }
        return wyplata;
    }
}
