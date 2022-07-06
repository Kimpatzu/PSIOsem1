package ksztaltki;

public class Kolo extends Figura{
    private double r;
    public Kolo(double r){
        super();
        this.r=r;
    }
    public double pole(){
        return 3.14*r*r;
    }
    public double obwod(){
        return 2*3.14*r;
    }
}
