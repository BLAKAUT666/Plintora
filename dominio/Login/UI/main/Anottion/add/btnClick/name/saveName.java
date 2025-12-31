package dominio.Login.UI.main.Anottion.add.btnClick.name;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;

public class saveName extends JButton{
    private static final Color BG = new Color(0, 0, 0);
    private static final Color FC = new Color(255, 255, 255);
    private static final Font FONT = new Font("Inter", 0, 20) ;

    public saveName(){
        setText("Salvar");
        setBackground(BG);
        setForeground(FC);
        setFont(FONT);
        setSize(new Dimension(120, 40));
    }
}
