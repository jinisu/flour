package com.rrkj.flour.utils.common;

public class ConsoleLog {

	public static void print(Object... args) {
		System.out.println(ConsoleLog.log(args));
	}

	public static String log(Object... args) {
		StringBuilder string = new StringBuilder();
		for (int i = 0; i < args.length; i++) {
			string.append(args[i] + "\t");
		}
		return string.toString();
	}

}
