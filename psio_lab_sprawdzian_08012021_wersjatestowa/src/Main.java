import java.io.*;

public class Main {
    public static void main(String[] args){
        double liczba = 1.423;
        try{
            FileOutputStream plik = new FileOutputStream("liczby.dat");
            plik.write(1);
            plik.close();
        } catch (FileNotFoundException e){
            System.out.println("przegryw");
        } catch (IOException ioe){
            System.out.println("ioe");
        }
    }
}
