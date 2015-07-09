package com.jd;

import java.util.Comparator;

public class EmployeeDescComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		EmployeeSortBean eo1 = (EmployeeSortBean)o1;
		EmployeeSortBean eo2 = (EmployeeSortBean)o2;
		int nc = eo2.getEmpName().compareToIgnoreCase(eo1.getEmpName()); //desc
		int ic = new Integer(eo2.getEmpId()).compareTo(eo1.getEmpId());//desc
		return (nc!=0?nc:ic);
	}

}
