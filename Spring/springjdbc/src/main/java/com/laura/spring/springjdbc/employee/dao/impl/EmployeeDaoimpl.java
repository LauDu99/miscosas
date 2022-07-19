package com.laura.spring.springjdbc.employee.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.laura.spring.springjdbc.employee.dao.EmployeeDao;
import com.laura.spring.springjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.laura.spring.springjdbc.employee.dto.Employee;

//indica que crearas un objeto
@Component("employeeDao")
public class EmployeeDaoimpl implements EmployeeDao {

	//hacer la inyeccion automaticamente
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstname(), employee.getLastName());
		return result;
	}

	@Override
	public int update(Employee employee) {
		String sql = "update employee set firstname=?, lastName=? where id=?";
		int update = jdbcTemplate.update(sql, employee.getFirstname(), employee.getLastName(), employee.getId());
		return update;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from employee where id=?";
		int delete = jdbcTemplate.update(sql, id);
		return delete;
	}

	@Override
	public Employee read(int id) {
		String sql = "select * from employee where id=?";
		EmployeeRowMapper rm = new EmployeeRowMapper();
		Employee employee = jdbcTemplate.queryForObject(sql, rm, id);
		return employee;
	}

	@Override
	public List<Employee> read() {
		String sql = "select * from employee";
		EmployeeRowMapper rm = new EmployeeRowMapper();
		List<Employee> result = jdbcTemplate.query(sql, rm);
		return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}