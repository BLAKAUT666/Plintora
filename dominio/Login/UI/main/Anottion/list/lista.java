package dominio.Login.UI.main.Anottion.list;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;

public class lista extends JButton{

    private static final Color BG = new Color(0, 0, 0);
    private static final Color FC = new Color(255, 255, 255);
    private static final Font FONT = new Font("Inter", 0, 20);

    public lista(){
        setVisible(true);
        setFont(FONT);
        setBackground(BG);
        setForeground(FC);
        setText("Lista");
        setPreferredSize(new Dimension(120, 40));
    }
}
