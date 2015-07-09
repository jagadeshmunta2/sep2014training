package com.jd;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class EmployeeMain {
	
	static List<EmployeeBean> listOfEmployees = new LinkedList<EmployeeBean>(); //<EmployeeBean>();
	
	public static void main(String [] args) {
		
		EmployeeBean e1 = new EmployeeBean();
		e1.setEmpId(1);
		e1.setEmpName("Employee1");
		//addEmployee(e1);
		listOfEmployees.add(e1);

		long t1 = System.currentTimeMillis();

		EmployeeBean e2 = new EmployeeBean();
		e2.setEmpId(2);
		e2.setEmpName("Employee2");
		listOfEmployees.add(e2);
		
		long t2 = System.currentTimeMillis();
		long totalTime = (t2-t1)/1000;
		
		int numEmployees = listOfEmployees.size();
		
		for (EmployeeBean emp: listOfEmployees) {
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
		
		
		
	}
	
	/**
	 * Add an employee to list
	 * @param emp
	 */
	public static void addEmployee(EmployeeBean emp) {
		listOfEmployees.add(emp);
	}
	

}
