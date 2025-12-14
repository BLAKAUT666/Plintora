package dominio.Login.banco;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class server {
    public void conection(){
        String path = "dominio/Login/banco/users.db";
        String textDB = "CREATE TABLE User(id PRIMARY KEY AUTOINCREMENT, name TEXT)";

        File userName = new File(path);

        try{
            boolean isCreate = userName.createNewFile();

            if(isCreate == true){
                FileWriter writer = new FileWriter(userName);

                writer.write(textDB);
                writer.close();
            }

        } catch(IOException error){
            error.printStackTrace();
        }
    }
}
