package dominio.Login.UI.main.Anottion.add.user;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.Timer;

public class name1 {

    private String name;

    public name1(String name){
        this.name = name;
    }

    {
        // bloco de inicialização
        System.out.println("\t-----------------------");
        System.out.println("\t-- Dados da anotação --");
    }

    // file
    public void file(String descricao){
        try{
            String fileName = name;
            File file = new File("Anotions/" + fileName + ".txt");

            // criando o arquivo da anotação
            boolean isCreate = file.createNewFile();

            if(isCreate == false){
                //message
                System.out.println("\t-- Anotação já exite --");

                Timer timer = new Timer(50000,  e -> {
                    clear();
                });

                timer.setRepeats(true);
                timer.start();

                return;
            }

            // arquivo criado com sucesso
            System.out.println("\t-- Arquivo criado --");
            System.out.println("\t-- nome: " + getName());
            System.out.println("\t-- descrição: " + descricao);
            System.out.println("\t--------------------------");

            // escrevendo no arquivo
            FileWriter writer = new FileWriter(file);
            writer.write(descricao);
            writer.close();

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

    public static String listName(String name){

        if(name.isEmpty()){
            System.out.println("Nome é vazio");
        }

        return name;
    }
}
