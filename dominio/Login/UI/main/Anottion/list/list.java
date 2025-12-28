package dominio.Login.UI.main.Anottion.list;
import java.util.ArrayList;
import java.util.List;
import dominio.Login.UI.main.Anottion.add.user.user;

public class list {
    List<user> lista = new ArrayList<>();

    private void adicionar(user usuario){
        lista.add(usuario);
    }

    private void listar(){
        if(lista.isEmpty()){
            System.out.println("Lista está vazia!!!");
            return;
        }

        for(user e: lista){
            
        }
    }
}
