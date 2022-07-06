public class Tablica {
    private int[] tablica;
    public Tablica(int n){
            int[] pom = new int[n];
            this.tablica = pom;
            pom=null;
    }
    public int[] getTablica(){
        return this.tablica;
    }
    public int getTablica(int i){
        return this.tablica[i];
    }
    public int getSize(){
        return this.tablica.length;
    }
    public void setTablica(int i,int wartosc){
        this.tablica[i]=wartosc;
    }

    public void wyswietl(){
        for (int i=0; i<this.tablica.length; i++){
            System.out.println(i+1+". komórka tablicy: " + this.tablica[i]);
        }
    }
    public void wywietlWOdwrotnejKolejnosci(){
        for (int i=this.tablica.length-1; i>=0; i--){
            System.out.println(i+1+". komórka tablicy: " + this.tablica[i]);
        }
    }
    public void dodajWartoscPonadRozmiar(int wartosc){
        int[] pom = new int[this.getSize()+1];
        for (int i=0; i<this.getSize(); i++){
            pom[i] = this.getTablica(i);
        }
        pom[pom.length-1] = wartosc;
        this.tablica = pom;
    }
    public Tablica podzbiorParzystych(){
        Tablica parzyste  = new Tablica(0);
        for (int i=0; i<this.getSize(); i++){
            if (this.getTablica(i)%2==0){
                parzyste.dodajWartoscPonadRozmiar(getTablica(i));
            }
        }
        parzyste.sort();
        return parzyste;
    }
    public Tablica podzbiorNieparzystych(){
        Tablica nieparzyste  = new Tablica(0);
        for (int i=0; i<this.getSize(); i++){
            if (this.getTablica(i)%2==1){
                nieparzyste.dodajWartoscPonadRozmiar(getTablica(i));
            }
        }
        nieparzyste.sort();
        return nieparzyste;
    }
    public void sort(){
        int pom=0;
        for (int i=0; i<this.getSize(); i++){
            for (int j=0; j<this.getSize()-1; j++){
                if (this.getTablica(j+1)>this.getTablica(j)){
                    pom = this.getTablica(j);
                    this.setTablica(j,this.getTablica(j+1));
                    this.setTablica(j+1,pom);
                }
            }
        }
    }
}
