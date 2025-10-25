package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "teacher_2026")
@Inheritance(strategy = InheritanceType.JOINED)
public class Teacher {
	
	@Id
	@Column(name = "teacher_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int teacherId;

	@Column(name = "teacher_name")
	private String teacherName;

	
	//constructors setters and getters
	public Teacher() {
			
		super();
			
	}
		public Teacher(int teacherId, String teacherName) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
	}
		public Teacher(String teacherName) {
			this.teacherName = teacherName;
		}
		public int getTeacherId() {
		return teacherId;
	}
		public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
		public String getTeacherName() {
		return teacherName;
	}
		public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
}
