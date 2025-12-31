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
import dominio.Login.UI.main.Anottion.add.btnClick.descricao.btnDescricao;
import dominio.Login.UI.main.Anottion.add.btnClick.descricao.btnPanelDescricao;
import dominio.Login.UI.main.Anottion.add.btnClick.name.panelSave;
import dominio.Login.UI.main.Anottion.add.btnClick.name.saveName;
import dominio.Login.UI.main.Anottion.add.input.descricao.*;
import dominio.Login.UI.main.Anottion.add.input.name.*;
import dominio.Login.UI.main.Anottion.exit.*;
import dominio.Login.UI.main.Anottion.list.btnList;
import dominio.Login.UI.main.Anottion.list.listButton;
import dominio.Login.UI.main.Anottion.list.lista;
import dominio.Login.UI.main.Anottion.list.panelList;
import dominio.Login.inputs.name.namePanel;
import dominio.Login.inputs.name.userName;
import dominio.Login.inputs.password.passPanel;
import dominio.Login.inputs.password.userPassword;
import services.list.ListUser;
import services.loginOk.loginOk;
import dominio.Login.UI.main.Anottion.add.user.name1;
import dominio.Login.UI.main.Anottion.add.user.descricao;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
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
    private pane painelName =  new pane(name);
    private panelDescricao panelDescricao =  new panelDescricao(descricao);
    private panelList panelList = new panelList();
    private lista lista = new lista();
    private listButton listar = new listButton();
    private saveName saveName = new saveName();
    private panelSave panelSave = new panelSave();
    private btnDescricao btnDescricao = new btnDescricao();
    private btnPanelDescricao btnPanelDescricao = new btnPanelDescricao(btnDescricao);
    private JPanel[] p = {painelName, panelSave};
    private String listName;
    private btnList btnList = new btnList();

    public components() {
        main();
        clickButton();
        addNotion();
        listAnnotions();
        clickExit();
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
            }
        });
    }

    private void newUI(){
        panelAdd.add(add);
        panelList.add(lista);
        exitPanel.add(exit);

        // add
        painel.add(panelAdd);
        painel.add(panelList);
        painel.add(exitPanel);

        // visible: true
        painel.setVisible(true);

        mainMenu.add(painel);
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
                // list of paines
                JPanel[] l = {panelList, panelAdd, exitPanel};

                // remove
                removeAdd(l);

                // adiciona a anotação
                panelSave.add(saveName);

                painel.add(painelName);
                painel.add(panelSave);

                // deixando visivel o painel principal
                painel.setVisible(true);
                anottionFileName();

                // adiciona o nome da anotação
                mainMenu.add(painel);
            }
        });
    }

    private void removeAdd(JPanel[] l){
        for(JPanel j: l){
            j.setVisible(false);
        }
    }

    private void anottionFileName(){

        saveName.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event){
                String fileName = name.getText();
                name1 anottions = new name1(fileName);

                //removendo name, save, panel
                removeAnottion(name, saveName, p);

                // adiciona a descrição da anotação
                anottionFileDescricao();

                btnDescricao.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent event){
                        // pega o text da descrição
                        String d = descricao.getText();

                        // remove o input e botão da descrição
                        JPanel[] listPanels = {panelDescricao, btnPanelDescricao};
                        JPanel[] buttonsUI = {panelAdd, panelList, exitPanel};

                        // instancia a decrição do arquivo
                        descricao desc = new descricao(d);

                        //adiciona o nome e escreve no arquivo da anotação
                        anottions.file(desc.getDescricao());

                        // remove componentes
                        removeAnottionDescricao(listPanels, btnDescricao);

                        // adiciona os paines principas add, list, exit
                        addComponents(buttonsUI);

                        // pega o nome da anotação e adiciona na lista
                        listName(anottions.getName());

                        // cria o segundo Layout
                        newUITwoLayout();
                    }
                });
            }
        });
    }

    private void removeAnottion(JTextField name, JButton save, JPanel[] p){
        name.setVisible(false);
        save.setVisible(false);

        for(JPanel j: p){
            j.setVisible(false);
        }
    }

    private void anottionFileDescricao(){
        painel.add(panelDescricao);
        painel.add(btnPanelDescricao);

        mainMenu.add(painel);
    }

    private void removeAnottionDescricao(JPanel[] paines, JButton button){
        for(JPanel s: paines){
            s.setVisible(false);
        }

        button.setVisible(false);
    }

    private void addComponents(JPanel[] paines){
        for(JPanel j: paines){
            j.setVisible(true);
        }
    }

    private void newUITwoLayout(){
        newUI();
    }

    private void listAnnotions(){
        lista.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event){
                // lista de paines
                JPanel[] list = {panelAdd, panelList, exitPanel};

                // remove painel
                for(JPanel l: list){
                    l.setVisible(false);
                }

                // adiciona a lista
                listar.adicionar(listName);
                // lista as anotações
                listar.listar(listName);

                //metodo: panel
                listar.panel(btnList, painel, mainMenu);
            }
        });
    }

    private void listName(String name){
        listName = name;
    }
}
