package com.anandhi;

public class Person {
	private String name;
	private int age;
	private char sex;

	public Person(String name, int age, char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public void incrementAge() {
		this.age++;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getSex() {
		return sex;
	}


	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Person{");
		sb.append("name='").append(name).append('\'');
		sb.append(", age=").append(age);
		sb.append(", sex='").append(sex).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
