package com.java1234.entity;
public class People {
	private int id;
	private int age;
	private String name;
	private String className;
	private Dog dog;
	
	public People() {
		System.out.println("��ʼ��People");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	@Override
	public String toString() {
				return "People [id=" + id + ", age=" + age + ", name=" + name + ", className=" + className + ", dog=" + dog.getName()
				+ "]";
	}
	
	
	
	
	

}
