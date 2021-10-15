public class BankAccount {
    String ownerName;
    String cardNumber;
    double balance;
    String dateOfStart;

    BankAccount(String ownerName,String cardNumber){
        this.ownerName = ownerName;
        this.cardNumber = cardNumber;
        this.balance = 0.0;
        this.dateOfStart = "today";
    }

    BankAccount(String ownerName,String cardNumber,double initialDeposit){
        this.ownerName = ownerName;
        this.cardNumber = cardNumber;
        this.deposit(initialDeposit);
        this.dateOfStart = "today";
    }

    double showBalance() {
        System.out.println(String.format("(%s) your balance: %f",this.ownerName, this.balance));
        return this.balance;
    }

    void deposit(double valueOfMoney) {
        this.balance = this.balance + valueOfMoney;
        System.out.println(String.format("%f added to you account!", valueOfMoney));
        this.showBalance();
    }

    double withdraw(double valueOfMoney) {
        if (valueOfMoney <= this.balance) {
            this.balance = this.balance - valueOfMoney;
            System.out.println(String.format("%f withdraw from you account!", valueOfMoney));
            this.showBalance();
            return this.balance;
        } else {
            System.out.println("money is not enough!");
            return 0;
        }
    }

    void transfer(double valueOfMoney, BankAccount account) {
        if (valueOfMoney <= this.balance) {
            this.balance = this.balance - valueOfMoney;
            System.out.println(String.format("%f transferred to %s owned by %s", valueOfMoney, account.cardNumber, account.ownerName));
            this.showBalance();
        } else {
            System.out.println("money is not enough!");
        }
    }


}
