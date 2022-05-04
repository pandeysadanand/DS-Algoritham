package com.bl.algorithm;

/*@author sadanand pandey
* searching word in give words list
* */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) throws Exception {
		ArrayList<String> arrayList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String word;
		/*
		 * passing path of file and reading file
		 */
		File file = new File("C:\\Users\\sadan\\OneDrive\\Desktop\\test.txt");
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		String buffer = bufferedReader.readLine();
		/*
		 * adding words in array list and storing in buffer
		 */
		while (buffer != null) {
			arrayList.add(buffer.toLowerCase());
			System.out.println(arrayList);
			buffer = bufferedReader.readLine();
		}
		word = scanner.next();
		/*
		 * searching and printing availability of word
		 */
		for (String index : arrayList) {
			if (index.contains(word)) {
				System.out.println("Word found");
			} else {
				System.out.println("Word not found");
			}
		}
		/*
		 * closing bufferedReader object
		 */
		bufferedReader.close();
	}
}
