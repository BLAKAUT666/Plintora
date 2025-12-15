package dominio.Config.Panel;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;

public class loginButton extends JButton{

	public loginButton(){
		// configuração basica
		Color color = new Color(155, 84, 64);
		setBackground(color);
		setPreferredSize(new Dimension(100, 100));
		setVisible(true);
    }
}
