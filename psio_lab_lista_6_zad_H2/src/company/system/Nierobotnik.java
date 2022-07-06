package company.system;

public class Nierobotnik extends Pracownik{
    private float placaPodstawowa;
    private float premia;

    public Nierobotnik(String imie, String nazwisko, float czescEtatu, float placaPodstawowa, float premia) {
        super(imie, nazwisko, czescEtatu);
        this.placaPodstawowa = placaPodstawowa;
        this.premia = premia;
    }

    public float getPlacaPodstawowa() {
        return placaPodstawowa;
    }

    public void setPlacaPodstawowa(int placaPodstawowa) {
        this.placaPodstawowa = placaPodstawowa;
    }

    public float getPremia() {
        return premia;
    }

    public void setPremia(float premia) {
        this.premia = premia;
    }


    @Override
    public float getWyplata(){
        float wyplata=placaPodstawowa*160*getCzescEtatu()+premia*placaPodstawowa;
        return  wyplata;
    }
}
