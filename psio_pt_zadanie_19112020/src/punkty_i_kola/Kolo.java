package punkty_i_kola;

public class Kolo {
    private Punkt S;
    private float r;
    public Kolo(){
        this.S.setX(1);
        this.S.setY(1);
        this.r=1;
    }
    public Kolo(Punkt P, float r){
        this.S=P;
        this.r=r;
    }
    public Kolo(float x, float y, float r) {
        this.S= new Punkt(x,y);
        this.r=r;
    }
    public Punkt getS(){
        return this.S;
    }
    public float getS_X(){
        return this.S.getX();
    }
    public float getS_Y(){
        return this.S.getY();
    }
    public float getR(){
        return this.r;
    }
    public boolean czy_punkt_nalezy_do_kola(Punkt P){
        if (S.odleglosc_punktow(P)<=r){
            return true;
        }
        else return false;
    }
    public boolean czy_punkt_nalezy_do_kola(float x, float y){
        if(S.odleglosc_punktow(x,y)<=r){
            return true;
        }
        else return false;
    }
}
