package com.example.demo.day.one;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ReadCSCFile {
	
	
	
	
	public List<LogInfo>  readFile(String fileName) throws IOException {
		
		
		
		
		
		
		List<LogInfo> list = new ArrayList<>();
		
		
		try (BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)))) {
			
			String line =null;
			
			while((line=reader.readLine())!=null) {
				
				
				String[] values = line.split(",");
						
				LogInfo obj = new LogInfo(LocalDate.parse(values[0]),LocalTime.parse(values[1]), Severity.valueOf(values[3]), values[4]);
				
				list.add(obj);

			}
		}
		
		
		return list;
		
	}

}
