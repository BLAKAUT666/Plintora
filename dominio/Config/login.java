package dominio.Config;

public enum login {
    LOGIN(1),
    FAILEID(2);

    // variavél number
    public int number;

    login(int number){
        this.number = number;
    }

    // retornando o valor do number
    public int getNumber(){
        return this.number;
    }

}
