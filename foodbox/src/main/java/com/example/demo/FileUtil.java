package com.example.demo;

import java.nio.file.Path;
import java.nio.file.Paths;

public final class FileUtil {

	private FileUtil(){		
	}
	  public static final String folderPath =  "D://incoming-files//";
	  public static final Path filePath = Paths.get(folderPath);
}
