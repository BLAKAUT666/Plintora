package dominio.Login.UI.main.Anottion.add.input.descricao;

import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;

public class inputDescricao extends JTextArea {
    private static final Color BG = new Color(0, 0, 0);
    private static final Color FC = new Color(255, 255, 255);
    private static final Font FONT = new Font("Inter",0, 20);

    public inputDescricao(){
        setVisible(true);
        setFont(FONT);
        setBackground(BG);
        setForeground(FC);
        setBorder(null);
        setPreferredSize(new Dimension(400, 500));
        setSize(100, 40);
    }
}
