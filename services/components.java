package services;
import dominio.Config.Panel.loginButton;
import dominio.Config.Panel.panel;
import dominio.Config.Panel.text;
import dominio.Config.Panel.textField;
import dominio.Config.Panel.themeAdd.add;
import dominio.Config.window.menu;

public class components{
	// componentes principais
	private menu mainMenu = new menu();
	private panel painel = new panel();	
	private text textMain = new text();
	private textField inputUserName = new textField();
	private loginButton loginButtonClick = new loginButton();

    public components(){
		main();
	}

	private void main(){
		// painel principal
		painel.add(textMain);
		painel.add(inputUserName);
		painel.add(loginButtonClick);
		// menu
		mainMenu.add(painel);
	}
}
