package Bank;

public class MoneyTransfer extends Bank {

    public void transfer(String accountNumber, int amount) {
        int newAmount =  accounts.get(accountNumber) + amount;
        accounts.replace(accountNumber, newAmount);
    }
}
