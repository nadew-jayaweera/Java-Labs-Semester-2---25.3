class BankAccount {
    int accountNo;
    String holderName;
    double balance;

    BankAccount() {
        accountNo = 1001;
        holderName = "Default User";
        balance = 5000.0;
    }

    BankAccount(int accountNo, String holderName, double balance) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Updated Balance: " + balance);
    }

    String withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return "Withdrawal successful. Remaining balance: " + balance;
        } else {
            return "Insufficient funds.";
        }
    }

    double getBalance() {
        return balance;
    }

    String getAccountInfo(String branch) {
        return "Account No: " + accountNo +
               ", Holder Name: " + holderName +
               ", Branch: " + branch;
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();

        BankAccount acc2 = new BankAccount(2002, "John Silva", 10000.0);

        System.out.println("---- Account 1 ----");
        acc1.deposit(1500);
        System.out.println(acc1.withdraw(2000));
        System.out.println("Current Balance: " + acc1.getBalance());
        System.out.println(acc1.getAccountInfo("Colombo Branch"));

        System.out.println("\n---- Account 2 ----");
        acc2.deposit(2500);
        System.out.println(acc2.withdraw(5000));
        System.out.println("Current Balance: " + acc2.getBalance());
        System.out.println(acc2.getAccountInfo("Kandy Branch"));
    }
}