import java.io.Serializable;
import java.util.Random;

public class Matrix {
    private int height;
    private int width;
    private float[][] matrix;

    public Matrix(int height, int width){
        this.height = height;
        this.width  = width;
        this.matrix = new float[height][width];
        this.createMatrix();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public float[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(float[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public String toString(){
        String output="";
        for (int i=0; i<height; i++){
            for (int j=0; j<width; j++){
                output+="   " + matrix[i][j];
            }
            output+="\n";
        }
        return output;
    }

    private void createMatrix(){
        Random random = new Random();
        for (int i=0; i<height; i++){
            for (int j=0; j<width; j++){
                matrix[i][j] = random.nextFloat()*100;
            }
        }
    }

    public float[] getAllValues(){
        float[] values = new float[height*width];
        int k=0;
        for (int i=0; i<height; i++){
            for(int j=0; j<width; j++){
                values[k]=matrix[i][j];
                k++;
            }
        }
        return values;
    }

}
