package by.jonline.four.aggregation_composition02;

public enum Brand {
	RENAULT("Renault"), LADA("Lada");
	
	private String name;
	
	private Brand(String name){
		this.name = name;
	}
	
	public String getBrand() {
		return name;
	}

}
