package ksztaltki;

public class Koszty {
    private double koszty_produkcji;
    private double koszty_materialu;
    private double koszt_uslugi_ciecia = 0.33;
    private double koszt_materialu = 1.23;
    public Koszty(double obwod, double pole){
        this.koszty_produkcji = obwod*koszt_uslugi_ciecia;
        this.koszty_materialu = pole*koszt_materialu;
    }
    public double getKoszty_produkcji(){
        return koszty_produkcji;
    }
    public double getKoszty_materiału(){
        return koszty_materialu;
    }

}
