package dominio.Login.UI.main.Anottion.add.btnClick.descricao;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class btnDescricao extends JButton{

    private static final Color bg = new Color(0, 0, 0);
    private static final Color fc = new Color(255, 255,255);
    private static final Font font = new Font("Inter", 0, 20);

    public btnDescricao(){
        setText("Salvar");
        setFont(font);
        setBackground(bg);
        setForeground(fc);
        setSize(new Dimension(120, 40));
    }
}
