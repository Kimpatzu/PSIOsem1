package prog.obiektowe;

class Punkt {
    double x,y;
    Punkt(double x, double y){
        this.x = x;
        this.y = y;
    }
    double odl(Punkt w){
        double dx = x-w.x;
        double dy = y-w.y;
        return Math.sqrt(dx*dx+dy*dy);
    }
    public String toString(){
        return " ("+x+","+y+") ";
    }
}

class Kolo{
    double r;
    Punkt srodek;
    Kolo(double r, Punkt s){
        this.r = r;
        srodek=s;
    }
    Kolo (double r, double xs, double ys){
        this.r=r;
        srodek=new Punkt(xs,ys);
    }
    public boolean czy_nalezy(Punkt p){ //zwraca true, jeśli p należy do koła
        return srodek.odl(p)<=r;
    }
    public String toString(){
        return "Koło o r= "+r+"oraz środku w"+srodek;
    }
}


class Test{
    void main(String[] args){
        Punkt p =new Punkt(1.5, 0.72);
        Kolo K1 = new Kolo(1.0, new Punkt(1.0,1.0));
        if(K1.czy_nalezy(p)){
            System.out.println(p + "należy do koła");
        }
        else System.out.println("lol nie");
        Kolo K2 =new Kolo(1.0, -1.0, 1);
        if(K2.czy_nalezy(p)){
            System.out.println("należy");
        }
    }
}
