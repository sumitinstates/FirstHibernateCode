package com.sumit;


public class Application {

	public static void main(String[] args) throws Exception {
		Employee e;
		EmployeeService service = new EmployeeService();
		e = new Employee();
		
	e.setEmpId(101);
		e.setEmpName("alia");
		
		service.add(e);
		
	}
	
	
}
