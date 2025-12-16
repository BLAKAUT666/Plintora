package services;
import dominio.Config.Panel.loginButton;
import dominio.Config.Panel.panel;
import dominio.Config.Panel.text;

import java.awt.GridLayout;

import dominio.Config.Panel.inputName;
import dominio.Config.Panel.inputPassword;
import dominio.Config.Panel.themeAdd.add;
import dominio.Config.window.menu;

public class components{
	// componentes principais
	private menu mainMenu = new menu();
	private panel painel = new panel();
	private text textMain = new text();
	private inputName inputUserName = new inputName();
	private loginButton loginButtonClick = new loginButton();
	private inputPassword password = new inputPassword();

    public components(){
		main();
	}

	private void main(){
		painel.setLayout(new GridLayout(0, 1));

		// painel principal
		painel.add(textMain);
		painel.add(inputUserName);
		painel.add(password);
		painel.add(loginButtonClick);
		// menu
		mainMenu.add(painel);
	}
}
