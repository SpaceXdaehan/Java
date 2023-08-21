package edu.java.lambda03;

public class Employee {
	private Integer empId; // 사번
	private String empName; // 이름
	private String dept;	// 부서이름
	private String emptitle; // 직급
	private Double salary; // 급여
	
	public Employee(Integer empId, String empName, String dept, String emptitle, Double salary) {
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
		this.emptitle = emptitle;
		this.salary = salary;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getEmptitle() {
		return emptitle;
	}

	public void setEmptitle(String emptitle) {
		this.emptitle = emptitle;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return String.format("Employee(Id=%d, Name=%s, dept=%s, title=%s, salary=%f", 
				this.empId, this.empName, this.dept, this.emptitle, this.salary);
	}
	
}
