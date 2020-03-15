package by.jonline.four.aggregation_composition03.town;

public class Town {
	protected String name;
	protected Type type;

	public Town(String name, Type type) {
		this.name = name;
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public Type getType() {
		return type;
	}
}
