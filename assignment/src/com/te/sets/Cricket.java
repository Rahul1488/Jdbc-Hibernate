package com.te.sets;

import java.util.HashSet;

public class Cricket {
	public static void main(String[] args) {
		HashSet<Team> set1 = new HashSet();
		set1.add(new Team(1, "Chriss Gayle",333 ));
		set1.add(new Team(2, "Virat Kholi", 18));
		set1.add(new Team(3, "Abraham Benjamin DeVelliers", 17));
		set1.add(new Team(4, "Glenn Maxwell", 23));
		set1.add(new Team(5, "Jacquee Khallis", 45));
		set1.add(new Team(6, "K L Rahul", 35));
		set1.add(new Team(7, "Anil Kumble",56));
		set1.add(new Team(8, "Mohammed Siraj", 60));
		set1.add(new Team(9, "Yuzi Chahal", 68));
		set1.add(new Team(10, "Zaheer Khan", 40));
		set1.add(new Team(11, "Harshal Patel", 39));
		for (Team t : set1) {
			System.out.println(t);
		}
		set1.add(new Team(12, "Muttaiyah muralitharan", 20));
		for (Team t : set1) {
			System.out.println(t);
		}
	}
}