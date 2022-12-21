package com.bat.practice.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.regex.Pattern;

public class MoveFile {
	
	public static void main(String[] args) {
		
		File source = new File("D:\\Yogesh\\source");
		File target = new File("D:\\Yogesh\\target");
		try {
			transfer(source, target);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	private static void transfer(File source, File target) throws IOException{
		String absolutePath = source.getAbsolutePath();
		
		if(source.isDirectory() && source.list().length > 0) {
			for(String fileName :source.list()) {
				
				System.out.println("fileName ->"+fileName);
				
				if(Pattern.matches("fraudCustomers-\\d+.csv", fileName)) {
					
					String sourceAbsolutePath = source.getAbsolutePath()+"\\"+fileName;
					System.out.println("sourceAbsolutePath -> "+ sourceAbsolutePath);
					
					String targetAbsolutePath = target.getAbsolutePath()+"\\"+fileName;
					System.out.println("targetAbsolutePath -> "+ targetAbsolutePath);
					
					File sourceFile = new File(sourceAbsolutePath);
					File targetFile = new File(targetAbsolutePath);
					
					System.out.println("Starting transfer ==>> "+sourceFile.getAbsolutePath()+" to "+targetFile.getAbsolutePath());
					
					moveFile(sourceFile,targetFile);
					
					boolean isSuccess = deleteSourceFile(sourceFile);
					
					System.out.println("is the File deleted? : "+isSuccess);
				}
				System.out.println("--------------------------------------------------------------------------------------------------- ");
			}		
		}
	}
	
	private static void moveFile(final File source, final File target) throws IOException{
		
		Files.copy(source.toPath(), target.toPath(),StandardCopyOption.REPLACE_EXISTING);
		System.out.println("Successfully transfered file from "+source.getAbsolutePath()+" -> to "+target.getAbsolutePath());
		
	}
	
	private static boolean deleteSourceFile(File source) {
		
		return source.delete();
	}
	
	
	

}
