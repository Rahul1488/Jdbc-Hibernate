package com.te.hashcode;
import java.util.Objects;

public class Student {
	int roll;
	String name;
	double percen;

	public Student(int roll, String name, double percen) {
		super();
		this.roll = roll;
		this.name = name;
		this.percen = percen;
	}

	@Override
	public int hashCode() {
		int hc = 0;
		hc += roll;
		return hc;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(percen) == Double.doubleToLongBits(other.percen) && roll == other.roll;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", percen=" + percen + "]";
	}

}