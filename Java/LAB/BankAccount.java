public class BankAccount {
    private int accountNumber;
    private double balance;

    BankAccount(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    BankAccount(){

    }
    void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;

    }
    void setBalance(double balance){
        if (balance >0){
            this.balance = balance;
        }
        else{
            System.out.println("Balance cannot be negative");
        }
    }
    String getAccountNumber(){
        return "Account Number: " + accountNumber;
    }
    String getBalance(){
        return "Balance: " + balance;
    }

}