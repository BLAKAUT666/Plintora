package dominio.Config;

public class user {
    private String nome;
    private String password;

    public user(String nome, String password){
        this.nome = nome;
        this.password = password;
    }

    public void dados(){
        if(getNome() == null || getPassword() == null){
            System.out.println("Campos incorretos, tente novamente!!!");
            return;
        }

        System.out.println("==============================");
        System.out.println("[ Username ] " + getNome());
        System.out.println("[ Password ] " + getPassword());
        System.out.println("==============================");

    }

    public String getNome(){ return this.nome; }
    public String getPassword(){ return this.password; }
}
