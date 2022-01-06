package com.te.logger;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class MyFormatter extends Formatter{

	@Override
	public String format(LogRecord record) {
		return record.getMessage()+":"+record.getSourceClassName()+":"+record.getLevel()+"\n";
	}

}
