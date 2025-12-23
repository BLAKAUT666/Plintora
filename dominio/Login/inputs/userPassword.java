package dominio.Login.inputs;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

public class userPassword extends JTextField {

    private Color background = new Color(255, 255, 255);
    private Color textColor = new Color(0, 0, 0);
    private Font font = new Font("Inter", 0, 30);

    public userPassword() {
        setVisible(true);
        setSize(100, 40);
        setBackground(background);
        setForeground(textColor);
        setFont(font);
    }
}
