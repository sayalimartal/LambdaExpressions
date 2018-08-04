//Display files with specified extension from the specified directory
package com.listfileswithextension;

import java.io.File;
import java.util.Scanner;

public class FileExtension {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the directory name along with the path");
		String path=scanner.nextLine(); //Input path name
		
		File dir=new File(path);  //Create a file object
		System.out.println("Enter the extension");
		String ext=scanner.nextLine(); //Input the desired extension
		
		scanner.close();
		
		//Store files with specified extension in an array of strings
		String[] listFile=dir.list((d,s) -> s.toLowerCase().endsWith(ext)); 
		
		for(String file:listFile) {
			System.out.println(file); //Display files
		}
	}
}