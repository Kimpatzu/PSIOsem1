package objects;

public class Tablica {
    private int[] tab;

    public Tablica(int[] tab) {                     //kostruktor tworzący obiekt typu Tablica z podanej tablicy typu int
        this.tab = tab;
    }
    public Tablica(int n){                          //konstruktor tworzący obiekt typu Tablica o n dlugosci (wartosci komórek=0)
        this.tab = new int[n];
    }

    public int[] getTab() {
        return tab;
    }

    public int getKomorka(int i){
        return tab[i];
    }

    public int getSumaElementów(){                  //zwraca sumę elementów tablicy
        int suma = 0;
        for (int i=0; i< tab.length; i++){
            suma+=tab[i];
        }
        return suma;
    }

    public int getMaksymalnaWartosc(){             //zwraca maksymalną wartość tablicy
        int max;
        max=tab[0];
        for (int i=1; i< tab.length; i++){
            if (max<tab[i]){
                max=tab[i];
            }
        }
        return max;
    }
    public int getIndeksMaksymalnejWartosci(){          //zwraca indeks maksymalnej wartosci
        int max = tab[0];
        int n=0;
        for (int i=1; i< tab.length; i++){
            if (max> tab.length);{
                max=tab[i];
                n=i;
            }
        }
        return n;
    }

    public boolean czyJestwNPoczatkowychElementow(int n, int value){        //sprawdza czy wartosc value znajduje sie w n początkowych elementach
        int i = 0;
        while(i<n && tab[i] != value){
            i++;
        }
        return i<n;
    }
    public boolean czyRoznowartosciowa(){                                   //sprawdza czy tablica jest różnowartościowa
        boolean roznartosciowa=true;             //początkowe założenie, że tablica jest różnowartościowa
        for (int i=0; i< tab.length; i++){  //pętla iterująca po tablicy (od końca, if iteruje od tyłu)
            if (czyJestwNPoczatkowychElementow(tab.length-i-1,tab[tab.length-i-1])){        //if sprawdza od końca tablicy, czy w jakiejś komórce tablicy o mniejszym indeksie jest taka sama wartość co w obecnej
                roznartosciowa=false;
            }
        }
        return roznartosciowa;
    }
    public void usunElement(int indeksElementu){        //metoda usuwająca element ze względu na jego numer indeksu
        int[] nowyTab = new int[tab.length-1];  //tworzy tablicę o 1 krótszą
        int j=0;
        for (int i=0; i< tab.length;i++){   //pętla podstawia do nowej tablicy wszystkie wartości poza tą wskazaną
            if (i!=indeksElementu){
                nowyTab[j]= tab[i];
                j++;
            }
        }
        tab = nowyTab;  //stara tablica to teraz nowa tablica, bez elementu
    }
    public void usunWystapienia(int value){     //metoda usuwająca wszystkie elementy o podanej wartosci value
        int  licznikWystapien=0;    //zliczanie liczby wystąpień niechcianej wartosci
        for (int i=0; i<tab.length; i++){
            if  (tab[i]==value){
                licznikWystapien++;
            }
        }
        if (licznikWystapien!=0){   //jeżeli nie ma ani jednego wystąpienia wartości, to nie ma sensu by ta czesc sie wykonywała
            int[] nowyTab = new int[tab.length-licznikWystapien];   //stworzenie tablicy, krótszej o liczbe wystapien
            int j=0;
            for (int i=0;  i<tab.length; i++){      //przeniesienie wszystkich elementów do nowej tablicy, poza tymi o niechcianej wartosci
                if (tab[i]!=value){
                    nowyTab[j]=tab[i];
                    j++;
                }
            }
            tab = nowyTab;
        }
    }
    public void usunPowtorzenia(){      //metoda usuwająca powtórzenia
        int i=0;
        while(!czyRoznowartosciowa()){      //tak długo jak tablica nie jest różnowartościowa (tak długo jak ma powtarzające się elementy)
            while(!czyJestwNPoczatkowychElementow(tab.length-i-1,tab[tab.length-i-1])){     //szukanie indeksu elementu, który się powtarza
                i++;
            }
            usunElement(i); //usuniecie elementu powtarzajacego sie po indeksie
        }
    }

    public String toString(){
        String output="";
        for (int i=0; i<tab.length; i++){
            output+=tab[i]+"\n";
        }
        return output;
    }

    public void setCell(int i, int value){
        tab[i]=value;
    }
    public void setTab(int[] tab) {
        this.tab = tab;
    }

}
