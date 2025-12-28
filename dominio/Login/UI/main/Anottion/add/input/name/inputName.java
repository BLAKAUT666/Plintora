package dominio.Login.UI.main.Anottion.add.input.name;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JTextArea;

public class inputName extends JTextArea{
    private static final Color BG = new Color(0, 0, 0);
    private static final Color FC = new Color(255, 255, 255);
    private static final Font FONT = new Font("Inter",0, 20);

    public inputName(){
        setVisible(true);
        setFont(FONT);
        setBackground(BG);
        setForeground(FC);
        setBorder(null);
        setPreferredSize(new Dimension(300, 38));
        setSize(100, 40);
    }
}
