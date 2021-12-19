package com.te.casestudy;

import java.util.Scanner;

public class User {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Mediaplayer mediaplayer = new Mediaplayer() {
		};
		int count = 0;
		do {
			System.out.println("Enter 'playlist' to see the Playlist");
			System.out.println("Enter 'play' to play Your song from play list");
			System.out.println("Enter 'add'  to add the song");
			System.out.println("Enter 'delete' to delete the song");
			System.out.println("Enter 'search' to search the song");
			System.out.println("Enter 'update' to update the song name");
			System.out.println("Enter 'singer' to searchBySingerName");
			System.out.println("Enter 'exit' to exit the application");
			String selector = scanner.next();
			switch (selector) {
			case "play": {
				mediaplayer.playlist();
				if (!mediaplayer.play()) {
					System.out.println("No Result");
				}
				break;
			}
			case "playlist": {
				mediaplayer.playlist();
				break;
			}
			case "add": {
				mediaplayer.add();
				break;
			}
			case "delete": {
				mediaplayer.delete();
				break;

			}
			case "search": {

				if (!mediaplayer.search()) {
					System.out.println("No result");
				}
				break;
			}
			case "update": {
				mediaplayer.update();
				break;
			}

			case "singer": {

				if (!mediaplayer.searchBySingerName()) {
					System.out.println("No result");
				}
				break;
			}
			case "exit": {
				count++;
				break;
			}
			}

		} while (count == 0);
		}
}
