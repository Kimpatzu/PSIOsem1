import java.util.Scanner; //zaimportowanie klasy Scanner z biblioteki "util" Javy
import java.util.ArrayList; //zaimportowanie klasy ArrayList z biblioteki "util" javy

/*
program wykonujący potęgowanie, z najmniejszą liczbą mnożeń,
przykładowo wykonuje mniej niż 20 mnożeń dla wykładnika = 5687
Wyjaśnie programu dla wykłanika 56:
liczba 56 jest parzysta, dzielimy ją przez 2
liczba 28 (56/2) jest parzysta, dzielimy ją przez 2
liczba 14 (28/2) jest parzysta, dzielimy ją przez 2
liczba 7 (14/2) jest nieparzysta, odejmujemy od niej 1
liczba 6 (7-1) jest parzysta, dzielimy ją przez 2
liczba 3 (6/2) jest nieparzysta, odejmujemy od niej 1
liczba 2 (3-1) jest parzysta, dzielimy ją przez 2
liczba 1 jest punktem w którym przestajemy robić listę króków
liczbę 56 możemy zapisać jako:
((((((1*2)+1)*2)+1)*2)*2)*2= ((((3*2)+1)*2)*2)*2 = ((7*2)*2)*2 =(14*2)*2=28*2=56
z tej listy kroków program "wie", że x^56 możemy zapisać jako
((((((x^2)*x)^2)*x)^2)^2)^2=x^56
 */
public class Main { //class main



    public static float potega(float X, int K){ //metoda wykonująca potęgowanie, przyjmuje podstawę X i wykładnik K
        float wynik=X; //podstawienie do zmiennej wynik wartość X, X w sam w sobie jest potrzebny później
        ArrayList<Integer> kroki = new ArrayList<Integer>(); //tworzenie obiektu typu arraylist do przechowywania kolejnych kroków potęgowania
        if (K==1){ //przypadek gdy wykładnik=1
            return X;
        }
        if (K==0){ //przypadek gdy wykładnik=0
            return 1.0f;
        }
        while (K!=1){ //pętla zapisująca liczbę króków.
            if (K%2==1){    //Jeśli wykładnik K jest nieparzysty odejmuje 1
                kroki.add(1);
                K--;
            }
            if(K%2==0){ //jeśli wykładnik jest parzysty, dzieli go przez dwa
                kroki.add(2);
                K=K/2;
            }
        }
        //for (int i=0; i<kroki.size(); i++){ //pętla pokazująca zawartość obiketu kroki
        //    System.out.println("tablica i ="+i+ " : " +kroki.get(i));
        //}
        for (int i=0; i<kroki.size(); i++){ //pętla wykonująca kroki zgodnie z informacją zawartą w pętli
            if (kroki.get(kroki.size()-i-1)==1){ //pomnożenie jakiejś potęgi X przez X zwiększa wykładnik o 1
                wynik=wynik*X;
            }
            if (kroki.get(kroki.size()-i-1)==2){    //podniesienie jakiejś potęgi X do kwadratu (wymnożenie wykładnika przez 2)
                wynik=wynik*wynik;
            }
        }
        return wynik;
    } //metoda potęga
    public static void main(String[] args){ //metoda main
        Scanner scan = new Scanner(System.in); //stworzenie obiektu scan klasy Scanner wczytujący dane z konsoli
        System.out.println("Podaj podstawę potęgi: "); //wyświetlenie prośby o podanie X
        float X = scan.nextFloat(); //wprowadzenie X
        System.out.println("Podaj wykładnik potęgi: "); //wyświetlnie prośby o podanie K
        int K = scan.nextInt(); //wprowadzenie K
        System.out.println("Potęga "+X+"^"+K+" = "+potega(X,K));
    } //metoda main

}
