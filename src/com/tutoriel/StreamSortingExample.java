package com.tutoriel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class StreamSortingExample {

	public static void main(String[] args) {
		// sort by ascending alpha
		
		List<String> fruits =new ArrayList<String>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Strawbery");
		fruits.add("Mango");
		fruits.add("Coco");
		
		   List<String> sortedList=fruits.stream().sorted().collect(Collectors.toList());
		   sortedList.forEach(System.out::println);
		   
		   
			// sort by descending alpha
		   List<String> unSortedList=fruits.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		   
		   System.out.println("*************************************");
		   unSortedList.forEach(System.out::println);
		
		   
		   
		  //sorting employeee by salary in ascending order
		   
		      List <Employee> employees=new ArrayList<Employee>();
		      employees.add(new Employee(1,"faiza",36,2000));
		      employees.add(new Employee(2,"yamina",34,2400));
		      employees.add(new Employee(3,"carlos",26,1900));
		      employees.add(new Employee(4,"tania",36,2600));
		   
		      List <Employee> employeesSortedList=employees.stream().sorted(new Comparator<Employee>() {

				@Override
				public int compare(Employee o1, Employee o2) {
					
					return (int) (o1.getSalary()- o2.getSalary());
				}
		    	  
		      }).collect(Collectors.toList());
		      System.out.println(employeesSortedList);
		      
		      
		      //sorted by descending salary
		      List <Employee> employeesSortedDescList=employees.stream().sorted(new Comparator<Employee>() {

					@Override
					public int compare(Employee o1, Employee o2) {
						
						return (int) (o2.getSalary()- o1.getSalary());
					}
			    	  
			      }).collect(Collectors.toList());
			      System.out.println(employeesSortedDescList);
			      
			      
			      List <Employee> employeesSortedList3=employees.stream().
			    		  sorted(Comparator.comparingLong(Employee::getSalary)).collect(Collectors.toList());
			      System.out.println("compact methode"+employeesSortedList3);
	}
}


class Employee{
	private int id;
	private String name;
	private int age;
	private long Salary;
	
	
	//constructor
	public Employee(int id, String name, int age, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		Salary = salary;
	}


	
	
	//getter & setter
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public long getSalary() {
		return Salary;
	}


	public void setSalary(long salary) {
		Salary = salary;
	}



   //toString() methode
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", Salary=" + Salary + "]";
	}
	
	
	
	
	

}
