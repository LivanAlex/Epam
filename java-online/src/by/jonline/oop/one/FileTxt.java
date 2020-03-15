package by.jonline.oop.one;

public class FileTxt extends File {
	
	private String data;
	
	
	public FileTxt(String name) {
		super(name+".txt");
		data = "";
	}
	
	
	
	public String getData() {
		return data;
	}
	
	public void show() {
		System.out.println(data);
	}

	public void setData(String data) {
		this.data = data;
	}

	public void addData(String data) {
		this.data += data;
	}
	
}
