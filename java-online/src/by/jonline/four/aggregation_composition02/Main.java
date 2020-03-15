package by.jonline.four.aggregation_composition02;

/*
 * Создать объект класса Автомобиль, используя классы
 * Колесо, Двигатель.
 * Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */

public class Main {

	public static void main(String[] args) {
		Car priora = new Car(Brand.LADA, Engine.PETROL1600, Tank.PETROL80, Wheel.BAD, Wheel.GOOD, Wheel.GOOD, Wheel.GOOD);
		
		priora.drive(150); 									// проехать 150 км
		priora.refuel(60); 									// заправить 60 литров топлива
		
		Wheel fromCar = priora.changeWheel(Wheel.GOOD);     // заменить колесо (метод возвращает плохое колесо с автомобиля,
															// или null если ни одно колесо в замене не нуждается)
		
		priora.printBrand();                                // вывести на консоль марку автомобиля.
		
		System.out.println("");
		priora.getStatus();
	}

}
