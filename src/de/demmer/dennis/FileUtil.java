package de.demmer.dennis;

import java.io.File;

public class FileUtil {
	
	
	String result = "";

	public String printDirectory(File dir, String search) {
		if(!dir.exists()) {
			return "File not found";
		}
		
		for(File f : dir.listFiles()) {
			
			if(f.getName().equals(search)) {
				result = f.getAbsolutePath();
			}
			
			if(f.isDirectory()) {
				printDirectory(f, search);
			}
		}
		
		return result;
	}
	
	
	
	
	
		
		

	



}
