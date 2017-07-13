package com.sweet.rabbit;

import org.slf4j.helpers.MessageFormatter;
import org.springframework.boot.ansi.AnsiColor;
import org.springframework.boot.ansi.AnsiOutput;

public class PrintUtils {

	public static void printWithGreenColor(Object object) {
		printWithColor(AnsiColor.GREEN, object);
	}

	public static void printWithGreenColor(String format, Object... arguments) {
		printWithColor(AnsiColor.GREEN, format, arguments);
	}

	public static void printWithRedColor(Object object) {
		printWithColor(AnsiColor.RED, object);
	}

	public static void printWithRedColor(String format, Object... arguments) {
		printWithColor(AnsiColor.RED, format, arguments);
	}


	public static void printWithBlueColor(Object object) {
		printWithColor(AnsiColor.BLUE, object);
	}

	public static void printWithBlueColor(String format, Object... arguments) {
		printWithColor(AnsiColor.BLUE, format, arguments);
	}

	public static void printWithColor(AnsiColor color, String format, Object... arguments) {
		String message = MessageFormatter.arrayFormat(format, arguments).getMessage();
		printWithColor(color, message);
	}

	public static void printWithColor(AnsiColor color, Object object) {
		if (object == null) {
			return;
		}

		String text = null;
		if (object instanceof String) {
			text = (String) object;
		} else {
			text = object.toString();
		}

		AnsiOutput.setEnabled(AnsiOutput.Enabled.ALWAYS);

		System.out.println();
		System.out.println(AnsiOutput.toString(color, text, AnsiColor.DEFAULT));
		System.out.println();
	}
}