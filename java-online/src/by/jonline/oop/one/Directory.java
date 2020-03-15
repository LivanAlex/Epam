package by.jonline.oop.one;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Directory {
	
	private String name;
	private String path;
	private Map <String, Directory> childrens;
	private Map <String, File> files;
	
	public Directory(String name) {
		childrens = new HashMap<>();
		files = new HashMap<>();
		this.name = name;
		path = name + "/";
	}

	public void rename(String oldName, String newName){
		if (childrens.containsKey(oldName)) {
			Directory temp = childrens.get(oldName);
			temp.name = newName;
			childrens.remove(oldName);
			childrens.put(newName, temp);
			System.out.println("директория [" + oldName + "] была успешно переименована");
		} else if (files.containsKey(oldName)) {
			File temp = files.get(oldName);
			temp.setName(newName);
			files.remove(oldName);
			files.put(newName, temp);
			System.out.println("файл \"" + oldName + "\" был успешно переименован");
		} else {
			System.out.println("не найдено директории или файла с именем \"" + oldName + "\"");
		}
		
		
	}
	
	
	public void addDirectory(Directory dir){
		childrens.put(dir.name, dir);
		dir.path = this.path + dir.name + "/"; 
	}
	
	public void addFile(File file){
		files.put(file.getName(), file);
	}
	
	public void addDirectory(String name){
		addDirectory(new Directory(name));
	}
	
	public void addFile(String name){
		files.put(name, new File(name));
	}
	
	public void delete (String name) {
		if (childrens.containsKey(name)) {
			childrens.remove(name);
			System.out.println("директория [" + name + "] была успешно удалена");
		} else if (files.containsKey(name)) {
			files.remove(name);
			System.out.println("файл \"" + name + "\" был успешно удален");
		} else {
			System.out.println("не найдено директории или файла с именем \"" + name + "\"");
		}
	}
	
	public void delete (Directory dir) {
		if (childrens.containsKey(dir.name)) {
			childrens.remove(dir.name);
			System.out.println("директория [" + dir.name + "] была успешно удалена");
		} else {
			System.out.println("не найдено директории с именем [" + name + "]");
		}
	}
	
	public void delete (File file) {
		if (files.containsKey(file.getName())) {
			files.remove(file.getName());
			System.out.println("файл \"" + name + "\" был успешно удален");
		} else {
			System.out.println("не найдено файла с именем [" + name + "]");
		}
	}
	
	
	public void show(){
		System.out.println(path + "...");
		if (!childrens.isEmpty()) {
			Set <String> dir = childrens.keySet();
			for (String s : dir) {
				System.out.println("[" + s + "]");
			}
		}
		if (!files.isEmpty()) {
			ArrayList<File> fil = new ArrayList<>(files.values());
			for (File f : fil) {
				System.out.println(f.getName());
			}
		}
		
	}
	
	
	

}
