package dominio;
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;

public class text extends JLabel{
		
   public text(){
		// fonte
		Font font = new Font("Inter", 0, 20);
		// cor
		Color color = new Color(212, 182, 118);
		// configuração basica		
		setForeground(color);
		setFont(font);
		setText("Plintora");
   }
}
