package dominio.Login.UI.main.Anottion.add.user;

import java.io.File;
import java.io.IOException;

import javax.swing.Timer;

public class name {

    private String name;

    public name(String name){
        this.name = name;
    }

    {
        // bloco de inicialização
        System.out.println("\n-----------------------");
        System.out.println("\n-- Dados da anotação --");
    }

    // file
    public void file(){
        try{
            String fileName = name;
            File file = new File("Anotions/" + fileName + ".txt");

            // criando o arquivo da anotação
            boolean isCreate = file.createNewFile();

            if(isCreate == false){
                //message
                System.out.println("\n-- Anotação não criada --");

                Timer timer = new Timer(50000,  e -> {
                    clear();
                });

                timer.setRepeats(true);
                timer.start();

                return;
            }

            // arquivo criado com sucesso
            System.out.println("\n-- Arquivo criado com Sucesso --");
            System.out.println("\n-- nome: " + getName() + " --");

        } catch(IOException error){
            if(name == null || name == " "){
                error.getMessage();
            }
        }
    }

    public String getName(){
        return this.name;
    }

    private void clear(){
        System.out.println("\033[H\033[2J");
    }
}
