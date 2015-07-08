package masteringJava;

public class Frog {
	private String name;
	private int age;
	private int id;

	public Frog(int id, String name){
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setInfo(String name, int age) {
		setName(name);
		setAge(age);
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		return sb.toString();
	}
}
