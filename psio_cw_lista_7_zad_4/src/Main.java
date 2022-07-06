import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        try{
        FileReader reader = new FileReader("dane.txt");
        FileWriter writer = new FileWriter("wynik.txt");

        }
        catch (IOException | ClassNotFoundException e){
            e.printStackTrace(System.out);
        };

    }
}
