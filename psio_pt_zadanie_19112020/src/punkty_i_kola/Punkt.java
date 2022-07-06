package punkty_i_kola;
import java.lang.Math;

public class Punkt {
    private float x;
    private float y;
    public Punkt(){
        this.x=0;
        this.y=0;
    }
    public Punkt(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float getX(){
        return this.x;
    }
    public float getY(){
        return this.y;
    }
    public void setX(float x){
        this.x=x;
    }
    public void setY(float y){
        this.y=y;
    }
    public float odleglosc_punktow(float x, float y){
        return (float)Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
    }
    public float odleglosc_punktow(Punkt P){
        return (float)Math.sqrt((P.getX()-this.x)*(P.getX()-this.x)+(P.getY()-this.y)*(P.getX()-this.y));
    }
}
