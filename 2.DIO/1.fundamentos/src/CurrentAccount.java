// Classe Conta Corrente: Crie uma classe para implementar uma conta corrente. 
// A classe deve possuir os seguintes atributos: número da conta, nome do correntista e saldo. 
// Os métodos são os seguintes: alterarNome, depósito e saque; No construtor, saldo é opcional,
// com valor default zero e os demais atributos são obrigatórios.

public class CurrentAccount {
    int numberAccount;
    String accountHolder;
    double sale = 0;

    public CurrentAccount (int numberAccount, String accountHolder, double sale){
        this.numberAccount = numberAccount;
        this.accountHolder = accountHolder;
        this.sale = sale;
    }

    public CurrentAccount (int numberAccount, String accountHolder){
        this.numberAccount = numberAccount;
        this.accountHolder = accountHolder;
    }




    public void changeName(String newName) {
        accountHolder = newName;
    }
    
    public void deposit(double price){
        sale = sale + price;
    }
    public void loot(double price){
        sale = sale - price;
    }
}
