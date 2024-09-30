package ma.skypay.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import ma.skypay.model.Transaction;
import ma.skypay.service.AccountService;

public class AccountServiceImpl implements AccountService {

	private int balance;
	private List<Transaction> transactions = new ArrayList<Transaction>();
   
	public void deposit(int amount) {
		balance += amount;
		transactions.add(new Transaction("deposit", amount, balance));
	}

	public void withdrow(int amount) {
		balance -= amount;
		transactions.add(new Transaction("withdraw", -amount, balance));
	}

	public void printStatement() {
		System.out.println("Date       || Amount || Balance");
		for (int i = transactions.size() - 1; i >= 0; i--) {
			System.out.println(transactions.get(i).toString());
		}
	}

	public int getBalance() {
		return balance;
	}
}
