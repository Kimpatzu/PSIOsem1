package packageFunkcje;

public class Potegowanie_metoda_1 extends MetodaPotegowania implements Potegowanie{
    public Potegowanie_metoda_1(float x, int k){
        super(x,k);
    }
    public float policz_potege(){
        float potega = 1;
        for (int i=0; i<this.getN() ; i++){
            potega *= this.getX();
        }
        return potega;
    }

    @Override
    public String wypisz_kroki() {
        String output = "1" + "\n";
        float potega =1;
        for (int i=0; i<this.getN() ; i++){
            potega *= this.getX();
            output += potega + "\n";
        }
        return output;
    }
}
