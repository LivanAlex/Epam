package by.jonline.oop.one;

import java.util.Set;

public class Dir extends FileObject {
	

	
	public Dir(String name) {
		super(name);
		super.setBody(new DirBody(name));
	}

	
	@Override
	public void show() {
		DirBody temp = (DirBody) super.getBody();
		Set <String> dirs = temp.getChildrens().keySet();
		if (!dirs.isEmpty()) {
			for (String s : dirs) {
			System.out.println("[" + s + "]");
			}
		}
		Set <String> files = temp.getFiles().keySet();
		if (!files.isEmpty()) {
			for (String s : files) {
			System.out.println(s);
			}
		}
	}
}
