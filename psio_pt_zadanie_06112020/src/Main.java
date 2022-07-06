import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int x = input.nextInt();
        System.out.println("Podaj dokładność: ");
        int dokladnosc = input.nextInt();
        Liczba_naturalna K = new Liczba_naturalna(x);
        System.out.println("Suma cyf liczby K: " + K.suma_cyfr(K.getN()));
        System.out.println(K.ile_cyfr_znaczacych(K.getN(), dokladnosc));
        System.out.println(K.czy_pierwsze(K.getN()));
        System.out.println(K.max_cyfra(K.getN()));

    }
}
