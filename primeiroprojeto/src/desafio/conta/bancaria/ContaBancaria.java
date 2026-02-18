package desafio.conta.bancaria;

public class ContaBancaria {
    public String name;
    private double balance;
    private String accType;

    ContaBancaria( String name){
        this.name = name;
        this.balance = 0;
        this.accType = "Corrente";
    }
    public double getBalance(){
        return this.balance;
    }
    public String getAccType(){
        return this.accType;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void receiveMoney(double value){
        this.balance += value;
    }
    public void transferation(double value){
    boolean operationNotValid = (this.balance - value) < 0;
        if (operationNotValid){
            System.out.println("Saldo insuficiente!");
            return;
        }
        this.balance -= value;
    }
    public void getAccInformations(){
        System.out.println("*************************************");
        System.out.println("Dados do cliente:");
        System.out.println(String.format("""
                Nome: %s
                Tipo da conta: %s
                Saldo atual: R$%.2f
                """,this.name, this.accType, this.balance));
        System.out.println("*************************************");
    }

}
