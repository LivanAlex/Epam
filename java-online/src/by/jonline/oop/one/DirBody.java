package by.jonline.oop.one;

import java.util.HashMap;
import java.util.Map;

public class DirBody extends Body {
	
	private Map <String, Dir> childrens;
	private Map <String, File> files;
	
	
	public DirBody(String name) {
		super();
		childrens = new HashMap<>();
		files = new HashMap<>();
	}
	

	public Map<String, Dir> getChildrens() {
		return childrens;
	}

	public void setChildrens(Map<String, Dir> childrens) {
		this.childrens = childrens;
	}

	public Map<String, File> getFiles() {
		return files;
	}

	public void setFiles(Map<String, File> files) {
		this.files = files;
	}

	@Override
	public String toString() {
		return "DirBody [childrens=" + childrens + ", files=" + files + "]";
	}
	
	
	
	
	
	
	
	
	

}
