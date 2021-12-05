package com.te.challeges;

	import java.util.Scanner;

	public class Challenge1 {
		static int hour;

		void getDurationString(int minutes, int seconds) {
			if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
				hour = minutes / 60;
				minutes = minutes % 60;
				System.out.println(hour + ":" + minutes + ":" + seconds);
			} else
				System.out.println("invalid value");
		}

		void getDurationString(int seconds) {
			if (seconds >= 0) {
				seconds = seconds / 60;
				System.out.println(seconds + " minute");
			} else
				System.out.println("invalid input");
		}

		public static void main(String[] args) {
			Challenge1 c = new Challenge1();
			c.getDurationString(120, 1);
			c.getDurationString(60);

		}
	}

