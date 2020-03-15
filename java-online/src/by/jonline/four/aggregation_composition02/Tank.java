package by.jonline.four.aggregation_composition02;

public enum Tank {
	
	PETROL60(60000), PETROL80(80000);
	
	private double capacity;
	private double fuel;
	
	private static WordHelper liter = new WordHelper("литр", "литра", "литров");
	
	Tank(double capacity) {
		this.capacity = capacity;
	}

	public double getCapacity() {
		return capacity;
	}

	public double getFuel() {
		return fuel;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}

	public double refuel(int liters) {
		if(liters > 0) {
			if (capacity - fuel >= liters * 1000) {
				fuel += liters * 1000;
				System.out.printf("Вы успешно заправили в машину %d %s топлива\n", liters, liter.get(liters));
				return 0;
			} else {
				int remains;
				if (capacity == fuel) {
					System.out.println("Топливный бак полон! попытка заправится окончена неудачей!");
					remains = (int) liters;
				} else {
					remains = (int) (liters - (capacity - fuel)/1000);
					fuel = capacity;
					System.out.printf("Вы успешно заправили машину! %d %s в бак не было заправлено!\n", remains, liter.get(remains));
				}
				return remains;
			}
		} else {
			System.out.println("Обнаружена попытка слить топливо! Вызываем милицию...");
			return 0;
		}
		
	}
}
