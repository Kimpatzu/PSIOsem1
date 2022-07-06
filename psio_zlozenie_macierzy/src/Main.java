import java.util.Random;
public class Main {
    public static void wyswietl_macierz(int tab[][]){
        for (int i=0; i< tab.length; i++){
            for (int j=0; j< tab[i].length; j++){
                System.out.print(tab[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public 
    public static void main(String[] args){
        int T1[][] = new int[2][3];
        int T2[][] = new int[3][4];
        Random random = new Random();
        for (int i=0; i< T1.length; i++){
            for (int j=0; j< T1[i].length; j++){
                T1[i][j] = random.nextInt(10)+1;
            }
        }
        for (int i=0; i< T2.length; i++){
            for (int j=0; j< T2[i].length; j++){
                T2[i][j] = random.nextInt(10)+1;
            }
        }
        wyswietl_macierz(T1);
        wyswietl_macierz(T2);
    }
}
