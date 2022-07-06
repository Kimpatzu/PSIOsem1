import macierze.Matrix;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Podaj rozmiar macierzy: ");
        int M = scanner.nextInt();
        Matrix matrix = new Matrix(M);
        matrix.createMatrix();
        Matrix matrix2= new Matrix(M);
        matrix2.createMatrix();
        System.out.println("Matrix 1: ");
        System.out.println(matrix.toString());
        System.out.println("\n");
        System.out.println("Matrix 2: ");
        System.out.println(matrix2.toString());
        System.out.println("\n");
        System.out.println("Addition of matrix 1 and matrix 2: ");
        System.out.println(matrix.addMatrix(matrix2).toString());
        System.out.println("\n");
        System.out.println("Multiplication of matrix1 by matrix2: ");
        System.out.println(matrix.multipleMatrix(matrix2));
        System.out.println("\n");
        System.out.println("Transposition of matrix1: ");
        System.out.println(matrix.transposeMatrix().toString());
        System.out.println("\n");
        System.out.println("Transposition of matrix2: ");
        System.out.println(matrix2.transposeMatrix().toString());
    }
}
