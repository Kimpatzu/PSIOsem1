import java.io.*;

public class Main {
    public static void main(String[] args){
        //TworzeniePlikuWejsciowego tpw = new TworzeniePlikuWejsciowego();     //te dwie linijki pod komentarzem tworzą plik PUNKTY.dat
        //tpw.tworzeniePliku();
        Punkt p = new Punkt(0,0);
        try{
            FileInputStream fis = new FileInputStream("PUNKTY.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            try{
                while(true){
                    p = (Punkt)ois.readObject();
                    FileOutputStream fosPP_PRAWA = new FileOutputStream("PP_PRAWA.dat");
                    ObjectOutputStream oosPP_PRAWA = new ObjectOutputStream(fosPP_PRAWA);
                    FileOutputStream fosPP_LEWA = new FileOutputStream("PP_LEWA.dat");
                    ObjectOutputStream oosPP_LEWA = new ObjectOutputStream(fosPP_LEWA);
                    if (p.getX()>0){
                        oosPP_PRAWA.writeObject(p);
                    } else if (p.getX()<0){
                        oosPP_LEWA.writeObject(p);
                    }
                }
            } catch (ClassNotFoundException classNotFoundException){
                classNotFoundException.printStackTrace();
            } catch (EOFException eofException){
                fis.close();
                System.out.println("Skończyły się dane");
            }
        } catch (FileNotFoundException fileNotFoundException){
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException){
            ioException.printStackTrace();
        }
        try{
            FileInputStream fisPP_PRAWA = new FileInputStream("PP_PRAWA.dat");
            ObjectInputStream oisPP_PRAWA = new ObjectInputStream(fisPP_PRAWA);
            FileInputStream fisPP_LEWA = new FileInputStream("PP_LEWA.dat");
            ObjectInputStream oisPP_LEWA = new ObjectInputStream(fisPP_LEWA);
            Punkt p2 = new Punkt(0,0);
            try{
                System.out.println("Punkty w prawej pół-płaszczyźnie: ");
                while(true){
                    p2 =(Punkt) oisPP_PRAWA.readObject();
                    System.out.println(p2);
                }
            } catch (ClassNotFoundException classNotFoundException){
                classNotFoundException.printStackTrace();
            } catch (EOFException eofException){
                fisPP_PRAWA.close();
            }
            try{
                System.out.println("Punkty w lewej pół-płaszczyźnie: ");
                while(true){
                    p2 =(Punkt) oisPP_LEWA.readObject();
                    System.out.println(p2);
                }
            } catch (ClassNotFoundException classNotFoundException){
                classNotFoundException.printStackTrace();
            } catch (EOFException eofException){
                fisPP_LEWA.close();
            }
        } catch (FileNotFoundException fileNotFoundException){
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException){
            ioException.printStackTrace();
        }
    }
}
