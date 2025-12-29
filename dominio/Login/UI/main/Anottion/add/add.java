package dominio.Login.UI.main.Anottion.add;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;

public class add extends JButton{
    private static final Font FONT = new Font("Inter", 0, 20);

    public add(){
        setText("Adicionar");
        setBackground(Color.BLACK);
        setForeground(Color.WHITE);
        setSize(new Dimension(120, 40));
        setFont(FONT);
    }
}
