package by.jonline.four.aggregation_composition04.bank_helper;

public abstract class Messages {
	
	public final static String ACCOUNT = "счет";
	public final static String BALANCE = "баланс";
	public final static String BALANCE_ALL = "Баланс всех счетов клиента %s равен: %d\n\n";
	public final static String BALANCE_POSITIVE = "Баланс положительных счетов клиента %s равен: %d\n";
	public final static String BALANCE_POSITIVE_ABSENT = "У клиента %s отсутствуют полижительные счета\n";
	public final static String BALANCE_NEGATIVE = "Баланс отрицательных счетов клиента %s равен: %d\n";
	public final static String BALANCE_NEGATIVE_ABSENT = "У клиента %s отсутствуют отрицательные счета\n";
	
	public final static String ACTIVITY = "состояние";
	public final static String KLIENT = "клиент";
	public final static String IS_ACTIVE = "активен";
	public final static String IS_NOT_ACTIVE = "неактивен";
	
	public final static String ACCOUNT_FORM = "%04d |  %7d |  %9s  |  %s \n";
	public final static String INFO_FORM = "%04d | %10s\n";
	public final static String LOCK = "Введите номер счета для блокировки:";
	public final static String UNLOCK = "Введите номер счета для разблокировки:";
	public final static String REPEAT = "Такого счета нет в этом банке, повторите ввод:";
	public final static String ENTRY_ERROR = "Ошибка ввода, попробуйте еще раз:";

	public final static String ACCOUNTS_INFO = "Информация по счетам клиента %s:\n";
	public final static String LINE = "--------------------------------------------------";
	public final static String LINE_SHORT = "-------------------";
	
	public final static String SORT_CLIENT = "Сортировка всех счетов по имени клиента:\n";
	public final static String SORT_BALANCE = "Сортировка всех счетов по балансу:\n";
	public final static String SORT_NUMBER = "Сортировка всех счетов по номеру:\n";
	public final static String SORT_ACTIVITY = "Сортировка всех счетов по состоянию:\n";
	
	public final static int ACCOUNT_LENGTH = 4;
	public final static int BALANCE_LENGTH = 8;
	public final static int ACTIVITY_LENGTH = 11;
	public final static int KLIENT_LENGTH = 7;
	
	public final static String ACCOUNT_FORM_HEAD = "%" + 
							 ACCOUNT_LENGTH  + "s | %" + 
							 BALANCE_LENGTH  + "s | %" +
							 ACTIVITY_LENGTH + "s | %" +
							 KLIENT_LENGTH   + "s";
	
	public final static String ACCOUNT_HEAD = String.format(ACCOUNT_FORM_HEAD, ACCOUNT, BALANCE, ACTIVITY, KLIENT);
	
	public final static String STATUS_FORM_HEAD = "%" + 
							ACCOUNT_LENGTH  + "s | %" + 
							ACTIVITY_LENGTH + "s";
	
	public final static String STATUS_HEAD = String.format(STATUS_FORM_HEAD, ACCOUNT, ACTIVITY);
	
	

}
