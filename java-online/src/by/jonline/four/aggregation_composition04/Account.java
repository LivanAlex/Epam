package by.jonline.four.aggregation_composition04;

import by.jonline.four.aggregation_composition04.bank_helper.AccountNumber;

public class Account {
	
	private int number;
	private boolean isActive;
	private int balance;
	private ClientCard client;
	
	public Account (ClientCard client, int money, Bank bank) {
		number       = AccountNumber.number();
		isActive     = true;
		this.balance = money;
		this.client  = client;
		bank.addAccount(number, this);
	}

	public boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getNumber() {
		return number;
	}

	public ClientCard getClient() {
		return client;
	}


	@Override
	public String toString () {
		return "Account [+"
				+ "number=" + number + ", "
				+ "isActive=" + isActive + ", "
				+ "balance=" + balance + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (balance != other.balance)
			return false;
		if (isActive != other.isActive)
			return false;
		if (number != other.number)
			return false;
		return true;
	}
}
