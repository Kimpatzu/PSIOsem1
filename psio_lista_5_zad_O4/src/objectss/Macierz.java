package objectss;

public class Macierz {
    private int[][] macierz;

    public Macierz(int[][] macierz) {
        this.macierz = macierz;
    }
    public Macierz(int n, int m){
        this.macierz = new int[n][m];
    }


    public int[][] getMacierz() {
        return macierz;
    }

    public int getCell(int i, int j){
        return macierz[i][j];
    }
    public String toString(){
        String output="";
        for (int i=0; i<macierz.length; i++){
            for (int j=0; j<macierz[0].length; j++){
                output+=macierz[i][j]+"    ";
            }
            output+="\n";
        }
        return output;
    }
    public int getMaxValue(){
        int max=macierz[0][0];
        for (int i=0; i< macierz.length; i++){
            for (int j=0; j<macierz[0].length; j++){
                if (macierz[i][j]>max){
                    max = macierz[i][j];
                }
            }
        }
        return max;
    }
    public Indeks getIndeksOfMaxValue(){
        int max=macierz[0][0];
        Indeks indeks = new Indeks(0,0);
        for (int i=0; i< macierz.length; i++){
            for (int j=0; j<macierz[0].length; j++){
                if (macierz[i][j]>max){
                    max = macierz[i][j];
                    indeks.setI(i);
                    indeks.setJ(j);
                }
            }
        }
        return indeks;
    }
    public int getMaxValueRow(){
        int max=0;
        for (int i=0; i<macierz.length; i++){
            max+=macierz[i][0];
        }
        int row_number=0;
        int pom=0;
        for (int j=0; j<macierz.length; j++){
            pom=0;
            for (int i=0; i<macierz[0].length; i++){
                pom+=macierz[i][j];
            }
            if (pom>max){
                max = pom;
                row_number = j;
            }
        }
        return row_number;
    }
    public boolean isValueInMatrix(int value){
        boolean is = false;
        for (int i=0; i<macierz.length; i++){
            for (int j=0; j<macierz[0].length; j++){
                if (macierz[i][j]==value){
                    is = true;
                    break;
                }
            }
        }
        return is;
    }
    public int occurrenceOfValueInMatrix(int value){
        int counter = 0;
        for (int i=0; i<macierz.length; i++){
            for (int j=0; j<macierz[0].length; j++){
                if (macierz[i][j]==value){
                    counter++;
                }
            }
        }
        return counter;
    }
    public boolean isMultivalent(){
        boolean ismultiavalent = true;
        int licznik=0;
        for (int i=0; i<macierz.length; i++){
            licznik=0;
            for (int j=0; j< macierz[0].length; j++){
                if (occurrenceOfValueInMatrix(macierz[i][j])==2){
                    ismultiavalent = false;
                }
            }
        }
        return ismultiavalent;
    }
    public Macierz transposeMatrix(){
        int[][] newMatrix = new int[macierz[0].length][macierz.length];
        for (int i=0; i< macierz.length; i++){
            for (int j=0; j<macierz[0].length; j++){
                newMatrix[j][i]=macierz[i][j];
            }
        }
        return new Macierz(newMatrix);
    }

    public void setMacierz(int[][] macierz) {
        this.macierz = macierz;
    }
}
