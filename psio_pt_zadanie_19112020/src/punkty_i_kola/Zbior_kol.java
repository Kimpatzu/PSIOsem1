package punkty_i_kola;

public class Zbior_kol {
    private Kolo[] zbior;
    public Zbior_kol(Kolo[] tab){
        this.zbior=tab;
    }
    public Kolo getKolo(int i){
        return this.zbior[i];
    }
    public Punkt getS(int i){
        return this.zbior[i].getS();
    }
    public float getX(int i){
        return this.zbior[i].getS_X();
    }
    public float getY(int i){
        return  this.zbior[i].getS_Y();
    }
    public float getR(int i){
        return  this.zbior[i].getR();
    }
    public int getLenght(){
        return this.zbior.length;
    }
    public Kolo[] kola_z_5_5(){
        int j = 0;
        Kolo[] tab_pom = new Kolo[zbior.length];
        for (int i=0; i< zbior.length; i++) {
            if (zbior[i].czy_punkt_nalezy_do_kola(5.0f, 5.0f)) {
                tab_pom[j] = zbior[i];
                j++;
            }
        }
        Kolo[] tab_for_return = new Kolo[j+1];
        for (int k=0; k<j; k++){
            tab_for_return[k]=tab_pom[k];
        }
        return tab_for_return;
    }
}
