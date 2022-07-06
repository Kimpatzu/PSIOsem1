package company.system;

public class Firma {
    private Pracownik[] pracownicy = new Pracownik[100];
    public Firma(){}

    public Pracownik[] getPracownicy(){
        return pracownicy;
    }
    public Pracownik getPracownik(int i){
        return pracownicy[i];
    }

    public Pracownik getPracownik(String nazwisko){
        Pracownik output = null;
        for (int i=0; i<pracownicy.length; i++){
            if (pracownicy[i]!=null) {
                if (nazwisko.equals(pracownicy[i].getNazwisko())) {
                    output = pracownicy[i];
                }
            }
        }
        return output;
    }

    public boolean addPracownik(Pracownik nowyPracownik){
        boolean czyDodany=true;
        int i=0;
        while (pracownicy[i]!=null){
            i++;
        }
        if (i==99){
            czyDodany = false;
        } else {
            for (int j=0; j<pracownicy.length; j++){
                if (pracownicy[j]!=null) {
                    if (nowyPracownik.getNazwisko().equals(pracownicy[j].getNazwisko())) {
                        czyDodany = false;
                    }
                }
            }
        } if (czyDodany){
            pracownicy[i]=nowyPracownik;
        }
        return czyDodany;
    }

    public boolean deletePracownik(String nazwiskoDoZwolnienia){
        boolean czyZwolniony = false;
        int i=0;
        while (i< pracownicy.length && !czyZwolniony){
            if (pracownicy[i]!=null) {
                if (pracownicy[i].getNazwisko().equals(nazwiskoDoZwolnienia)) {
                    czyZwolniony = true;
                    pracownicy[i] = null;
                }
                i++;
            }
        }
        return czyZwolniony;
    }

    public int getLiczbaRobotnikow(){
        int licznik=0;
        for (int i=0; i< pracownicy.length; i++){
            if (pracownicy[i] instanceof Robotnik){
                licznik++;
            }
        }
        return licznik;
    }

    public int getLiczbaNierobotnikow(){
        int licznik=0;
        for (int i=0; i< pracownicy.length; i++){
            if (pracownicy[i] instanceof Nierobotnik){
                licznik++;
            }
        }
        return licznik;
    }
    public float getSumaWyplat(){
        float suma=0;
        for (int i=0; i< pracownicy.length; i++){
            if (pracownicy[i]!=null){
                suma+=pracownicy[i].getWyplata();
            }
        }
        return suma;
    }
    public String getListaPlac(){
        Pracownik[] posortowaniPracownicy = getPracownicy();
        Pracownik pom = null;
        String stanowisko = null;
        String output="Nazwisko      Imie      Stanowisko     Wypłata    " + "\n";
        for (int i=0; i<pracownicy.length; i++){
            for (int j=1; j< pracownicy.length; j++){
                if (pracownicy[j]!=null && pracownicy[j-1]!=null) {
                    if (pracownicy[j - 1].getNazwisko().compareTo(pracownicy[j].getNazwisko()) > 1) {
                        pom = pracownicy[j];
                        pracownicy[j] = pracownicy[j - 1];
                        pracownicy[j - 1] = pom;
                    }
                } else if (pracownicy[j]!=null && pracownicy[j-1]==null){
                    pracownicy[j-1]=pracownicy[j];
                    pracownicy[j]=null;
                }
            }
        }
        for (int i=0; i< pracownicy.length; i++){
            if (pracownicy[i]!=null){
                if (pracownicy[i].isNierobtnik()){
                    stanowisko = "Nierobtnik";
                } else {
                    stanowisko = "Robotnik";
                }
                output+=pracownicy[i].getNazwisko()+"     "+pracownicy[i].getImie() + "       " + stanowisko + "      " + pracownicy[i].getWyplata() + "\n";
            }
        }
        return output;
    }
}
