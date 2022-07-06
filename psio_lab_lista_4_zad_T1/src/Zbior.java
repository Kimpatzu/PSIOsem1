import java.util.Random;
public class Zbior{
    Tablica tablica;
    Zbior(int n, int k){
        this.tablica = new Tablica(n);
        this.createZbior(k);
    }
    private void createZbior(int k){
        if (this.tablica.getSize()>=k){
            k=this.tablica.getSize()+1;
        }
        Random random = new Random();
        int i = 0;
        int nowy_element;
        boolean juz_byl = false;
        while (i<this.tablica.getSize()){
            nowy_element = (int)(1+(random.nextFloat()*k));
            for (int j=0; j<=i; j++){
                if(this.tablica.getTablica(j) == nowy_element){
                    juz_byl = true;
                    break;
                }
            }
            if (!juz_byl){
                this.tablica.setTablica(i,nowy_element);
                i++;
            }
            juz_byl = false;
        }
    }
}
