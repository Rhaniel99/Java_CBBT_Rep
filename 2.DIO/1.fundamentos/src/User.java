public class User {
    public static void main(String [] args){
        // Radio radio = new Radio();
        // radio.ligar();
        // radio.desligar();

        // radio.aumentarVolume();
        // radio.diminuirVolume();

        // radio.mudarEstacao(30);
        
        // People people = new People();
        // people.getOld();

        // people.loseWeight();
        // people.gainingWeight();

        // people.growUp();
        
        CurrentAccount currentAccount = new CurrentAccount(3040,"Rhaniel Miranda");

        System.out.println("Nome do dono da conta: "+currentAccount.accountHolder + " | Saldo: " + currentAccount.sale + " | Numero da conta: " + currentAccount.numberAccount);
        currentAccount.changeName("Elimar Gonzales");
        System.out.println("Nome do dono da conta: "+currentAccount.accountHolder + " | Saldo: " + currentAccount.sale + " | Numero da conta: " + currentAccount.numberAccount);
        currentAccount.deposit(400);
        System.out.println("Nome do dono da conta: "+currentAccount.accountHolder + " | Saldo: " + currentAccount.sale + " | Numero da conta: " + currentAccount.numberAccount);
        currentAccount.loot(250);
        System.out.println("Nome do dono da conta: "+currentAccount.accountHolder + " | Saldo: " + currentAccount.sale + " | Numero da conta: " + currentAccount.numberAccount);
        
        

    }
}
