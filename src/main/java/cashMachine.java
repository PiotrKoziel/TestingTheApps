public class cashMachine {

    private int balance;

    public void cashDeposits(int deposit) {
        if (deposit > 0) {
            balance = balance + deposit;
        }
    }

    public void cashWithdrawal(int withdrawal) {
        if (withdrawal <= balance) {
            balance = balance - withdrawal;
        } else {
            System.out.println("Not enough amount on account");
        }
    }

    public int actualBalance() {
        System.out.println("Amount on account: " + balance);
        return balance;
    }


}
