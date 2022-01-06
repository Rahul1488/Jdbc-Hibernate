package Logger.MyLogger;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Logger4j {
	static final Logger LOGGER = LogManager.getLogger(Logger4j.class);
	public static void main(String[] args) {
		LOGGER.fatal("I am from fatal");
		LOGGER.error("I am from error");
        LOGGER.warn("I am from warn");
        LOGGER.info("I am from info");
        LOGGER.debug("i am from debug");
        LOGGER.trace("I am fromm trace");
	}
}
