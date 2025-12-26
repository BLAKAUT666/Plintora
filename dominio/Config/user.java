package dominio.Config;

public class user {
    private String nome;
    private String password;

    public user(String nome, String password){
        this.nome = nome;
        this.password = password;
    }

    public String getNome(){ return this.nome; }
    public String getPassword(){ return this.password; }
}
