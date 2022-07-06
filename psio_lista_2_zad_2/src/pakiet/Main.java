package pakiet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
                Scanner scan= new Scanner(System.in);
                System.out.println("Podaj x: ");
                int x = scan.nextInt();
                float L=x;
                float M=1;
                int k = 1;
                float Wynik = 0;
                final float eps = 0.000000001f;
                while ((L/M)>eps) {
                    L=L*x*x;
                    M=M*2*k*((2*k)-1);
                    if ((k%2)==0){
                        Wynik=Wynik+(L/M);
                    }
                    else Wynik=Wynik-(L/M);
                    k++;
                }
                System.out.println(Wynik);

    }
}
