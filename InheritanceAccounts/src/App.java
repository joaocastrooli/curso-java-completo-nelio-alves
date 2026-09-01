import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {
    
        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Betel", 8000, 0.10));
        list.add(new BusinessAccount(1022, "Joao", 2000, 5000));
        list.add(new SavingsAccount(1021, "Tornadas", 2000, 0.20));

        double sum = 0;
        for (Account account : list) {
            sum += account.getBalance();
        }

        System.out.println("Total = " + sum);

        for (Account account : list) {
            account.deposit(10000);
            System.out.println("Deposito realizado! Saldo: " + account.getBalance());
        }

    }
}
