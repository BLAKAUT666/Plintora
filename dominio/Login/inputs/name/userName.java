package dominio.Login.inputs.name;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;

public class userName extends JTextField {

    private Color background = new Color(0, 0, 0);
    private Color textColor = new Color(255, 255,255);
    private Font font = new Font("Inter", 0, 20);

    public userName() {
        setVisible(true);
        setPreferredSize(new Dimension(300, 38));
        setBackground(background);
        setForeground(textColor);
        setFont(font);
        setBorder(null);
    }
}
