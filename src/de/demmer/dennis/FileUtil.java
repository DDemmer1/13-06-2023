package de.demmer.dennis;

import java.io.File;

public class FileUtil {
	
	
	public String printDirectory(File dir, String search) {
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
