package com.te.sets;

public class Team {
	int num;
	String name;
	int age;
	static int count;
	int count1;

	public void check(int count1) {
		if (count1 > 11) {
			throw new NotApplicable("Can't add Players more than 11!");
		}
	}

	public Team(int num, String name, int age) {
		super();
		count++;
		// count1 = count;
		this.num = num;
		this.name = name;
		this.age = age;
		// System.out.println(count);
		this.check(count);
	}

	@Override
	public String toString() {
		return "Team [num=" + num + ", name=" + name + ", age=" + age + "]";
	}

}