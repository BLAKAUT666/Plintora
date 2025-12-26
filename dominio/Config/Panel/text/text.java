package dominio.Config.Panel.text;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.*;

public class text extends JLabel {

    public text() {
        // fonte
        Font font = new Font("Inter", 2, 60);
        // cor
        Color color = new Color(0, 0, 0);
        // configuração basica
        setForeground(color);
        setFont(font);
        setText("Plintora");
        setLayout(new FlowLayout(FlowLayout.CENTER));
    }
}
