package services;
import dominio.menu;
import dominio.panel;
import dominio.text;
import dominio.textField;

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
