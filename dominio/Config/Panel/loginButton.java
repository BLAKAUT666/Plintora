package dominio.Config.Panel;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

public class loginButton extends JButton{
	private inputName name = new inputName();

	public loginButton(){
		// configuração basica
		Color color = new Color(155, 84, 64);
		Font fontButton = new Font("Inter", 4, 20);

		setBackground(color);
		setPreferredSize(new Dimension(120, 40));
		setVisible(true);
		setText("Entrar");
		setFont(fontButton);
		
		clickButton();
    }


	// click button
	private void clickButton(){
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent event){
				try {

					File fileName = new File(name.getText() + ".txt");
					boolean isCreate = fileName.createNewFile();

					if(isCreate == true){
						System.out.println("arquivo criado com sucesso");
					}

				} catch(IOException error){
					error.printStackTrace();
				}
			}
		});
	}
}
