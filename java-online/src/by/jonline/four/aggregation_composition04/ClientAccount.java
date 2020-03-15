package by.jonline.four.aggregation_composition04;

import static by.jonline.four.aggregation_composition04.bank_helper.Messages.*;

import java.util.ArrayList;

public class ClientAccount {
	private ArrayList <Account> accounts;
	private ClientCard client;
	
	public ClientAccount(ClientCard client, int money, Bank bank) {
		this.client = client;
		accounts = new ArrayList<>();
		accounts.add(new Account(client, money, bank));
	}

	public void info() {
		System.out.printf(ACCOUNTS_INFO, client.getName());
		System.out.println(STATUS_HEAD);
		System.out.println(LINE_SHORT);
		for (Account a : accounts) {
			String activity = a.getIsActive() ? IS_ACTIVE : IS_NOT_ACTIVE;
			System.out.printf(INFO_FORM, a.getNumber(), activity);
		}
	}
	
	public void balanceAll() {
		
		int sum = 0;
		for (Account a : accounts) {
			sum += a.getBalance();
		}
		System.out.printf(BALANCE_ALL, client.getName(), sum);
	}
	

	public void addAccount(int money, Bank bank) {
		accounts.add(new Account(client, money, bank));
	}
	

	public void balancePositive() {
		if(positiveCheck()) {
			int sum = 0;
			for (Account a : accounts) {
				if(a.getBalance() >= 0) {
					sum += a.getBalance();
				}
			}
			System.out.printf(BALANCE_POSITIVE, client.getName(), sum);
		} else {
			System.out.printf(BALANCE_POSITIVE_ABSENT, client.getName());
		}
		System.out.println();
	}
	
	public void balanceNegative() {
		if(negativeCheck()) {
			int sum = 0;
			for (Account a : accounts) {
				if(a.getBalance() < 0) {
					sum += a.getBalance();
				}
			}
			System.out.printf(BALANCE_NEGATIVE, client.getName(), sum);
		} else {
			System.out.printf(BALANCE_NEGATIVE_ABSENT, client.getName());
		}
		System.out.println();
	}
	

	private boolean positiveCheck() {
		for (Account a : accounts) {
			if(a.getBalance() >= 0) {
				return true;
			}
		}
		return false;
	}
	
	private boolean negativeCheck() {
		for (Account a : accounts) {
			if(a.getBalance() < 0) {
				return true;
			}
		}
		return false;
	}
	
}
