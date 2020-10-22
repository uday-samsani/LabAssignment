package lab04.exercise01;

public class Person {
	private String name;
	private float age;
	
	Person(String name, float age){
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return this.name;
	}
	public float getAge() {
		return this.age;
	}
}
