package de.demmer.dennis;

import java.io.File;

public class Application {
	
	public static void main(String[] args) {
		
		FileUtil fileUtil = new FileUtil();
		
		File file = new File("C:/Users/Unknown/git/13-06-2023");
		
		fileUtil.printDirectory(file);
		
			
		}
		
		


}
