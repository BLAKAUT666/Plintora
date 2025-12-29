package services.Components;
import dominio.Config.Panel.buttonLogin.buttonPanel;
import dominio.Config.Panel.buttonLogin.loginButton;
import dominio.Config.Panel.panel.panel;
import dominio.Config.Panel.text.text;
import dominio.Config.Panel.text.textPanel;
import dominio.Config.user.user;
import dominio.Config.window.menu;
import dominio.Login.UI.main.Anottion.add.add;
import dominio.Login.UI.main.Anottion.add.addPane;
import dominio.Login.UI.main.Anottion.add.btnClick.panelSave;
import dominio.Login.UI.main.Anottion.add.btnClick.saveName;
import dominio.Login.UI.main.Anottion.add.input.descricao.*;
import dominio.Login.UI.main.Anottion.add.input.name.*;
import dominio.Login.UI.main.Anottion.exit.*;
import dominio.Login.UI.main.Anottion.list.list;
import dominio.Login.UI.main.Anottion.list.lista;
import dominio.Login.UI.main.Anottion.list.panelList;
import dominio.Login.inputs.name.namePanel;
import dominio.Login.inputs.name.userName;
import dominio.Login.inputs.password.passPanel;
import dominio.Login.inputs.password.userPassword;
import services.list.ListUser;
import services.loginOk.loginOk;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class components {
    // componentes principais
    private menu mainMenu = new menu();
    private panel painel = new panel();
    private text textMain = new text();
    private userName inputName = new userName();
    private userPassword inputPassword = new userPassword();
    private loginButton buttonLogin = new loginButton();
    private ListUser list = new ListUser();
    private loginOk login = new loginOk();
    private passPanel panelPassword = new passPanel();
    private namePanel panelName = new namePanel();
    private buttonPanel btnPanel = new buttonPanel();
    private textPanel textPanel = new textPanel();
    private JPanel[] paines = {painel, panelName, panelPassword, btnPanel};
    private JTextField[] inputs = {inputName, inputPassword};
    private add add = new add();
    private addPane panelAdd = new addPane();
    private exit exit = new exit();
    private exitPanel exitPanel = new exitPanel();
    private inputName name = new inputName();
    private inputDescricao descricao = new inputDescricao();
    private pane painelName =  new pane();
    private panelDescricao panelDescricao =  new panelDescricao();
    private panelList panelList = new panelList();
    private lista lista = new lista();
    private list listar = new list();
    private saveName saveName = new saveName();
    private panelSave panelSave = new panelSave();

    public components() {
        main();
        clickButton();
    }

    // menu principal
    private void main() {
        textPanel.add(textMain);
        panelName.add(inputName);
        panelPassword.add(inputPassword);
        btnPanel.add(buttonLogin);

        painel.add(textPanel);
        painel.add(panelName);
        painel.add(panelPassword);
        painel.add(btnPanel);

        // menu
        mainMenu.add(painel);
    }
    
    // botão de Login
    private void clickButton(){
        // pegando userName, passWord
        buttonLogin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {

                // name
                String nome = inputName.getText();
                String password = inputPassword.getText();

                user usuario = new user(nome, password);

                // adicionando usuarios
                list.saveUser(usuario);

                // método: Verificar dados
                login.loginIsTrue(nome, password, usuario);

                // remove os componentes do menu de Login
                login.UI(textMain, paines, buttonLogin, inputs);

                newUI();
                clickExit();
                addNotion();
            }
        });
    }

    private void newUI(){
        panelAdd.add(add);
        //panelList.add(lista);
        //exitPanel.add(exit);

        mainMenu.add(panelAdd);
        //mainMenu.add(panelList);
        //mainMenu.add(exitPanel);
    }


    private void clickExit(){
        exit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event){
                mainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }

    // adicionar nova anotação
    private void addNotion(){
        add.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event){
                // remove
                add.setVisible(false);
                panelAdd.setVisible(false);

                // adiciona a anotação
                panelName.add(name);
                panelSave.add(saveName);

                // adiciona a janela
                mainMenu.add(name);
            }
        });
    }
}
