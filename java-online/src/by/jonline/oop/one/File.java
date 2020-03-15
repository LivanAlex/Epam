package by.jonline.oop.one;

public class File{
	
	private String name;

	public File(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void rename(String name) {
		setName(name);
	}
	
	@Override
	public String toString () {
		return "File [name=" + name + "]";
	}
	
}
