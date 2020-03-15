package by.jonline.four.aggregation_composition05;

public enum Type {
	VACATION("отдых"),
	EXCURSION("экскурсия"),
	HEALING("лечение"),
	SHOPING("шопинг"),
	CRUISE("круиз");
	
	private String name;
	
	Type (String type){
		this.name = type;
	}
	
	public String getName() {
		return name;
	}
}
