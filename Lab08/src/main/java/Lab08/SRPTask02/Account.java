package Lab08.SRPTask02;

public class Account {
    private String accountID = "";
    private long balance;

    public Account(String id, long balance){
        this.accountID = id;
        this.balance = balance;
    }

    public long getBalance(){
        return this.balance;
    }
    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void credit(long amount){
        if(balance>=amount)
            balance -= amount;
        else
            System.out.println("Amount exceeds balance");

    }

    public void debit(long amount){
        balance += amount;
    }



}
