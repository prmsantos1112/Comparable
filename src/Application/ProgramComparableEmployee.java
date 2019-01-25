package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employees;

public class ProgramComparableEmployee {

	public static void main(String[] args) {

		List<Employees> list = new ArrayList<>();		
		String path = "C:\\Users\\prmsa\\eclipse-workspace_2018-09\\Comparable\\Funcionarios.txt";
		 
		try (BufferedReader buffered = new BufferedReader(new FileReader(path))) {
			
			String EmployeeCsv = buffered.readLine();
			while (EmployeeCsv != null) {
				String[] fields = EmployeeCsv.split(",");
				list.add(new Employees(fields[0], Double.parseDouble(fields[1])));
				EmployeeCsv = buffered.readLine();
			}
			Collections.sort(list);
			for (Employees emp : list) {
				System.out.println(emp.getName() + ", " + emp.getSalary());
			}
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());

		}
	}
}
