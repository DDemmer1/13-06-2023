package de.demmer.dennis;

import java.io.File;

public class FileUtil {
	
	
	public void printDirectory(File dir) {
		if(!dir.exists()) {
			return;
		}
		
		for(File f : dir.listFiles()) {
			System.out.println(f.getAbsolutePath());
			if(f.isDirectory()) {
				printDirectory(f);
			}
		}
		
		
		
		
		
	}

	
	

}
