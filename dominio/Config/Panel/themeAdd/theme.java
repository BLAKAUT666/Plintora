package dominio.Config.Panel.themeAdd;
import java.awt.Dimension;

import javax.swing.JButton;

public class theme extends JButton{
    public theme(){
        setText("Temas");
        setPreferredSize(new Dimension(100, 50));
        setBorder(null);
    }
}
