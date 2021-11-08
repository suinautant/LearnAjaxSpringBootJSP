package com.suinautant.LearnAjaxSpringBootJSP.payroll;

class EmployeeNotFoundException extends RuntimeException {
	
	public EmployeeNotFoundException(Long id) {
		super("Cold not find employee " + id);
	}

}
