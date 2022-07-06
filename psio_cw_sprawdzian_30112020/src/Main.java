import osoba_i_dziedziczące_klasy.*;

import java.io.*;

//import java.util.ArrayList;
//import java.util.Scanner;
public class Main {
    //podpunkt a)
    public static void wyswietl_dane(Osoba[] osoby){
        for (int i=0; i< osoby.length; i++){
            if (osoby[i] != null){
                System.out.println(osoby[i].toString());
            }
        }
    }
    //podpunkt b)
    public static void wyszukaj_po_nazwisku(Osoba[] osoby, String nazwisko){
        for (int i=0; i< osoby.length; i++){
            if (nazwisko == osoby[i].getNazwisko()){
                System.out.println(osoby[i].toString());
            }
        }
    }
    //podpunkt c)
    public static void wyszukaj_po_dorobku(Osoba[] osoby, float dorobek_min){
        for (int i=0; i< osoby.length; i++){
            if (osoby[i] instanceof PracownikUczelniNaukowoDydaktyczny){
                if (((PracownikUczelniNaukowoDydaktyczny) osoby[i]).getWartosc_dorobku()>dorobek_min){
                    System.out.println(osoby[i].toString());
                }
            }
        }
    }
    //podpunkt d)
    public static void wyszukaj_po_stanowisku(Osoba[] osoby, String stanowisko){
        for (int i=0; i< osoby.length; i++){
            if (osoby[i] instanceof Pracownik){
                if(((Pracownik) osoby[i]).getStanowisko_pracy().equals(stanowisko)){
                    System.out.println(osoby[i].toString());
                }
            }
        }
    }
    //podpunkt e)
    public static void usun_po_pesel(Osoba[] osoby,String pesel){
        for (int i=0; i< osoby.length; i++){
            if(osoby[i].getPesel().equals(pesel)){
                osoby[i] = null;
            }
        }
    }
    public static void serializacja_osoby(Osoba osoba){
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("osoba.ser"))){
            outputStream.writeObject(osoba);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void serializacja_czytanie_osoby(Osoba osoba){
        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("osoba.ser"));
            osoba = (osoba);
            inputStream.readObject();
            inputStream.close();
            System.out.println(osoba.toString());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        //ArrayList<Osoba> osobyarraylist = new ArrayList<>();
        //Scanner scanner = new Scanner(System.in);
        //int a = scanner.nextInt();
        Kurs[] kursy = {new Kurs("A00-23p", 5, "Logika dla infromatyków"), new Kurs("B09-12q",3,"Organizacja Systemów Komputerowych")};
        Osoba[] osoby = new Osoba[3];
        osoby[0] = new Student("Jakub", "Smolarczyk", "12345678901", "10/12/2000", "informatyka stosowana", null, "studnia 1-go stopnia inżynierskie", 123456, kursy);
        osoby[1] = new PracownikUczelni("Stanisław", "Kowalski", "10987654321", "12/06/1979", "Dozorca", 6000, "C-13", 123);
        osoby[2] = new PracownikUczelniNaukowoDydaktyczny("Adam", "Brezdeń", "11111111111", "04/03/1981", "laborant", 5999, "W-11" , 3.3f);
        System.out.println("\n"+"Podpunkt a)");
        wyswietl_dane(osoby);
        System.out.println("\n"+"Podpunkt b)");
        wyszukaj_po_nazwisku(osoby, "Kowalski");
        System.out.println("\n"+"Podpunkt c)");
        wyszukaj_po_dorobku(osoby, 3.0f);
        System.out.println("\n"+"Podpunkt d)");
        wyszukaj_po_stanowisku(osoby, "Dozorca");
        System.out.println("\n"+"Podpunkt e)");
        usun_po_pesel(osoby, "12345678901");
        wyswietl_dane(osoby);
    }
}
