package com;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EmployeeDAO {
	



	
	public static List<Employee> l = new ArrayList<>();
	
	public Employee addEmployee(Employee emp) {
		l.add(emp);
		return emp;
	}
	
/*	public List<Employee> getAllEmployees(){
		return template.query("select * from Emp", new RowMapper<Employee>() {
			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException{
				
				Employee emp = new Employee();
				emp.setEid(rs.getInt(1));
				emp.setEname(rs.getString(2));
				emp.setEband(rs.getString(3));
				
				return emp;
				
			}
			
		});
	}
*/	
	public Employee addEmployee(int eid) {
		for(Employee emp:l) {
			if(emp.getEid()==eid) {
				return emp;
			}
		}
		return null;
	}
	/* ---------------------*/
	
	
	
	

	
	
}
