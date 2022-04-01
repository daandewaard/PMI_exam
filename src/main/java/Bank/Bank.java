package Bank;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Bank {

    TreeMap<String, Integer> accounts = new TreeMap<String, Integer>();
    public String getBalances() {
        String details = "";
        int currentIteration = 1;
        NavigableMap<String, Integer> displayAccounts = accounts.descendingMap();

        for(Map.Entry i : displayAccounts.entrySet()){
            details += i.getKey() + " " + i.getValue().toString();
            if(currentIteration != accounts.size()){
                details += "\r\n";
            }
            currentIteration += 1;
        }

        return details;
    }

    public void openNewAccount(String accountNumber) {
        accounts.put(accountNumber, 0);
    }

    public void closeAccount(String accountNumber1) {
        accounts.remove(accountNumber1);
    }
}
