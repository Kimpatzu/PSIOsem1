import java.util.ArrayList;

class Liczba_naturalna {
    long n;
    Liczba_naturalna(int n){
        this.n = n;
    }
    Liczba_naturalna(){
        this.n = 1;
    }
    int suma_cyfr(long k){
        long dzielnik = 10;
        int suma = 0;
        ArrayList<Long> tablica =new ArrayList<Long>();
        int i=0;
        while(dzielnik/10<k){                       //pętlą działająca tak długo aż dzielnik nie jest większy o 2 rzędy od k, czyli np 1000 dla K=83
            tablica.add(i++, (k%dzielnik)/(dzielnik/10));      //dodawanie do tabeli kolejnych cyfr liczby k
            dzielnik=dzielnik*10;   //dzielnik jako iterator
        }
        for (int j=0; j<tablica.size(); j++){ //pętla przeglądająca tablicy (ilość powtórzeń zależna od wielkości tablicy)
            suma+=tablica.get(j); //pomimo, że tablica jest przeglądana od 0, to pierwsze wartości są ostatnimi cyframi K
        }
        return suma;
    }
    int ile_cyfr_znaczacych(long k, long dokladnosc){
        int i=0;        //zainicjowanie iteratora i
        boolean czy_przekracza = false;     //zainicowanie zmiennej czy_przkeracza wskazującej na to czy pod dodaniu/odjęciu dokladnosc od K zmienia się tylko tyle samo cyfr ile ma dokladnosc czy jedna wiecej
        while(dokladnosc>Math.pow(10, i)){  //pętla zwiększająca iterator i jako wykładnika potęgi oo podstawie 10. (np. dla 32 i=2, bo 32<100, dla 345, i=3 itd.)
            i++;
        }
        long pom = k%((long)Math.pow(10, i));   //zmienna pomocnicza pomogająca stwierdzić wartość czy_przekracza
        if ((pom-dokladnosc)<0 || (pom+dokladnosc)>Math.pow(20, i)){
            czy_przekracza = true;
        }
        if (!czy_przekracza){ //jeśli czy_przekracza=false, to odejmuje 1 od i
            i--;
        }
        int ilosc_cyfr_znaczacych =(int)(Math.log10(k)-i); //ilosc cyfr znaczących jest otrzymywane poprzez odjęcie od zrzutowanego na typ int logarytmu o podstawie 10 z K i odjęcie od niego iteratora
        return ilosc_cyfr_znaczacych;
    }
    int max_cyfra(long k){
        int max=0;
        long reszta = 0; //inicjacja reszty
        long i = 10; //inicjacja iteratora
        int pom=0; //zmienna pomocnicza do przechowywania kolejnych cyfr
        while(k>i){ //pętla poruszająca się po kolejnych cyfrach
            pom = (int)((k%i-reszta)/(i/10)); //pom przechowuje kolejne cyfry liczby K
            reszta=k%i; //reszta przechowuje reszte z dzielenia
            i*=10;
            if(pom>max){ //szukanie największej cyfry
                max=pom;
            }
        }
        return max;
    }
    boolean czy_pierwsze(long k){
        if(k==0 || k==1) return false;      //zwraca fałsz dla 0 i 1
        if(k==2 || k==3) return true;       //zwraca prawdę dla 2 i 3
        if(k%2 == 0 || k%3 ==0) return false;       //zwraca fałsz dla liczb podzielnych przez 2 i przez 3
        for(int i=6; i<k/2; i+=6) {      //pętla wykorzystuje to, że liczby pierwsze mają postać 6k+-1, dla k należacych do naturalnych, wyklucza opcja w których nie są to liczby pierwsze
            if (k % (i - 1) == 0 || k % (i + 1) == 0) {
                return false;
            }
        }
        return true;
    }
    long getN(){
        return n;
    }


}
