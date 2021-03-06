package com.jd;

public class EmployeeBean {
	private String empName = null;
	private int empId = 0;
	private float salary = 0;
	private String address = null;
		
	
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	/**
	 * @return the salary
	 */
	public float getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(float salary) {
		this.salary = salary;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	
	// override equals method
	@Override
	public boolean equals(Object o) {
		boolean isEqual = false;
		
		// condition 1
		if (! ( o instanceof EmployeeBean)) {
			return false;
		}
		
		EmployeeBean givenEmployee = (EmployeeBean)o; // casting
		
		// conditions -- tru if empId and empName are equal
		if ( (this.empId == givenEmployee.getEmpId()) && 
			 (this.empName.equals(givenEmployee.getEmpName()))
			) {
			return true;
		}
		
		return isEqual;
	}
	 
	//
	
	@Override
	public int hashCode() {
		return empId;
	}
	
	
	// toString() -- [id=1,name=Employee1]
	@Override
	public String toString() {
		//return "[id="+empId+",name="+empName+"]";
		return new StringBuilder()
		        .append("[")
				.append(empId)
				.append(",")
				.append(empName)
				.append("]")
				.toString();
		
	}
	
	

}
