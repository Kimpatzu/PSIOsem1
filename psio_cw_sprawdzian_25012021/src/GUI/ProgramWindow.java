package GUI;

import Operacje.GetFirstTextRow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Observable;
import java.util.Observer;


public class ProgramWindow extends Observable implements ActionListener {

    private ArrayList<Observer> observers = new ArrayList<>();
    private JButton zatwierdzButton = new JButton("Zatwierdz");
    private JTextField adresPliku = new JTextField();
    private JTextField wynikTextField = new JTextField();
    private GetFirstTextRow getFirstTextRow = new GetFirstTextRow();


    public ProgramWindow() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500,500));
        frame.setLayout(new GridLayout(0,1));

        JLabel napisPlik = new JLabel("Plik");
        frame.add(napisPlik);
        frame.add(adresPliku);
        JLabel napisWynik = new JLabel("Wynik");
        frame.add(napisWynik);
        frame.add(wynikTextField);
        JButton zatwierdzButton = new JButton("Zatwierdz");
        zatwierdzButton.setSize(100,50);
        zatwierdzButton.addActionListener(this);
        frame.add(zatwierdzButton);

        frame.setVisible(true);
    }

    public String getAdresPliku(){
        return adresPliku.toString();
    }

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }

    @Override
    public synchronized void deleteObserver(Observer o) {
        super.deleteObserver(o);
    }

    @Override
    public void notifyObservers() {
        super.notifyObservers();
    }

    @Override
    public void notifyObservers(Object arg) {
        super.notifyObservers(arg);
    }

    @Override
    public synchronized void deleteObservers() {
        super.deleteObservers();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = e.getActionCommand();
        if (input == "Zatwierdz"){
            System.out.println("powiadomiono");
            getFirstTextRow.update(this,adresPliku.getText());
        }
    }
}
