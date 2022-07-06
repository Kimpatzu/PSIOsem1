import java.util.Scanner; //zaimportowanie klasy Scanner z biblioteki "util" javy

public class Main { //class Main

    public static int NWD(int a, int b){ //metoda NWD przyjmująca dwie liczby  i zwracająca ich największy wspólny dzielnik
        if (b==0){ //zakończenie rekurencji
            return a;
        }
        else
        {
            return NWD(b,a%b); //rekurencyjne wywołane funkcji, gdzie kolejność parametrów została zamieniona, dodatkowo drugi parametr to reszta z dzielenie pierwszej liczby przez drugą
        }
    }   //metoda NWD
    public static void main(String[] args){ //metoda main
        Scanner scan = new Scanner(System.in);  //obiekt scan klasy Scanner
        System.out.println("Podaj a: "); //wyświetlenie "Podaj a: "
        int a = scan.nextInt();         //wczytanie a z konsoli
        System.out.println("Podaj b: ");        //wyświetlenie "Podaj b: "
        int b = scan.nextInt();     //wczytanie b z konsoli
        System.out.println("NWD to: " + NWD(a,b));  //wyświetlenie "NWD to: " i wartości zwróconej przez metodę NWD(a,b)
    }       //metoda main
}//class Main
