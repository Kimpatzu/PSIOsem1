import java.io.*;
public class Main {
    public static void main(String[] args) {
        int height = 5;
        int width  = 4;
        Matrix matrix = new Matrix(height, width);
        System.out.println(matrix.toString());
        float[] values = matrix.getAllValues(); //metoda getAllValues wrzuca wszystkie wartości komórek macierzy 2 wymiarowej do 1 wymiarowej tablicy
        for (int i=0; i< values.length; i++){
            System.out.println(values[i]);
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("matrix.bin");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream);
            dataOutputStream.write(height);
            dataOutputStream.write(width);
            for (int i=0; i< values.length; i++){
                dataOutputStream.writeFloat(values[i]);
            }
            dataOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Zakończono tworzenie pliku");
        try{
            FileInputStream fileInputStream = new FileInputStream("matrix.bin");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
            int newheight = dataInputStream.read();
            int newwidth = dataInputStream.read();
            for (int i=0; i<newheight; i++){
                for (int j=0; j<newwidth; j++){
                    System.out.print("    " + dataInputStream.readFloat());
                }
                System.out.println("\n");
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
