package ma.skypay.model;

public class Transaction {

	private String type;
	private int amount;
	private int balance;
	private String date;

	public Transaction(String type, int amount, int balance) {
		super();
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.date = getCurrentDate();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	private String getCurrentDate() {
		return java.time.LocalDate.now().toString();
	}

	@Override
	public String toString() {
		return date + " || " + amount + "   || " + balance;
	}
}
