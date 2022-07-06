package Operacje;

import GUI.ProgramWindow;
import Wyjatki.ZlyAdresPliku;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

public class GetFirstTextRow implements Observer {



    public GetFirstTextRow(){
    }
    @Override
    public void update(Observable o, Object arg) {
        try{
            if (arg == null){
                throw new ZlyAdresPliku();
            }
            FileInputStream fis = new FileInputStream((String) arg);
            Scanner scanner = new Scanner(fis);
            System.out.println(scanner.nextLine());
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(arg);
    }
}
