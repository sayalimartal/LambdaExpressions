//Sort directories before files, each sorted according to path names
package com.sortfiles;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class SortFilesAndDirectories {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		ArrayList<File> files=new ArrayList<>();  //Create an ArrayList of files
		
		System.out.println("Enter directory name along with the path");
		String path=scanner.nextLine();  //Input the path name
		
		File dir=new File(path);      //Create a file object
		File[] file=dir.listFiles();  //Store path names in an array of files
		
		files.addAll(Arrays.asList(file));  //Add all files to the ArrayList
		Predicate<File> findDirectories = (fileInList) -> fileInList.isDirectory(); //Check if it is a directory
		
		files.stream().filter(findDirectories).sorted().forEach(System.out::println); //Display sorted directories
		files.stream().filter(findDirectories.negate()).sorted().forEach(System.out::println); //Display sorted files
		scanner.close();
	}
}