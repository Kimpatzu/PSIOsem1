package macierze;
import java.util.Random;

public class Matrix {
    private float tab[][];

    public Matrix(float tab[][]){
        this.tab = tab;
    }
    public Matrix(int M){
        this.tab = new float[M][M];
    }

    public int getLength(){
        return tab.length;
    }

    public float getCell(int i, int j){
        return tab[i][j];
    }

    public float[][] getTab(){
        return tab;
    }

    public String toString(){
        String output="";
        for (int i=0; i< getLength(); i++){
            for (int j=0; j< getLength(); j++){
                output+=tab[i][j] + "   ";
            }
            output+="\n";
        }
        return output;
    }

    public boolean setCell(int i, int j, float value){
        if (i >= getLength() || j>=getLength()){
            return false;
        }else {
            tab[i][j]=value;
            return true;
        }
    }
    public Matrix addMatrix(Matrix matrix2){
        if (getLength() != matrix2.getLength()){
            return null;
        } else{
            Matrix outputMatrix = new Matrix(getLength());
            for (int i=0; i< getLength(); i++){
                for (int j=0; j< getLength(); j++){
                    outputMatrix.setCell(i,j,getCell(i,j)+matrix2.getCell(i,j));
                }
            }
            return outputMatrix;
        }
    }
    public Matrix multipleMatrix(Matrix matrix2){
        if (getLength() != matrix2.getLength()){
            return null;
        }else{
            Matrix outputMatrix = new Matrix(getLength());
            float value=0;
            for (int i=0; i<getLength(); i++){
                for (int j=0; j<getLength(); j++){
                    for (int k=0; k<getLength(); k++){
                        value+=getCell(k,j)*matrix2.getCell(i,k);
                    }
                    outputMatrix.setCell(i,j,value);
                    value=0;
                }
            }
            return outputMatrix;
        }
    }
    public Matrix transposeMatrix(){
        Matrix outputMatrix = new Matrix(getLength());
        for (int i=0; i<getLength(); i++){
            for (int j=0; j<getLength(); j++){
                outputMatrix.setCell(j,i, getCell(i,j));
            }
        }
        return outputMatrix;
    }

    public void createMatrix(){
        Random random =  new Random();
        boolean isnegative;
        for (int i=0; i< getLength(); i++){
            for (int j=0; j< getLength(); j++){
                isnegative = random.nextBoolean();
                if(isnegative){
                    setCell(i,j, random.nextFloat()*(-1)*(10));
                } else{
                    setCell(i,j, random.nextFloat()*(10));
                }
            }
        }
    }

}
