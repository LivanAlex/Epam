package by.jonline.oop.one;

import java.util.ArrayList;
import java.util.List;

public class Path {
	
	private String name;
	private List <Path> children;
	
	public Path (String name) {
		children = new ArrayList<>();
		this.name = name;
	}
	
	public void setSubPath(Path path) {
		children.add(path);
	}
	
	public void setSubPath(String name) {
		children.add(new Path(name));
	}
}
