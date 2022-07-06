package ksztaltki;

public class Prostokat extends Figura{
    private double b1,b2;
    public Prostokat(double a, double b){
        super();
        b1=a; b2=b;
    }
    public double pole(){
        return b1*b2;
    }
    public double obwod(){
        return 2*(b1+b2);
    }
}
