package com.cg.cmdLineArg;

//Class that takes input from command line
public class CommandLineArgument {

	public static void main(String[] args) {

		int i, total = 0;
		for (i = 0; i < args.length; i++) {
			total += Integer.parseInt(args[i]);
		}

		System.out.println(total);
	}

}
