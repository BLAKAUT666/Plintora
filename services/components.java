package services;
import dominio.Config.Panel.panel;
import dominio.Config.Panel.text;
import dominio.Config.Panel.textField;
import dominio.Config.Panel.themeAdd.add;
import dominio.Config.window.menu;

public class components{

    public components(){
		main();
	}

	private void main(){
		// add themes
		add tema = new add();
		// text Label
		text l = new text();
		// input
		textField i = new textField();
		// painel
		panel painel = new panel();
		painel.add(l);
		painel.add(i);
		painel.add(tema);

		// menu
		menu m = new menu();
		m.add(painel);
	}
}
