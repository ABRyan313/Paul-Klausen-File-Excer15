package fileExcr15;

import java.util.*;
import java.io.*;

public class FileReadWrite {

	public static void main(String[] args) {

		Write();
		Read();

	}

	private static void Write() {

		Scanner sc = new Scanner(System.in);
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("Names.txt"));
			System.out.println("Enter the names");
			
			while (true) {
				
				String names = sc.nextLine();
                if (names.isEmpty()) {
					break;
				}
				writer.write(names);
				writer.newLine();
			}
			
			writer.close();
			sc.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}
	
	private static void Read() {
		 try {
	            BufferedReader reader = new BufferedReader(new FileReader("names.txt"));
	            String line;
	            System.out.println("Names in the file:");
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
	            reader.close();
	        } catch (IOException e) {
	            System.err.println("Error reading from file: " + e.getMessage());
	        }
	}

}
