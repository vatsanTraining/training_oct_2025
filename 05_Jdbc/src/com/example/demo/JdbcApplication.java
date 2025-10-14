package com.example.demo;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.ifaces.CrudReposiotry;
import com.example.demo.implementations.CustomerRepoImpl;
import com.example.demo.utils.ConnectionUtils;
import com.example.demo.utils.Status;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.*;
public class JdbcApplication {
	
	
	public static void usingJoins(Connection con) throws SQLException {
		
		
		String sql ="select p.patient_id,p.patient_name,d.doctor_id,d.doctor_name,d.depaartment from patient_2025 as p  RIGHT OUTER JOIN doctor_2025 d on  d.doctor_id=p.doctor_ref";
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			
			ResultSet rs = pstmt.executeQuery();
			
			Map<Integer,Doctor> doctorMap = new HashMap<>();
			
			while(rs.next()) {
				
				int doctorId = rs.getInt("doctor_id");
				
				Doctor doctor = doctorMap.get(doctorId);
				
				if(doctor == null) {
					
					doctor = new Doctor();
					doctor.setDoctorId(doctorId);
					doctor.setDoctorName(rs.getString("doctor_name"));
					doctor.setDepartment(rs.getString("depaartment"));
					
					doctorMap.put(doctorId, doctor);
				}
				
				int patientId = rs.getInt("patient_id");
				
				if(patientId != 0) {
					
					Patient patient = new Patient();
					patient.setPatientId(patientId);
					patient.setPatientName(rs.getString("patient_name"));
					
					doctor.getPatientList().add(patient);
				}
				
				
			}
			
			Collection<Doctor> doctors = doctorMap.values();
			
			for(Doctor eachDoctor : doctors) {
				
				System.out.println("Dr."+eachDoctor.getDoctorName());
				
				for(Patient eachPatient : eachDoctor.getPatientList()) {
					
					System.out.println(eachPatient);
				}
			}	
		}
	}
	

	public static void main(String[] args) {

		
		try(Connection con = ConnectionUtils.getMySqlConnection()){
			
			
			
			usingJoins(con);
			
			//System.out.println(con);
			
			
			CrudReposiotry<Customer> repo = new CustomerRepoImpl(con);
			
//			 System.out.println("Is Added :=>"+repo.add(new Customer(101,"Ramesh",LocalDate.of(2024, 12,14),56000,Status.BILLED))
//			); 
//			
			 
			 
//			Collection<Customer> custList = repo.findAll();
//			
//			 for(Customer eachCustomer : custList) {
//				 
//				 System.out.println(eachCustomer);
//			 }
//			
			
			//System.out.println(repo.findById(2020));
			 
			
//			
//			((CustomerRepoImpl)repo).addAll(new Customer(202,"Sakshi",LocalDate.of(2024, 12,11),52000,Status.BILLED),
//					new Customer(23,"Megna",LocalDate.of(2025, 11,24),66000,Status.BILLED));
			
		}catch (Exception e) {
 
			e.printStackTrace();
		}
		
		
	}

}
