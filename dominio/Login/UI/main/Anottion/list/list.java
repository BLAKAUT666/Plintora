package dominio.Login.UI.main.Anottion.list;
import java.util.ArrayList;
import java.util.List;
import dominio.Login.UI.main.Anottion.add.user.descricao;
import dominio.Login.UI.main.Anottion.add.user.name;

public class list {
    List<String> lista = new ArrayList<>();

    private void adicionar(name name, descricao descricao){
        lista.add("{ Nome: " + name + " }" + "{ Descrição: " + descricao + " }");
    }

    private void listar(){
        if(lista.isEmpty()){
            System.out.println("Lista está vazia!!!");
            return;
        }
    }
}
