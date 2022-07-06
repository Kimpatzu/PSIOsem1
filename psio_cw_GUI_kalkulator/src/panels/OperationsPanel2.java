package panels;

import javax.swing.*;
import java.awt.*;

public class OperationsPanel2 extends JPanel {
    public JButton switchToScientificModeButton = new JButton("Sc");
    public JButton clearButton = new JButton("C");
    public JButton allClearButton = new JButton("AC");
    public JButton equalsButton = new JButton("=");
    public OperationsPanel2(){
        this.setLayout(new GridLayout(4,1));
        this.setBackground(Color.yellow);
        this.setBounds(400,100,100,300);
        this.add(switchToScientificModeButton);
        this.add(clearButton);
        this.add(allClearButton);
        this.add(equalsButton);
    }
}
