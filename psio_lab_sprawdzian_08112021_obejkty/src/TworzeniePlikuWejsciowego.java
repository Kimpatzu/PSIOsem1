import java.io.*;

public class TworzeniePlikuWejsciowego {
    public void tworzeniePliku() {
        Punkt p1 = new Punkt(1.23,2.34);
        Punkt p2 = new Punkt(-5.34, 3.13);
        Punkt p3 = new Punkt(0.58, -4.89);
        Punkt p4 = new Punkt(-2.72, -1.53);
        Punkt[] punkty = new Punkt[4];
        punkty[0] = p1;
        punkty[1] = p2;
        punkty[2] = p3;
        punkty[3] = p4;
        try{
            FileOutputStream fos = new FileOutputStream("PUNKTY.dat");
            ObjectOutputStream plikPunkty  = new ObjectOutputStream(fos);
            for (int i=0; i< punkty.length; i++){
                plikPunkty.writeObject(punkty[i]);
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}