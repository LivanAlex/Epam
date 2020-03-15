package by.jonline.four.aggregation_composition04;

public class Main {

	public static void main(String[] args) {
		Bank bps = new Bank();
		ClientCard rich   = new ClientCard("Александр Богатей");
		ClientCard poor   = new ClientCard("Виталий Должник");
		ClientCard normal = new ClientCard("Владимир Стабильный");
		
		bps.newAccount(rich, 1000000);
		bps.newAccount(rich, 2000000);
		
		bps.newAccount(poor, -100);
		bps.newAccount(poor, -5000);
		
		bps.newAccount(normal, 10);
		bps.newAccount(normal, -10);
		bps.newAccount(normal, -34);
		bps.newAccount(normal, 77);
		
		
		bps.balanceNegative(rich);
		bps.balancePositive(poor);
		
		bps.balanceNegative(normal);
		bps.balancePositive(normal);
		
		
		bps.info(normal);
	
		bps.lockAccount();

	
		bps.info(normal);

		bps.unLockAccount();
	

		bps.info(normal);
	
		bps.sortAccountByClientName();

		bps.sortAccountByClientBalance();

		bps.sortAccountByNumber();

		bps.sortAccountByActivity();
	}

}
