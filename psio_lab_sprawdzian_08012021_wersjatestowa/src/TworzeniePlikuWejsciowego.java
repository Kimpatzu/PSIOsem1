import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TworzeniePlikuWejsciowego {
    public void tworzeniePliku() {
        double[] punkty = {1, 2, 5, -4, -3, -2, 2, -1};
        try {
            FileOutputStream plikBin = new FileOutputStream("PUNKTY.dat");
            BufferedOutputStream buforBin = new BufferedOutputStream(plikBin);
            DataOutputStream wynikBin = new DataOutputStream(buforBin);
            for (int i = 0; i < punkty.length; i++) {
                wynikBin.writeDouble(punkty[i]);
            }
            buforBin.close();
        } catch (IOException e) {
            System.out.println("nie udało się");
        }

    }
}