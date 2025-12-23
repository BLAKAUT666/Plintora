package dominio.Config.Panel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.*;

public class loginButton extends JButton {

    public loginButton() {
        // configuração basica
        Color color = new Color(155, 84, 64);
        Font fontButton = new Font("Inter", 4, 20);

        setBackground(color);
        setPreferredSize(new Dimension(120, 40));
        setVisible(true);
        setText("Entrar");
        setFont(fontButton);
    }
}
