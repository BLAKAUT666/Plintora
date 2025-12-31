package dominio.Login.UI.main.Anottion.list;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class listButton {
    // lista
    List<String> lista = new ArrayList<>();
    private String nome;

    // adiciona as anotações na lista
    public void adicionar(String name){
        if(name.isEmpty()){
            System.out.println("Nome está vazio, tente novamente");
            return;
        }

        lista.add("{ Nome: " + name + "}");
    }

    public void listar(String name){
        if(lista.isEmpty()){
            System.out.println("Lista está vazia!!!");
            return;
        }

        // listando as anotações
        for(String user: lista){
            System.out.println("esta vazio: " + user.isEmpty());
            nome = name;
        }
    }

    public void panel(JButton button, JPanel panel, JFrame frame){
        // config basica do botão
        button.setText(nome);
        button.setVisible(true);

        // adiciona o botão no painel
        panel.add(button);

        // adiciona o painel no frame: janela
        frame.add(panel);
    }
}
