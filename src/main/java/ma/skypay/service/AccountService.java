package ma.skypay.service;

public interface AccountService {

	void deposit(int amount);

	void withdrow(int amount);

	void printStatement();
}
