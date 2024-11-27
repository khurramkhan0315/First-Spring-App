package com.firstapp.first_spring_app;

import com.firstapp.first_spring_app.model.Address;
import com.firstapp.first_spring_app.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(FirstSpringAppApplication.class, args);
		System.out.println("Hello Everyone this is our first spring boot project");

		// object of Employee
		// ===========================Tight Coupling Example ================================

//		Employee emp = new Employee();
//		emp.id=123;
//		emp.name = "khurram";
//		emp.age=21;
//		emp.designation="Developer";
//
//		Address address1 = new Address();
//		address1.doorNo =322;
//		address1.streetName="erer";
//		address1.city="tgv";
//		 emp.address=address1;
//
//		address1.doorNo =999;
//		address1.streetName="likj";
//		address1.city="qDwedf";
//
//		emp.address=address1;
//		System.out.println("Employe  details: "+emp);
//		System.out.println("Address details : "+ address1);


// ===========================Losing Coupling =========================================
//      Employee emp1 = new Employee();
//	  emp1.setId(123);
//	  emp1.setName("rrtsgf");
//	  emp1.setAge(21);
//	  emp1.setDesignation("kgt");
//	  Address address1 = new Address();
//
//	  address1.setCity("Amroha");
//	  address1.setStreetName("wtw");
//	  address1.setDoorNo(123);
//	  emp1.setAddress(address1);
//
//	  // there is no need to make an object
//		emp1.getAddress().setDoorNo(435);
//		emp1.getAddress().setStreetName("were");
//		emp1.getAddress().setCity("ewer");
//
//		System.out.println("Employee details : "+emp1);
//		System.out.println("Address details : "+address1);

	}

}
