package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramComparable {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();		
		String path = "C:\\Users\\prmsa\\eclipse-workspace_2018-09\\Comparable\\Lista.txt";
		 
		try (BufferedReader buffered = new BufferedReader(new FileReader(path))) {
			
			String name = buffered.readLine();
			while (name != null) {
				list.add(name);
				name = buffered.readLine();
			}
			Collections.sort(list);
			for (String ordenar : list) {
				System.out.println(ordenar);
			}
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());

		}
	}
}
