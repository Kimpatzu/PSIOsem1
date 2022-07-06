import java.util.Random;

public class Main {
    public static void main(String[] args){
    Random random = new Random();
    int i_max=0;
    int max_w_wierszu=0;
    int tablica[][] = new int[random.nextInt(10)+1][];
    for (int i=0; i<tablica.length; i++){
        tablica[i] = new int[random.nextInt(10)+1];
    }
    for (int i=0; i<tablica.length; i++){
        for (int j=0; j<tablica[i].length; j++){
            tablica[i][j]=random.nextInt();
            if(i>i_max){
                i_max=i;
            }
        }
    }
    for (int i=0; i<tablica.length; i){
        
    }
    }
}
