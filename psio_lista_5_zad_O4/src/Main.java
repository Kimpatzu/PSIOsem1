import objectss.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int[][] generateMatrix(int n, int m){
        Random random = new Random();
        int[][] matrix = new int[n][m];
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                matrix[i][j] = random.nextInt(200)-100;
            }
        }
        return matrix;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę wierszy macierzy: ");
        int n = scanner.nextInt();
        System.out.println("Podaj liczbę kolumn macierzy: ");
        int m = scanner.nextInt();
        Macierz matrix = new Macierz(generateMatrix(n,m));
        System.out.println(matrix);
        System.out.println("Maksymalna wartość w macierzy:  ");
        System.out.println(matrix.getMaxValue());
        System.out.println("Indeks maksymalnej wartości: ");
        System.out.println(matrix.getIndeksOfMaxValue());
        System.out.println("Wiersz o maksymalnej wartości: ");
        //System.out.println(matrix.getMaxValueRow());
        System.out.println("Sprawdź czy wartość jest w macierzy: ");
        int value = scanner.nextInt();
        System.out.println(matrix.isValueInMatrix(value));
        System.out.println("Czy macierz jest różnowartościowa: "+matrix.isMultivalent());
        Macierz matrix2 = matrix.transposeMatrix();
        System.out.println("Macierz transponowana: ");
        System.out.println(matrix2);
    }
}
