package Int1;

public class Tabela {
    private Funkcja fun;
    private double xp;
    private double xk;
    private int n;
    private double dx;

    public Tabela(Funkcja f, double xp, double xk, int n) {
        this.xp = xp;
        this.xk = xk;
        this.n = n;
        fun = f;
        dx = (xk-xp)/n;
    }

    public String toString(){
        String s = fun.wzor() + "\n";
        s+= "   x       f(x)    \n";
        double x = xp;
        do{
            double fx = fun.f(x);
            s+= x + "   " + fx + "\n";
            x+=dx;
        }while (x<=xk);
        return s;
    }
}
