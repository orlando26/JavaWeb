package model;

public class Person {
	
	private String name;
	
	private String lastName;
	
	private String email;
	
	private Integer age; //wrapper classes

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Persona [name=" + name + ", lastName=" + lastName + ", email=" + email + ", age=" + age + "]";
	}
	
	
	
	
	
}
