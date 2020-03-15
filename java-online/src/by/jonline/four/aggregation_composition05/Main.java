package by.jonline.four.aggregation_composition05;



/*
 * Туристические путевки.
 * Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.)
 * для оптимального выбора.
 * Учитывать возможность выбора транспорта, питания и числа дней.
 * Реализовать выбор и сортировку путевок.
 */

public class Main {

	public static void main(String[] args) {
		
		Tour odessa = new Tour("Одесса", 							 //название
							   1050,    							 //расстояние (для расчета стоимости транспорта)
							   7,									 //колличество дней
							   30,		 							 //цена проживания(за день)
							   new Transfer[]{Transfer.BUS},         //транспорт
							   new Food[] {Food.ALL, Food.TWO_TIME}, //питание
							   Type.VACATION);						 //тип
		
		Tour montenegro = new Tour("Черногория",
								   2250,
								   14,
								   60,
								   new Transfer[]{Transfer.BUS, Transfer.PLANE},
								   new Food[] {Food.ALL, Food.TWO_TIME, Food.NONE},
								   Type.VACATION);
		
		Tour bulgaria = new Tour("Бoлгария",
								 1750,
								 14,
								 45,
								 new Transfer[]{Transfer.BUS, Transfer.PLANE},
								 new Food[] {Food.ALL, Food.TWO_TIME, Food.NONE},
								 Type.VACATION);
		
		Tour chernigov = new Tour("Чернигов",
								  418,
								  1,
								  20,
								  new Transfer[]{Transfer.BUS},
								  new Food[] {Food.NONE},
								  Type.SHOPING);
		
		Tour bialaPodlaska = new Tour("Бяла-Подляска",
									  390,
									  1,
									  30,
									  new Transfer[]{Transfer.BUS},
									  new Food[] {Food.NONE},
									  Type.SHOPING);
		
		Tour einBokek = new Tour("Эйн-Бокек",
								 2600,
								 7,
								 28,
								 new Transfer[]{Transfer.BUS, Transfer.PLANE},
								 new Food[] {Food.ALL, Food.TWO_TIME, Food.ONE_TIME},
								 Type.HEALING);
		
		Tour lasne = new Tour("Марианске-Лазне",
							  1106,
							  14,
							  27,
							  new Transfer[]{Transfer.BUS, Transfer.PLANE},
							  new Food[] {Food.ALL, Food.TWO_TIME, Food.ONE_TIME},
							  Type.HEALING);
		
		Tour praha = new Tour("Прага",
				992,
				3,
				12,
				new Transfer[]{Transfer.BUS},
				new Food[] {Food.ALL},
				Type.EXCURSION);
		
		Tour krakov = new Tour("Краков",
				647,
				3,
				14,
				new Transfer[]{Transfer.BUS},
				new Food[] {Food.ALL},
				Type.EXCURSION);
		
		Tour poesia = new Tour("MSC Poesia",
				1708,
				1,
				350,
				new Transfer[]{Transfer.PLANE},
				new Food[] {Food.ALL},
				Type.CRUISE);
		
		Tour amsterdam = new Tour("Amsterdam",
				1515,
				128,
				513,
				new Transfer[]{Transfer.PLANE},
				new Food[] {Food.ALL},
				Type.CRUISE);
		
		
		

		UserChoise one = new UserChoise();
		one.setDuration(0, 7);
		
		one.sortTours();
		one.showAll();
	}

}
