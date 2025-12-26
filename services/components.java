package services;

import dominio.Config.Panel.loginButton;
import dominio.Config.Panel.panel;
import dominio.Config.Panel.text;
import dominio.Config.user;
import dominio.Config.window.menu;
import dominio.Login.inputs.userName;
import dominio.Login.inputs.userPassword;
import services.list.ListUser;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Scanner;

public class components {
    // componentes principais
    private menu mainMenu = new menu();
    private panel painel = new panel();
    private text textMain = new text();
    private userName inputName = new userName();
    private userPassword inputPassword = new userPassword();
    private loginButton buttonLogin = new loginButton();
    private ListUser list = new ListUser();

    public components() {
        main();
        clickButton();
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
        
    private void clickButton(){
        // pegando userName, passWord
        buttonLogin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {

                // name
                String nome = inputName.getText();
                String password = inputPassword.getText();

                user usuario = new user(nome, password);
                usuario.dados();

                // adicionando usuarios
                list.saveUser(usuario);
            }
        });
    }
}
