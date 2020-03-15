package by.jonline.four.aggregation_composition05;

public abstract class Messages {
	
	
	public final static int INDEX_LENGTH = 3;
	public final static String INDEX = "#";
	public final static String INDEX_FIELD = "%" + INDEX_LENGTH + "s";
	public final static int TYPE_LENGTH = 9;
	public final static String TYPE = "тип";
	public final static String TYPE_FIELD = "%" + TYPE_LENGTH + "s";
	public final static int NAME_LENGTH = 15;
	public final static String NAME = "наименование";
	public final static String NAME_FIELD = "%" + NAME_LENGTH + "s";
	public final static int DURATION_LENGTH = 11;
	public final static String DURATION = "длительнсть";
	public final static String DURATION_FIELD = "%" + DURATION_LENGTH + "s";
	public final static int FOOD_LENGTH = 12;
	public final static String FOOD = "питание";
	public final static String FOOD_FIELD = "%" + FOOD_LENGTH + "s";
	public final static int TRANSFER_LENGTH = 8;
	public final static String TRANSFER = "трансфер";
	public final static String TRANSFER_FIELD = "%" + TRANSFER_LENGTH + "s";
	public final static int PRICE_LENGTH = 8;
	public final static String PRICE = "цена";
	public final static String PRICE_FIELD = "%" + PRICE_LENGTH + "s";
	
	
	public final static String SORTED = "Сортировка по цене:";
	

	
	public final static String TOUR_INFO_FIELD = String.format("%s | %s | %s | %s | %s | %s | %s\n", INDEX_FIELD, TYPE_FIELD, NAME_FIELD, DURATION_FIELD, FOOD_FIELD, TRANSFER_FIELD, PRICE_FIELD);
	
	public final static String INFO_FIELD_LINE = infoFieldLine();
	
	private static String infoFieldLine() {
		int length = INDEX_LENGTH + TYPE_LENGTH + NAME_LENGTH + DURATION_LENGTH + FOOD_LENGTH + TRANSFER_LENGTH + PRICE_LENGTH + 18;
		StringBuilder line = new StringBuilder();
		for (int i = 0; i < length; i++) {
			line.append("-");
		}
		return line.toString();
	}
	
	public final static String DAY1 = "день";
	public final static String DAY2 = "дня ";
	public final static String DAY3 = "дней";
	
	public static String days(int num){
		int x = num % 100;
		if (x > 10 && x < 20) {
			return num + " " + DAY3;
		} else if (x % 10 == 1) {
			return num + " " + DAY1;
		} else if (x % 10 > 4 || x % 10 == 0) {
			return num + " " + DAY3;
		} else {
			return num + " " + DAY2;
		}
	}
}
