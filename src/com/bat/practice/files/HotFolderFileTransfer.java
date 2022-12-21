package com.bat.practice.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.swing.text.DefaultEditorKit.CopyAction;

public class HotFolderFileTransfer {
	public static void main(final String[] args) throws IOException
	{
		 File source = new File(
				"C:\\Users\\tech\\Desktop\\source\\");
		
				String targetPath="D:\\pavan\\";
		
		if (source.isDirectory()) {
			File absoluteFile= source.getAbsoluteFile();
			System.out.println("absolutePath=="+absoluteFile);
			System.out.println("source path --->"+source.getPath());

			String [] fileList=source.list();
			for(String fileName: fileList) {
				System.out.println("filename=="+fileName);
				File f=new File(absoluteFile.getAbsolutePath()+"\\"+fileName);
				
				System.out.println("absolutePath=="+f.getPath());
				File target =new File(targetPath+fileName);
				
				Files.copy(f.toPath(), Paths.get(targetPath, fileName),StandardCopyOption.REPLACE_EXISTING);
				
			}
		}

	}



	private static String transferFile(final File source, final File target)
	{
		String output = null;
		try
		{
//			Path s=Files.copy(source.toPath(), target.toPath(), StandardCopyOption.COPY_ATTRIBUTES);
			
//			System.out.println(s.getFileName());
			Files.move(source.toPath(), target.toPath());
			output = "Successfully transfered";
		}
		catch (final Exception e)
		{
			e.printStackTrace();
		}
		return output;
	}




}
