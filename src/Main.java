public class Main {
    public static void main(String[] args){

        BankAccount customer1 = new BankAccount("Amini","1234 1234 1234 1234");
        BankAccount customer2 = new BankAccount("Ahmadi","1234 1234 1234 3421");
        BankAccount customer3 = new BankAccount("Azari","1234 1234 1234 1234",2000.0);

        customer1.showBalance();
        customer3.showBalance();


    }
}
