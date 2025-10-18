package com.example.demo.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.Doctor;
import com.example.demo.ifaces.MyDao;

@Repository
public class DoctorDaoImpl implements MyDao<Doctor> {

	
	private JdbcTemplate template;

	// Constructor DI will occur here
	public DoctorDaoImpl(JdbcTemplate template) {
		super();
		this.template = template;
	}
	
	
	@Override
	public List<Doctor> findAll(){
		
		List<Doctor> doctorList =null;
		
		String sql = "select * from doctor_2025";
		
		doctorList = template.query(sql,rowMapper());
		
		
		
		return doctorList;
		
	}


	@Override
	public boolean save(Doctor doctor) {
		
		String sql ="insert into doctor_2025 values(?,?,?)";
		
		return this.template.update(sql,doctor.doctorId(),doctor.doctorName(),doctor.department())==0?true:false;
		
		
	}
	
	@Override
	public Doctor findById(int id) {
		
		return this.template.queryForObject("select * from doctor_2025 where doctor_id=?",rowMapper(),id);
	}
	
	
	
	private RowMapper<Doctor> rowMapper(){
		
		return (rs,rowNum)->
		
		 new Doctor(rs.getInt("doctor_id"), rs.getString("doctor_name"), rs.getString("depaartment"));

	}
	
	
}