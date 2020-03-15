package by.jonline.four.aggregation_composition02;

public enum Engine {
	PETROL1600(1600), PETROL2200(2200);
	
	private int value;
	private int resource;

	Engine(int value) {
		this.value = value;
		resource = 1000000;
	}
	
	public int getEngineValue () {
		return value;
	}

	public int getResource() {
		return resource;
	}

	public void setResource(int resource) {
		this.resource = resource;
	}
}
