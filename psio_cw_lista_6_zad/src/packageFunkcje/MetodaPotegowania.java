package packageFunkcje;

public abstract class MetodaPotegowania {
    private float x;
    private int n;

    public MetodaPotegowania(float x, int n) {
        this.x = x;
        this.n = n;
    }

    public float getX(){
        return this.x;
    }
    public int getN(){
        return this.n;
    }
}
