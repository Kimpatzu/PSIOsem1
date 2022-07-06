package ksztaltki;

public class Figura_zlozona {
    private Figura[] zbior_figur;
    public Figura_zlozona(Figura[] tab){
        this.zbior_figur = tab;
    }
    public Figura_zlozona(int n){
        Figura[] pusty_zbior= new Figura[n];
        this.zbior_figur = pusty_zbior;
    }
    public Figura getFigura(int i){
        return this.zbior_figur[i];
    }
    public int getDlugosc(){
        return this.zbior_figur.length;
    }
    public void setFigura(int i, Figura nowa_figura){
        this.zbior_figur[i] = nowa_figura;
    }
}
