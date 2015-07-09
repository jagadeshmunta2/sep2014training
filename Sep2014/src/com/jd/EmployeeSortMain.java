package com.jd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class EmployeeSortMain {
	
	static List<EmployeeSortBean> listOfEmployees = new LinkedList<EmployeeSortBean>(); //<EmployeeBean>();
	
	public static void main(String [] args) {
		
		EmployeeSortBean e1 = new EmployeeSortBean();
		e1.setEmpId(1);
		e1.setEmpName("Employee1");
		//addEmployee(e1);
		listOfEmployees.add(e1);

		long t1 = System.currentTimeMillis();

		EmployeeSortBean e2 = new EmployeeSortBean();
		e2.setEmpId(2);
		e2.setEmpName("Employee2");
		listOfEmployees.add(e2);
		
		long t2 = System.currentTimeMillis();
		long totalTime = (t2-t1)/1000;
		
		int numEmployees = listOfEmployees.size();
		
		for (EmployeeSortBean emp: listOfEmployees) {
			System.out.println("Name:"+emp.getEmpName());
		}
		
		/*if (e1==e2) { // primitives
			System.out.println("Employees ==");
		} else {
			System.out.println("Employees !=");			
		}*/
		
		//EmployeeMain em = new EmployeeMain();
		if (e1.equals(e2)) {
			System.out.println("Employees equal");
		} else {
			System.out.println("Employees not equal");
		}
		
		System.out.println("Employee1 is "+ e1);
		System.out.println("Employee2 is "+ e2);


		EmployeeSortBean e4 = new EmployeeSortBean();
		e4.setEmpId(4);
		e4.setEmpName("AEmployee");
		listOfEmployees.add(e4);

		EmployeeSortBean e3 = new EmployeeSortBean();
		e3.setEmpId(3);
		e3.setEmpName("aEmployee");
		listOfEmployees.add(e3);
		
		System.out.println("Using natural order with Comparable interface...");
		Collections.sort(listOfEmployees); // natural order
		System.out.println(listOfEmployees);
		
		System.out.println("Using Comparator...");
		Collections.sort(listOfEmployees,new EmployeeDescComparator()); // desc
		System.out.println(listOfEmployees);
		
		
		
	}
	
	/**
	 * Add an employee to list
	 * @param emp
	 */
	public static void addEmployee(EmployeeSortBean emp) {
		listOfEmployees.add(emp);
	}
	

}
