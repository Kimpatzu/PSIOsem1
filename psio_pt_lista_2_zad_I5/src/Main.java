import java.util.Scanner; //zaimportowanie klasy Scanner z biblioteki "util" javy

public class Main {     //klasa main

    public static boolean czy_pierwsza(int K){     //metoda cz_pierwsza
        if(K==0 || K==1) return false;      //zwraca fałsz dla 0 i 1
        if(K==2 || K==3) return true;       //zwraca prawdę dla 2 i 3
        if(K%2 == 0 || K%3 ==0) return false;       //zwraca fałsz dla liczb podzielnych przez 2 i przez 3
        for(int i=6; i<K/2; i+=6){      //pętla wykorzystuje to, że liczby pierwsze mają postać 6k+-1, dla k należacych do naturalnych, wyklucza opcja w których nie są to liczby pierwsze
            if(K%(i-1) == 0 || K%(i+1) == 0){
                return false;
            }
        }
        return true;
    }       //metoda czy_pierwsza
    public static void main(String[] args){ //metoda main
        Scanner scan = new Scanner(System.in);      //obiekt scan klasy Scanner
        int K = scan.nextInt();
        if(czy_pierwsza(K)) System.out.println("K jest pierwsza"); //wykorzystanie metody czy_pierwsza
        else System.out.println("K nie jest pierwsza");
    }
}
