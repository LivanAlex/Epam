package by.jonline.oop.one;

public abstract class FileObject {
	
	private String name;
	private Body body;
	
	public FileObject(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}
	
	public void rename(String name) {
		setName(name);
	}
	
	public void show() {
		System.out.println(body.toString());
	}
	
	

}
