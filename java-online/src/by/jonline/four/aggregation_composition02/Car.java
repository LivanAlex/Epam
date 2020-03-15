package by.jonline.four.aggregation_composition02;


public class Car {
	
	private Brand brand;
	private Engine engine;
	private Tank tank;
	private int weight;
	private double consumption;
	private Wheel[] wheels;
	
	private static WordHelper kilometer = new WordHelper("километр", "километра", "километров");
	
	
	public Car(Brand brand, Engine engine, Tank tank, Wheel...wheels) {
		this.tank = tank;
		this.brand = brand;
		this.engine = engine;
		addWheels(wheels);
		weight = 1500;
		consumption = engine.getEngineValue() * 3.8 * (weight/1000);
	}

	
	private void addWheels(Wheel[] wheels) {
		if (wheels.length == 4) {
			this.wheels = wheels;
		} else if (wheels.length < 4) {
			this.wheels = new Wheel[4];
			for (int i = 0; i < this.wheels.length; i++) {
				if (i < wheels.length) {
					this.wheels[i] = wheels[i];
				} else {
					this.wheels[i] = Wheel.BAD;
				}
			}
		} else {
			for (int i = 0; i < this.wheels.length; i++) {
				this.wheels[i] = wheels[i];
			}
		}
	}

	
	public void getStatus() {
		int kmFuel = (int) (tank.getFuel()/(consumption/100));
		int kmEngine = engine.getResource();
		int kmTyre = getMinTyreResource();
		
		System.out.printf("В автомобиле %s\n", brand.getBrand());
		if (kmFuel == 0) {
			System.out.print("не осталось топлива\n");
		} else {
			System.out.printf("осталось топлива на %d %s\n", kmFuel, kilometer.get(kmFuel));
		}
		if (kmEngine == 0) {
			System.out.print("не осталось ресурса двигателя\n");
		} else {
			System.out.printf("ресурса двигателя хватит на %d %s\n", kmEngine, kilometer.get(kmEngine));
		}
		if (kmTyre == 0) {
			System.out.print("протектор одного или нескольких колес стёрт\n");
		} else {
			System.out.printf("остаточного протектора шин хавтит на %d %s\n", kmTyre, kilometer.get(kmTyre));
		}
	}

	
	private int getMinTyreResource() {
		int minTyreResource = wheels[0].getTyreResource();
		for (int i = 1; i < wheels.length; i++) {
			if (minTyreResource > wheels[i].getTyreResource()) {
				minTyreResource = wheels[i].getTyreResource();
			}
		}
		return minTyreResource;
	}

	
	public Engine getEngine() {
		return engine;
	}


	public void setEngine(Engine engine) {
		this.engine = engine;
	}


	public void drive(int km) {
		double fuelNeeded = consumption/100*km;
		int engineResource = engine.getResource();
		boolean noFuel = fuelNeeded > tank.getFuel();
		boolean engineBroken = engineResource < km;
		boolean tyresRubOff = checkWheels(km);
		
		if (noFuel) {
			System.out.println("нет топлива для поездки! запрвьте автомобиль!");
		} else if (engineBroken) {
			System.out.println("ресурс двигателя исчерпан! посетите СТО!");
		} else if (tyresRubOff) {
			System.out.println("покрышки стерлись! замените колесо!");
		} else {
			System.out.printf("Вы успешно преодалели %d %s!\n",km, kilometer.get(km));
			tank.setFuel(tank.getFuel()-fuelNeeded);
			engine.setResource(engineResource - km);
			for (int i = 0; i < wheels.length; i++) {
				wheels[i].drive(km);
			}
		}
	}


	private boolean checkWheels(int km) {
		boolean tyresRubOff = false;
		for (int i = 0; i < wheels.length; i++) {
			if (km > wheels[i].getTyreResource()) {
				tyresRubOff = true;
			}
		}
		return tyresRubOff;
	}

	
	public void refuel(int liters) {
		tank.refuel(liters);
	}

	
	public Wheel changeWheel(Wheel wheel) {
		int x = getBadTyre();
		if (x != 5){
			Wheel old = wheels[x];
			wheels[x] = wheel;
			System.out.println("Колесо успешно заменено!");
			return old;
			
		} else {
			System.out.println("Нет колес нуждающихся в замене!");
			return null;
		}
	}
	
	
	private int getBadTyre() {
		for (int i = 0; i < wheels.length; i++) {
			if (wheels[i].getTyreResource() < 500) {
				return i;
			}
		}
		return 5;
	}



	public void printBrand() {
		System.out.println(brand.getBrand());
	}
}
