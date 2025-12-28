package dominio.Login.UI.main.Anottion.add.user;

public class user {
    private String name;
    private String descricao;

    public user(String name, String descricao){
        this.name = name;
        this.descricao = descricao;
    }

    public String getName(){
        return this.name;
    }

    public String getDescricao(){
        return this.descricao;
    }
}
