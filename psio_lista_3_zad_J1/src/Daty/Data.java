package Daty;

public class Data {
    private int dzien;
    private int miesiac;
    private int rok;
    public Data(int dzien, int miesiac, int rok){
        this.dzien = dzien;
        this.miesiac = miesiac;
        this.rok = rok;
    }
    public int getDzien(){
        return this.dzien;
    }
    public int getMiesiac(){
        return  this.miesiac;
    }
    public int getRok(){
        return  this.rok;
    }
    public boolean czy_przestepny(){
        if (this.rok%4==0){
            return true;
        }
        else return false;
    }
    public void setDzien(int dzien){
        this.dzien=dzien;
    }
    public void setMiesiac(int miesiac){
        this.miesiac=miesiac;
    }
    public void setRok(int rok){
        this.rok=rok;
    }
    public boolean czy_poprawna(){
        if (this.dzien<1 || this.miesiac<1){
            return false;
        }
        if (this.miesiac>12){
            return false;
        }
        if(this.miesiac==1 || this.miesiac==3 || this.miesiac==5 || this.miesiac==7|| this.miesiac==8|| this.miesiac==10|| this.miesiac==12){
            if (this.dzien>31){
                return false;
            }
        }
        if(this.miesiac==4 || this.miesiac==6 || this.miesiac==9 || this.miesiac==11){
            if (this.dzien>30){
                return false;
            }
        }
        if (czy_przestepny()){
            if (this.dzien>29){
                return false;
            }
        } else {
            if (this.dzien>28){
                return false;
            }
        }
        return true;
    }
    public boolean czyWcześniejsza (Data data1, Data data2){
        if (data1.getRok()<data2.getRok()){
            return true;
        } else if (data1.getMiesiac()< data2.getMiesiac()){
            return true;
        } else if (data1.getDzien()<data2.getDzien()){
            return  true;
        } else return  false;
    }
    public int ileDniWMiesiacu (Data data){
        if (data.getMiesiac()==1 || data.getMiesiac()==3 || data.getMiesiac()==5 || data.getMiesiac()==7 || data.getMiesiac()==8 || data.getMiesiac()==10 || data.getMiesiac()==12){
            return 31;
        } else if (data.getMiesiac() == 2){
            if (data.czy_przestepny()){
                return 29;
            }
            else return  28;
        } else return 30;
    }
    public int ileDniWMiesiacu (){
        if (this.miesiac==1 || this.miesiac==3 || this.miesiac==5 || this.miesiac==7 || this.miesiac==8 || this.miesiac==10 || this.miesiac==12){
            return 31;
        } else if (this.miesiac == 2){
            if (this.czy_przestepny()){
                return 29;
            }
            else return  28;
        } else return 30;
    }
    public Data oKDniPozniej (int  K){
        Data  data = new Data(this.dzien, this.miesiac, this.rok);
        while (K!=0){
            if (data.getDzien() == data.ileDniWMiesiacu()){
                if (data.getMiesiac() == 12){
                    data.setRok(data.getRok()+1);
                    data.setMiesiac(1);
                    data.setDzien(1);
                    K--;
                } else {
                    data.setMiesiac(data.getMiesiac()+1);
                    data.setDzien(1);
                    K--;
                }

            } else if (K < data.ileDniWMiesiacu() - data.getDzien()){
                data.setDzien(data.getDzien()+K);
                K=0;
            } else {
                K-=data.ileDniWMiesiacu()- data.getDzien();
                data.setDzien(data.ileDniWMiesiacu());
            }
        }
        return data;
    }
    public Data oKDniWczesniej(int K){
        Data data = new Data(this.dzien, this.miesiac, this.rok);
        while(K!=0){
            if (data.getDzien() == 1){
                if (data.getMiesiac() == 1){
                    data.setDzien(30);
                    data.setMiesiac(12);
                    data.setRok(data.getRok()-1);
                    K--;
                } else {
                    data.setMiesiac(data.getMiesiac()-1);
                    data.setDzien(data.ileDniWMiesiacu());
                    K--;
                }
            } else if (K < data.getDzien()){
                data.setDzien(data.getDzien()-K);
                K=0;
            } else {
                K -= (data.getDzien()-1);
                data.setDzien(1);
            }
        }
        return data;
    }
    public int  ktoryDzienRoku(){
        Data data = new Data(this.dzien, this.miesiac, this.rok);
        int k=1;
        while (data.getDzien() != 1 || data.getMiesiac()!= 1){
            if (data.getDzien() == 1){
                data.setMiesiac(data.getMiesiac()-1);
                data.setDzien(data.ileDniWMiesiacu());
                k++;
            }
            if (data.getDzien() != 1){
                k+= data.getDzien()-1;
                data.setDzien(1);
            }
        }
        return k;
    }
    public int ileDniPomiędzy(Data data1 , Data data2){
        int k=0;
        if (!czyWcześniejsza(data1, data2)) {
            Data pom = new Data(data1.getDzien(), data1.getMiesiac(), data1.getRok());
            data1.setDzien(data2.getDzien());
            data1.setMiesiac(data2.getMiesiac());
            data1.setRok(data2.getRok());
            data2.setDzien(pom.getDzien());
            data2.setMiesiac(pom.getMiesiac());
            data2.setRok(pom.getRok());
            pom = null;
        }
        while (data1.getDzien() != data2.getDzien() || data1.getMiesiac() != data2.getMiesiac() || data1.getRok() != data2.getRok()) {
            if (data1.getRok() != data2.getRok()) {
                k += data2.ktoryDzienRoku();
                data2.setRok(data2.getRok() - 1);
                data2.setMiesiac(12);
                data2.setDzien(31);
            }
            if (data1.getRok() == data2.getRok()) {
                if (data1.getMiesiac() != data2.getMiesiac()) {
                    if (data2.getDzien() != 1) {
                        k += data2.getDzien() - 1;
                        data2.setDzien(1);
                    }
                    if (data2.getDzien() == 1) {
                        data2.setMiesiac(data2.getMiesiac() - 1);
                        data2.setDzien(data2.ileDniWMiesiacu());
                        k++;
                    }
                } else {
                    k += data2.getDzien() - data1.getDzien();
                    data2.setDzien(data1.getDzien());
                }
            }
        }
        return k;
    }
    public String toString(){
        return this.dzien + "/" + this.miesiac + "/" + this.rok;
    }
}
