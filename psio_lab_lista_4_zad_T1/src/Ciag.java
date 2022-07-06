public class Ciag {
    Tablica tablica;
    Ciag(int n){
        this.tablica = new Tablica(n);
        this.create_ciag();
    }
    private void create_ciag(){
        for (int i=0; i<this.tablica.getSize(); i++){
            this.tablica.setTablica(i,(i+1)*(i+1));
        }
    }

}
