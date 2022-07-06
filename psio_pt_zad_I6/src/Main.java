import java.util.Scanner; //zaimportowanie klasy Scanner z biblioteki "util" javy

public class Main //class Main
{
    public static int NWD(int a,int b) //metoda zwracająca NWD dla dwóch przyjętych liczb a i b
    {
        while(a!=b)     //pętla wykonująca algorrytm Euklidesa
        {
            if(a>b)
            {
                a-=b;
            }
            else
            {
                b-=a;
            }
        } //pętla while(a!=b)
        return a;
    } //metoda NWD
    public static void main(String[] args) //metoda main
    {
        Scanner scan = new Scanner(System.in); //stworzenie obiektu scan klasy Scanner
        System.out.println("Podaj a: ");    //wyświetlenie "Podaj a: "
        int a = scan.nextInt();             //wczytanie z konsoli a
        System.out.println("Podaj b: ");    //wyświetlenie "Podaj b: "
        int b = scan.nextInt();             //wczytanie z konsoli b
        System.out.println("NWD to: " + NWD(a,b)); //wyświetlenie "NWD to: " oraz liczby zwracanej przez metodę NWD
    } //metoda main
} //class Main
