package dominio.Config;
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;

public class text extends JLabel{

   public text(){
		// fonte
		Font font = new Font("Inter", 0, 40);
		// cor
		Color color = new Color(255, 255, 255);
		// configuração basica
		setForeground(color);
		setFont(font);
		setText("Plintora");
   }
}
