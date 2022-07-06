package frames;

import panels.NumbersPanel;
import panels.OperationsPanel;
import panels.OperationsPanel2;
import panels.TextPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BasicCalculatorFrame extends JFrame implements ActionListener {
    public NumbersPanel numbersPanel = new NumbersPanel();
    //public TextPanel screen = new TextPanel();
    //public OperationsPanel operationsPanel  = new OperationsPanel();
    //public OperationsPanel2 operationsPanel2 = new OperationsPanel2();
    JButton example = new JButton("1");

    public  BasicCalculatorFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(515,435);
        example.addActionListener(this);
        numbersPanel.add(example);
        this.add(numbersPanel);
        //this.add(operationsPanel);
        //this.add(operationsPanel2);
        //this.add(screen);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == numbersPanel){
            System.out.println("nnnn");
        }
    }
}
