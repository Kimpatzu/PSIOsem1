import java.util.Scanner;
import Daty.Data;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Data data1 = new Data(11,4,1998);
        Data data2 = new Data(12, 5,2020);
        //System.out.println(data1.oKDniWczesniej(1234));
        //System.out.println(data1.oKDniPozniej(1234));
        //System.out.println(data1.ktoryDzienRoku());
        System.out.println(data1.ileDniPomiędzy(data1,data2));
    }
}
