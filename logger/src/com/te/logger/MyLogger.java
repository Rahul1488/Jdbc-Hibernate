package com.te.logger;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyLogger {
	public static final Logger LOGGER = Logger.getLogger(MyLogger.class.getName());

	public static void main(String[] args) throws SecurityException, IOException {
		// ConsoleHandler consoleHandler = new ConsoleHandler();//this is console
		// handler and prints on console not on file
		// consoleHandler.setLevel(Level.SEVERE);
		FileHandler fileHandler = new FileHandler("G:\\logger\\log.log");
		MyFormatter myFormatter = new MyFormatter();
		fileHandler.setFormatter(myFormatter);
		LOGGER.addHandler(fileHandler);
		LOGGER.setLevel(Level.FINE);
		LOGGER.finest("I am from finest");
		LOGGER.finer("Hello im from finer");
		LOGGER.fine("I am from fine");
		LOGGER.config("i am from config");
		LOGGER.info("i am from info");
		LOGGER.warning("i am fom warning");
		LOGGER.severe("i am from sever");
	}
}
