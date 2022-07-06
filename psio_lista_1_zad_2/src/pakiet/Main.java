package pakiet;

public class Main {
    public static void main(String[] args){
        int n=5;
        int i=1;
        while(n!=0){
            if (n%2==0){
                System.out.println(i + ", " + n + ", parzyste " + n/2);
                n=n/2;
            } else {
                System.out.println(i + ", " + n + ", nieparzyste " + (3*n+1));
                n=3*n+1;
            }
            i++;
        }

    }
}
