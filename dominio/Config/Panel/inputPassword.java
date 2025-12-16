package dominio.Config.Panel;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

public class inputPassword extends JTextField {
    // fonte do texto
	private	Font font = new Font("Fira Code", 0, 20);
    // cor da letra e cor de fundo
	private	Color textColor = new Color(23, 21, 21);
	private	Color backgroundColor = new Color(214, 210, 210);


    public inputPassword(){
        setVisible(true);
        setPreferredSize(new Dimension(120, 40));
        setFont(font);
        setForeground(textColor);
        setBackground(backgroundColor);
        setText("");
    }
}
