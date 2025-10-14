package com.example.demo.module.three;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.example.demo.execeptions.ElementAleadyExistException;
import com.example.demo.execeptions.NotFoundException;
import com.example.demo.ifaces.EmployeeRepository;

public class EmployeeRepoImpl implements EmployeeRepository<Employee> {

	private List<Employee> empList;
	
	
	public EmployeeRepoImpl() {
		super();
		
		this.empList = new ArrayList<>();
	}

	@Override
	public boolean add(Employee employee) throws ElementAleadyExistException {
		return this.empList.add(employee);
	}

	@Override
	public Employee findById(int id) throws NotFoundException {

        Employee foundObject = null;

        boolean found = false;
        
        Iterator<Employee> itr = this.empList.iterator();
        
        
        while(!found && itr.hasNext()) {
        	
        	Employee emp = itr.next();
            if (emp.getEmployeeId() == id) {
                foundObject = emp;
                found =true;
            }
        
        }

        if (foundObject == null) {
        	throw new NotFoundException();
        }
        

		return foundObject;
	}

	@Override
	public boolean remove(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Collection<Employee> findAll() {
		return this.empList;
	}

	
	@Override
	public Collection<Employee> findByEmployeeName(String name) {

		return null;
	}

	@Override
	public Collection<Employee> sortedList(Comparator<Employee> comp) {
		
		Collections.sort(this.empList,comp);
		return this.empList;
	}

}
