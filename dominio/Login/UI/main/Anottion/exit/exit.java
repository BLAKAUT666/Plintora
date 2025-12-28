package dominio.Login.UI.main.Anottion.exit;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;

public class exit extends JButton{
    private static final Font FONT = new Font("Inter", 0, 20);

    public exit(){
        setText("Sair");
        setVisible(true);
        setBackground(Color.BLACK);
        setForeground(Color.WHITE);
        setFont(FONT);
        setSize(new Dimension(120, 40));
    }
}
