import java.io.*;

public class Main {
    public static void main(String[] args){
        Punkt punkt = new Punkt(0,0);
        try{
            FileInputStream plikPUNKTY = new FileInputStream("PUNKTY.dat");
            BufferedInputStream buforPUNKTY = new BufferedInputStream(plikPUNKTY);
            DataInputStream danePUNKTY = new DataInputStream(buforPUNKTY);
            try{
                while(true){
                    punkt.setX(danePUNKTY.readDouble());
                    punkt.setY(danePUNKTY.readDouble());
                    if (punkt.ktoraPolPlaszczyzna()==1){
                        try{
                            System.out.println("Zapisywanie do prawej");
                            FileOutputStream plikPP_PRAWA = new FileOutputStream("PP_PRAWA.dat");
                            BufferedOutputStream buforPP_PRAWA = new BufferedOutputStream(plikPP_PRAWA);
                            DataOutputStream PP_PRAWA = new DataOutputStream(buforPP_PRAWA);
                            PP_PRAWA.writeDouble(punkt.getX());
                            PP_PRAWA.writeDouble(punkt.getY());
                        } catch (IOException e) {
                            System.out.println("Błąd z PP_PRAWA");
                        }
                    }
                    if (punkt.ktoraPolPlaszczyzna()==2){
                        try{
                            System.out.println("Zapisywanie do lewej");
                            FileOutputStream plikPP_LEWA = new FileOutputStream("PP_LEWA.dat");
                            BufferedOutputStream buforPP_LEWA = new BufferedOutputStream(plikPP_LEWA);
                            DataOutputStream PP_LEWA = new DataOutputStream(buforPP_LEWA);
                            PP_LEWA.writeDouble(punkt.getX());
                            PP_LEWA.writeDouble(punkt.getY());
                        } catch (IOException e) {
                            System.out.println("Błąd z PP_PRAWA");
                        }
                    }

                }
            } catch (EOFException eof){
                buforPUNKTY.close();
            }
        } catch (FileNotFoundException e){
            System.out.println("Nie znaleziono pliku z danymi.");
        } catch (IOException e) {
            System.out.println("Błąd odczytu z pliku. ");
        }
    }
}
