package dominio;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;

public class textField extends JTextField{
     
     public textField(){
		// fonte do texto
		Font font = new Font("Fira Code", 0, 10);
		// cor da letra e cor de fundo
		Color textColor = new Color(255, 255, 255);
		Color backgroundColor = new Color(0, 0, 0);
		// tamanho do input
	    setBackground(backgroundColor);	
		setForeground(textColor);
		setText("Gmail ou Nome de Usuario");
		setFont(font);
	 }
}
