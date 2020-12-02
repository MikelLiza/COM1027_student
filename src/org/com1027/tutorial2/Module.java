package org.com1027.tutorial2;

public class Module {
	private String name = null;
	private int credit = 0;
	private int hours = 0;
	public Module(String name)  {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getCredit() {
		return credit;
	}
	public int getHours() {
		return hours;
	}
	@Override
	public String toString() {
		return name;
	}
	
}
