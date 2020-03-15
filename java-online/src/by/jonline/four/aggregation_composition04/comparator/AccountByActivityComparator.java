package by.jonline.four.aggregation_composition04.comparator;

import by.jonline.four.aggregation_composition04.Account;
import by.jonline.four.aggregation_composition04.comparator.AccountComparator;

public class AccountByActivityComparator extends AccountComparator{

	@Override
	public int compare(Object a1, Object a2) {
		Account o1 = (Account) a1;
		Account o2 = (Account) a2;
		if(o1.getIsActive() == o2.getIsActive()) {
			return 0;
		} else if (o1.getIsActive()) {
			return 1;
		} else {
			return -1;
		}
	}
}