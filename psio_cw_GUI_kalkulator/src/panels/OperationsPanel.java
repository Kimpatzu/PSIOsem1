package panels;

import javax.swing.*;
import java.awt.*;

public class OperationsPanel extends JPanel {
    public JButton divisionButton = new JButton("/");
    public JButton multiplicationButton = new JButton("X");
    public JButton minusButton = new JButton("-");
    public JButton plusButton = new JButton("+");
    public OperationsPanel(){
        this.setLayout(new GridLayout(4,1));
        this.setBackground(Color.green);
        this.setBounds(300,100,100,300);
        this.add(divisionButton);
        this.add(multiplicationButton);
        this.add(minusButton);
        this.add(plusButton);
    }
}
