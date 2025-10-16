package com.example.demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.example.demo.annotations.Invoker;
import com.example.demo.annotations.Table;

public class Application {

	public static void main(String[] args) {

		
		
		Book java = new Book();
		
		
		Class<?> mycls = java.getClass();
		
		
		 Table annoRef =  mycls.getAnnotation(Table.class);
		   		   
		   
		   String sql = "select * from "+annoRef.name();
		   
		   
		   System.out.println(sql);
		   
		   
		
			 
			 Method method;
			try {
				method = mycls.getMethod("find",String.class);
				 Invoker ref =method.getAnnotation(Invoker.class);
				 
				 String arg =ref.value();

				 System.out.println(method.invoke(java,arg));
				 
				 
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			 
			 

	}

	
	
}
