//Display all subdirectories within a given directory
package com.subdirectory;

import java.io.File;
import java.util.Scanner;

public class findSubdirectories {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the directory name along with the path");
		String path=scanner.nextLine();    //Input the path 
		
		scanner.close();
		
		File dir=new File(path);  //Create a file object
		File[] subDirs=dir.listFiles((file) -> file.isDirectory()); //Store paths of subdirectories in a file array
		
		System.out.println("List of subdirectories in the given directory is");
		for(File file:subDirs) {
			System.out.println(file.getName());  //Display the subdirectories
		}
		
		System.out.println("*******************************");
		
		File[] subDirsMR=dir.listFiles(File::isDirectory);  //Store paths of subdirectories in a file array using method reference
		System.out.println("List of subdirectories in the given directory is");
		for(File file:subDirsMR) {
			System.out.println(file.getName());  //Display the subdirectories
		}
	}
}