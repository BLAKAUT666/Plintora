package services;
import java.util.ArrayList;
import java.util.List;

import dominio.Config.user;

public class loginOk {

    public void loginIsTrue(String nome, String password, user usuario){
        List<user> users = new ArrayList<>();
        users.add(usuario);

        for(user User: users){
            if(nome == User.getNome() && password == User.getPassword()){
                System.out.println("Login efetuado com Sucesso");
            } else {
                System.out.println("Login não efetuado!!!");
            }
        }
    }
}
