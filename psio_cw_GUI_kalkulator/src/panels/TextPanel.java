package panels;

import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel {
    public JLabel screen = new JLabel("qwe");
    public TextPanel(){
        this.setBackground(Color.lightGray);
        this.setLayout(new BorderLayout());
        this.setBounds(0,0,500,100);
        screen.setFont(new Font("Times New Roman",Font.PLAIN,60));
        this.add(screen,BorderLayout.EAST);
    }
    public void setScreenText(String text){
        screen.setText(text);
    }
}
