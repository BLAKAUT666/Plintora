package services.loginOk;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dominio.Config.user.user;

public class loginOk {

    public boolean loginIsTrue(String nome, String password, user usuario){
        List<user> users = new ArrayList<>();
        users.add(usuario);

        for(user User: users){
            if(nome == User.getNome() && password == User.getPassword()){
                System.out.println("Login bem Sucedido");
                return true;
            }
        }

        return false;
    }

    public void UI(JLabel text, JPanel[] paines, JButton button, JTextField[] input){
        text.setVisible(false);
        button.setVisible(false);
        
        for(JPanel list: paines){
            // remove a cada interação
            list.setVisible(false);
        }

        for(JTextField list: input){
            list.setVisible(false);
        }
    }
}
