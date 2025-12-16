package dominio.Config.Panel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;

public class inputName extends JTextField{

    public inputName(){
		// fonte do texto
		Font font = new Font("Fira Code", 0, 20);
		// cor da letra e cor de fundo
		Color textColor = new Color(23, 21, 21);
		Color backgroundColor = new Color(214, 210, 210);
		// tamanho do input
	    setBackground(backgroundColor);
		setForeground(textColor);
		setText("");
		setFont(font);
		setVisible(true);
		setSize(new Dimension(100, 100));
		setPreferredSize(new Dimension(120, 40));

		Insets margin = new Insets(100, 100, 100, 100);

		setMargin(margin);

		// position
		setBounds(100, 100, 100, 100);

	}



}
