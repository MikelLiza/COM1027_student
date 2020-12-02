package org.com1027.tutorial2;

public class Student {
	private String forename = null;
	private String surname = null;
	private int age = 0;
	private Module module = null;
	private Module module2 = null;
	public Student(String forename, String surname, int age, Module module, Module module2) {
		super();
		this.forename = forename;
		this.surname = surname;
		this.age = age;
		this.module = module;
		this.module2 = module2;
	}
	public String getForename() {
		return forename;
	}
	public void setForename(String forename) {
		this.forename = forename;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [forename=" + forename + ", surname=" + surname + ", module=" + module + ", module2=" + module2 + "]";
	}
	
}
