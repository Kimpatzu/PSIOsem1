import punkty_i_kola.*;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        int n=10;
        float x;
        float y;
        float r;

        Random random = new Random();
        Kolo[] tab = new Kolo[n];
        for (int i=0; i<n; i++){
            x = random.nextFloat()*10;
            y = random.nextFloat()*10;
            r = random.nextFloat()+1;
            tab[i] =new Kolo(x,y,r);
            //System.out.println(tab[i].getS_X());
            //System.out.println(tab[i].getS_Y());
            //System.out.println(tab[i].getR());
        }
        Zbior_kol zbior = new Zbior_kol(tab);
        Zbior_kol maja_5_5 = new Zbior_kol(zbior.kola_z_5_5());
        for (int i=0; i<maja_5_5.getLenght()-1; i++){
            System.out.println(maja_5_5.getX(i));
            System.out.println(maja_5_5.getY(i));
            System.out.println(maja_5_5.getR(i));
        }
        System.out.println(" ");
        System.out.println(maja_5_5.getLenght()-1);
        System.out.println(" ");
    }
}
