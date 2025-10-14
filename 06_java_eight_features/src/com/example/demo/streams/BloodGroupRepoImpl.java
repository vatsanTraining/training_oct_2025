package com.example.demo.streams;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class BloodGroupRepoImpl {

	
	
	public List<BloodDonor> findAll(){
		
		
	   List<BloodDonor> donorList = new ArrayList<>();
	   
	   donorList.add(new BloodDonor(101, "Vengsarkar", 54, LocalDate.of(2024, Month.FEBRUARY, 14),BloodGroup.APOS , 989879945L));
	   
	   donorList.add(new BloodDonor(102, "Kambli", 74, LocalDate.of(2023, Month.MARCH, 14),BloodGroup.BPOS , 789879945L));

	   donorList.add(new BloodDonor(103, "Tendulkar", 34, LocalDate.of(2022, Month.DECEMBER, 14),BloodGroup.APOS , 689879945L));

	   
	   donorList.add(new BloodDonor(104, "Hazare", 24, LocalDate.of(2023, Month.JANUARY, 14),BloodGroup.BPOS , 589879945L));

	   donorList.add(new BloodDonor(105, "Agarwal", 54, LocalDate.of(2024, Month.DECEMBER, 14),BloodGroup.ANEG , 489879945L));

	   donorList.add(new BloodDonor(105, "Agarwal", 54, LocalDate.of(2024, Month.DECEMBER, 14),BloodGroup.ANEG , 489879945L));

	   return donorList;
	}

	
}
