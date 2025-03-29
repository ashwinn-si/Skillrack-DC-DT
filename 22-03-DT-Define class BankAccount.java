class BankAccount implements Transaction {
    private int balance;

    BankAccount(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amt) {
        amt = Math.abs(amt);
        if (balance >= amt) {
            this.balance -= amt;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void deposit(int amt) {
        this.balance += amt;
    }

    public int viewBalance() {
        return this.balance;
    }

}