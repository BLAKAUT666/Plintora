package dominio.Config;

public class user{
    protected String name;
    protected String gmail;
    protected String password;

    public user(String name, String gmail, String password){
        this.name = name;
        this.gmail = gmail;
        this.password = password;

        dados();
    }

    private void dados(){
        if(getName() == null || getPassword() == null){
            System.out.println("Dados Incorretos");
            return;
        }
    }

    public String getName(){ return this.name; }
    public String getPassword(){ return this.password; }
}
