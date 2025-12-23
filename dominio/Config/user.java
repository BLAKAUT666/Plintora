package dominio.Config;

public class user {

    protected String name;
    protected String password;

    public user(String name, String password) {
        this.name = name;
        this.password = password;

        dados();
    }

    private void dados() {
        if (getName() == null || getPassword() == null) {
            System.out.println("Dados Incorretos");
            return;
        }

        System.out.println("=========================");
        System.out.println("==   Dados Corretos    ==");
        System.out.println("= Username: " + getName() + " =");
        System.out.println("= Password: " + getPassword() + " =");
    }

    public String getName() {
        return this.name;
    }

    public String getPassword() {
        return this.password;
    }
}
