package dominio.Config.Panel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.*;

public class text extends JLabel {

    public text() {
        // fonte
        Font font = new Font("Inter", 4, 40);
        // cor
        Color color = new Color(255, 255, 255);
        // configuração basica
        setForeground(color);
        setFont(font);
        setText("Plintora");
        setBounds(100, 100, 100, 100);
        setLayout(new FlowLayout(FlowLayout.CENTER));
    }
}
