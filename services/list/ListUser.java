package services.list;

import java.io.FileWriter;
import java.io.IOException;

import dominio.Config.user.user;

public class ListUser {
    public void saveUser(user usuario){
        String name = usuario.getNome();
        String password = usuario.getPassword();

        String json = "[\n" +
                            "    {\n" +
                                "    \"username\":  \"" + name + "\", \n" +
                                "    \"password\": \"" + password + "\" \n" +
                            "    }\n" +
                        "]\n";

        try(FileWriter writer = new FileWriter("user.json")){
            writer.write(json);
            System.out.println("Usuario salvo em JSON!");

        } catch(IOException error){
            error.printStackTrace();
        }
    }
}
