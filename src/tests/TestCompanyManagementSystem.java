package tests;


import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import managmentsystem.CompanyManagementSystem;
import hierarchy.*;

import org.junit.jupiter.api.Test;

class TestCompanyManagementSystem {

	@Test
	void testHasParking() {
		CompanyManagementSystem a = new CompanyManagementSystem();
		List<Employee> listEmployee = new ArrayList<Employee>();
		
		listEmployee.add(new Employee("Vasile", 3, false));
		listEmployee.add(new Employee("Mircea", 2, true));
		Employee test = listEmployee.get(1);
		List<Employee> hasParking = a.hasParkingFinder(listEmployee);
		System.out.println(hasParking);
		assertEquals(test,hasParking.get(0));
	}
	@Test
	void testSwapEmployee() {
		CompanyManagementSystem a = new CompanyManagementSystem();
List<Employee> listEmployee = new ArrayList<Employee>();
		
		listEmployee.add(new Employee("Vasile", 3, false));
		listEmployee.add(new Employee("Mircea", 2, true));
		assertEquals(a.transformEmployees(listEmployee).get(1),listEmployee.get(0));

		
}
}