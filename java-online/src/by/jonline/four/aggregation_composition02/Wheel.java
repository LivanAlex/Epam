package by.jonline.four.aggregation_composition02;

public enum Wheel {
	
	GOOD(50_000), BAD(150);
	

	private int tyreResource;

	
	
	Wheel (int tyreResource) {
		this.tyreResource = tyreResource;
	}
	
	public int getTyreResource() {
		return tyreResource;
	}

	public void setTyreResource(int tyreResource) {
		this.tyreResource = tyreResource;
	}
	
	public void drive(int km) {
		tyreResource -= km;
	}
}
