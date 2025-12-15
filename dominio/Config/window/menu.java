package dominio.Config.window;
import javax.swing.JFrame;

public class menu extends JFrame{
   // config basic of JFrame
	public menu(){
		// configuração basica
		setVisible(true);
		setTitle("Plintora");
		setSize(400, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		// icon
		String pathIcon = "src/assets/icon/iconApp.png";
		setIconImage(new javax.swing.ImageIcon(pathIcon).getImage());
    }
}
