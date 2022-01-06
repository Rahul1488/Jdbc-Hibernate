package com.te.assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Multiplayer {
	static Scanner sc = new Scanner(System.in);
	int count = 0;

	public void search(ArrayList arraylist, String song) {

		for (int i = 0; i < arraylist.size(); i++) {
			if (arraylist.get(i).equals(song)) {
				System.out.println("Song Present");
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println("Song not found");
		}

	}

	public void Play(ArrayList arraylist, String song) {
		System.out.println(song + " Playing.....");
		System.out.println("press b to go back or r to play random song");
		String option = sc.next();
		switch (option) {
		case "b":
			break;
		case "r": {
			Random rand = new Random();
			int number = rand.nextInt(arraylist.size());
			randomSong(arraylist, number);
			break;
		}

		}

	}

	public void randomSong(ArrayList arraylist, int number) {
		System.out.println(arraylist.get(number) + " Playing......");

	}

	public void addSong(HashSet songlist, String song) {
		songlist.add(song);
		System.out.println(song + " Added");
	}

	public void delete(HashSet songlist, String song) {
		songlist.remove(song);
		System.out.println(song + " Deleted");
	}

}