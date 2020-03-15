package by.jonline.four.aggregation_composition04.comparator;

import by.jonline.four.aggregation_composition04.Account;
import by.jonline.four.aggregation_composition04.comparator.AccountComparator;

public class AccountByBalanceComparator extends AccountComparator{

	@Override
	public int compare(Object a1, Object a2) {
		Account o1 = (Account) a1;
		Account o2 = (Account) a2;
		return o1.getBalance() - o2.getBalance();
	}
}