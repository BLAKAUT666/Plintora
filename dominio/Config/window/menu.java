package dominio.Config.window;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class menu extends JFrame{
	private final Color COLOR = new Color(22, 13, 31);

   // config basic of JFrame
	public menu(){
		// configuração basica
		setVisible(true);
		setTitle("Plintora");
		setSize(new Dimension(500, 600));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setBackground(COLOR);

		// icon
		String pathIcon = "src/assets/icon/iconApp.png";
		setIconImage(new javax.swing.ImageIcon(pathIcon).getImage());
    }
}
