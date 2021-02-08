package epita.fr.datamodel;

public class Person{
	private String name;
	private char sex;
	private int age;
	private int height;
	private int weight;
	
	public Person() {}
	
	public Person(String name, char sex, int age, int height, int weight) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public char getSex() {
		return sex;
	}
	
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String toString() {
		return "Person [name=\""+this.name+"\", weight=\""+this.weight+"\"]";
	}
}
