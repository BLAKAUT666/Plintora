package services;
import dominio.Config.menu;
import dominio.Config.panel;
import dominio.Config.text;
import dominio.Config.textField;

public class components{

    public components(){
		main();
	}

	private void main(){
		// text Label
		text l = new text();
		// input
		textField i = new textField();
		// painel
		panel painel = new panel();
		painel.add(l, i);

		menu m = new menu();
		m.add(painel);

	}
}
