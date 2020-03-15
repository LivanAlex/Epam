package by.jonline.four.aggregation_composition04;

import static by.jonline.four.aggregation_composition04.bank_helper.Messages.*;

import java.util.HashMap;
import java.util.Scanner;

import by.jonline.four.aggregation_composition04.comparator.AccountByActivityComparator;
import by.jonline.four.aggregation_composition04.comparator.AccountByBalanceComparator;
import by.jonline.four.aggregation_composition04.comparator.AccountByClientComparator;
import by.jonline.four.aggregation_composition04.comparator.AccountByNumberComparator;
import by.jonline.four.aggregation_composition04.comparator.AccountComparator;

public class Bank {
	
	private static HashMap <ClientCard, ClientAccount> clients;
	private static HashMap <Integer, Account> accounts;
	
	public Bank () {
		clients  = new HashMap <>();
		accounts = new HashMap <>();
	}
	
	protected void addAccount(int number, Account account) {
		accounts.put(number, account);
	}
		
	public static void lockAccount(int number) {
		if (accounts.containsKey(number)) {
			accounts.get(number).setIsActive(false);
		} else {
			System.out.println(REPEAT);
			lockAccount(userInput());
		}
	}
	
	
	public static void lockAccount() {
		System.out.println(LOCK);
		lockAccount(userInput());
		System.out.println();
	}
	
	
	private static int userInput() {
		Scanner s = new Scanner(System.in);
		while (!s.hasNextInt()){
			s.next();
			System.out.println(ENTRY_ERROR);
		}
		return s.nextInt();
	}

	
	public static void unLockAccount() {
		System.out.println(UNLOCK);
		unLockAccount(userInput());
		System.out.println();
	}
	
	
	public static void unLockAccount(int number) {
		if (accounts.containsKey(number)) {
			accounts.get(number).setIsActive(true);
		} else {
			System.out.println(REPEAT);
			unLockAccount(userInput());
		}
	}
	
	
	public static void showAccounts(ClientCard client) {
		clients.get(client).info();
	}
	
	
	public static void sortAccountByClientName() {
		AccountByClientComparator client = new AccountByClientComparator();
		sort(SORT_CLIENT, client);

	}
	
	
	public static void sortAccountByClientBalance() {
		AccountByBalanceComparator balance = new AccountByBalanceComparator();
		sort(SORT_BALANCE, balance);
	}
	
	
	public static void sortAccountByNumber() {
		AccountByNumberComparator number = new AccountByNumberComparator();
		sort(SORT_NUMBER, number);
	}
	
	
	public void sortAccountByActivity() {
		AccountByActivityComparator activity = new AccountByActivityComparator();
		AccountByClientComparator client = new AccountByClientComparator();
		sort(SORT_ACTIVITY, activity, client);
	}
	

	private static void sort(String message, AccountComparator... comp) {
		System.out.println(message);
		System.out.println(ACCOUNT_HEAD);
		System.out.println(LINE);
		
		if(comp.length == 1) {
			accounts.values().stream().sorted(comp[0]).forEach(a -> info(a));
		} else {
			accounts.values().stream().sorted(comp[0].thenComparing(comp[1])).forEach(a -> info(a));
		}
		System.out.println();
	}

	
	public static void info(ClientCard client) {
		clients.get(client).info();
		System.out.println();
	}
	
	
	private static void info(Account account) {
		String activity = account.getIsActive() ? IS_ACTIVE : IS_NOT_ACTIVE;
		System.out.printf(ACCOUNT_FORM, account.getNumber(), account.getBalance(), activity, account.getClient().getName());
	}
	
	
	public static void balance(ClientCard client) {
		clients.get(client).balanceAll();
	}
	
	
	public static void balancePositive(ClientCard client) {
		clients.get(client).balancePositive();
	}
	
	
	public static void balanceNegative(ClientCard client) {
		clients.get(client).balanceNegative();
	}

	
	public void newAccount(ClientCard client, int money) {
		if (!clients.containsKey(client)) {
			
			clients.put(client, new ClientAccount(client, money, this));
		} else {
			clients.get(client).addAccount(money, this);
		}
	}
}
