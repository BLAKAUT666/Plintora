package services;

import dominio.Config.Panel.loginButton;
import dominio.Config.Panel.panel;
import dominio.Config.Panel.text;
import dominio.Config.Panel.themeAdd.add;
import dominio.Config.user;
import dominio.Config.window.menu;
import dominio.Login.Login;
import dominio.Login.inputs.userName;
import dominio.Login.inputs.userPassword;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class components {

    // componentes principais
    private menu mainMenu = new menu();
    private panel painel = new panel();
    private text textMain = new text();
    private userName inputName = new userName();
    private userPassword inputPassword = new userPassword();
    private loginButton buttonLogin = new loginButton();

    public components() {
        main();
        getIds();
    }

    private void main() {
        painel.setLayout(new GridLayout(0, 1));
        painel.add(textMain);
        painel.add(inputName);
        painel.add(inputPassword);
        painel.add(buttonLogin);

        // menu
        mainMenu.add(painel);
    }

    // pegando o username,password
    private void getIds() {
        buttonLogin.addMouseListener(
            new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent event) {
                    System.out.println("Funcionou!!!");
                }
            }
        );
    }
}
