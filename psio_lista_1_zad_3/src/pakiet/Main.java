package pakiet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float x = scan.nextFloat();
        final float eps = 0.000000001f;
        int k = 1;
        float L = 1;
        float M = 1;
        float Suma= 1;
        while (L/M>eps) {
            L = L*x;
            M = M*k;
            Suma=Suma + (L/M);
            k++;
        }
        System.out.println(Suma);


    }
}
