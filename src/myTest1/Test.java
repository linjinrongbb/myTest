package myTest1;

import java.io.File;

public class Test {
	public static void main(String args[]) {
		String fileName = "C:/Users/win8/Desktop/HelloWork";
	    File newFile = new File(fileName);
	    newFile.mkdirs();
		System.out.print("hello");
	}
}
