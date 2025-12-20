package services;
import dominio.Config.Panel.loginButton;
import dominio.Config.Panel.panel;
import dominio.Config.Panel.text;
import java.awt.GridLayout;
import dominio.Config.Panel.themeAdd.add;
import dominio.Config.window.menu;
import dominio.Login.Login;

public class components{
	// componentes principais
	private menu mainMenu = new menu();
	private panel painel = new panel();
	private text textMain = new text();
    private Login login = new Login();

    public components(){
		main();
	}

	private void main(){
		painel.setLayout(new GridLayout(0, 1));
		// menu
		mainMenu.add(painel);
	}
}
