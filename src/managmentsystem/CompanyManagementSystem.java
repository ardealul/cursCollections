package managmentsystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import hierarchy.*;

public class CompanyManagementSystem {
/**
 * Just returns the parking list using transformEmployees on the 
 * list.
 * @return the parking list
 */
	public List<Employee> returnParkingList() {
		Company company = createList();
		List<Employee> list = new ArrayList<Employee>();
		list.addAll((Collection<? extends Employee>) company.getCleaner());
		list.addAll((Collection<? extends Employee>) company.getManager());
		list.addAll((Collection<? extends Employee>) company.getSoftwareengineer());
		return transformEmployees(list);

	}
	/**
	 * Just filling some tests
	 * @return Company.company
	 */
	public Company createList() {
		Company company = new Company();
		company.addCleaner(new Cleaner("Michael Mihai", 12, false));
		company.addCleaner(new Cleaner("Robert Man", 22, true));
		company.addCleaner(new Cleaner("Another Name", 13, false));
		company.addManager(new Manager("Mark Zuckenb", 32, true));
		company.addManager(new Manager("Zeil Vongloten", 21, true));
		company.addManager(new Manager("Maxim Volf", 3, false));
		company.addSoftwareengineer(new JuniorSoftwareEngineer("Deas Vangarted", 4, false));
		company.addSoftwareengineer(new JuniorSoftwareEngineer("Luois Jacob", 2, false));
		company.addSoftwareengineer(new JuniorSoftwareEngineer("Stefan Popovici", 24, true));
		return company;
	}
/**
 * This method transforms the employee list into an array, uses the
 * swapEmployees method on it, and transforms it back into a list.
 * Then it transforms the array back into a List
 * @param list
 * @return targetList
 */
	public List<Employee> transformEmployees(List<Employee> list) {
		Employee[] empArray = list.toArray(new Employee[list.size()]);
		swapEmployees(empArray);
		List<Employee> targetList = Arrays.asList(empArray);
		return targetList;
	}
	/**
	 * The method iterates the list and creates a swap between 
	 * employees which are not in the right order in years.
	 * swapLogic function.
	 * @param empArray
	 */
	public void swapEmployees(Employee[] empArray) {
		for (int i = 0; i <= empArray.length; i++)
			for (int j = 1; j < (empArray.length); j++) 
				swapLogic(empArray, j);
	}
	/**
	 * This  method compares employees to check which one's the older
	 * person in the company.
	 * @param empArray
	 * @param j
	 */
	private void swapLogic(Employee[] empArray, int j) {
		if (empArray[j - 1].getYearsInCompany() > empArray[j].getYearsInCompany()) {
			Employee temp = empArray[j - 1];
			empArray[j - 1] = empArray[j];
			empArray[j] = temp;
		}
	}

	/**
	 * This method gets an array of employees and if it found they have parking it
	 * puts him into a hasParking list. At the end, returns the list
	 * 
	 * @param list
	 * @return hasParking list
	 */
	public List<Employee> hasParkingFinder(List<Employee> list) {
		List<Employee> hasParking = new ArrayList<Employee>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).isHasParking() == true) {
				hasParking.add(list.get(i));
			}
		}
		return hasParking;

	}
}
