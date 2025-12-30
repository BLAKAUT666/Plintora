package dominio.Login.UI.main.Anottion.add.input.name;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;

public class inputName extends JTextField{
    private static final Color bg = new Color(0, 0, 0);
    private static final Color fc = new Color(255, 255, 255);
    private static final Font font = new Font("Inter", 0, 20);

    public inputName(){
        super(15);
        setVisible(true);
        setFont(font);
        setBackground(bg);
        setForeground(fc);
        setPreferredSize(new Dimension(300, 40));
        setBorder(null);
    }
}