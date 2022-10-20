package Lab08.SRPTask02;

import java.util.HashMap;
import java.util.Map;

public class AccountDatabase {
    private Map<String,Account> accounts =  new HashMap<>();


    public void transfer(String accountIDSend,String accountIDReceive, long amount){


        accounts.get(accountIDReceive).setBalance((accounts.get(accountIDReceive).getBalance() + amount));
        accounts.get(accountIDSend).setBalance((accounts.get(accountIDSend).getBalance() - amount));

    }

    public void updateAccount(Account account ,long newBalance){
        accounts.get(account).setBalance(newBalance);
    }
    public Account findAccountForUser(String id){
        return accounts.get(id);
    }

    public void addAccount(String accountID , Account account){
        accounts.put(accountID, account);
    }






}
