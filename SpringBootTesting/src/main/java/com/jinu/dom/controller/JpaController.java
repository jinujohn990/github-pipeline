package com.jinu.dom.controller;

import java.io.StringReader;
import java.sql.Timestamp;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jinu.dom.model.Employee;
import com.jinu.dom.repository.EmployeeRepository;

@Controller
public class JpaController {
	@Autowired
    private EmployeeRepository employeeRepository;
	@RequestMapping(value = "/insert")
	public void insertToEmployee() {
		try {
			String xmlString ="<note>\r\n" + 
					"<to>Tove</to>\r\n" + 
					"<from>Jani</from>\r\n" + 
					"<heading>Reminder</heading>\r\n" + 
					"<body>Don't forget me this weekend!</body>\r\n" + 
					"</note>";
			JAXBContext jaxbContext = JAXBContext.newInstance(Object.class);  
			   
	        //Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller(); 
	       // Object obj= (Object) jaxbUnmarshaller.unmarshal(str);  
	        
	        
	        jaxbContext = JAXBContext.newInstance(Object.class);                      
	        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	        Object obj = (Employee) jaxbUnmarshaller.unmarshal(new StringReader(xmlString));
	        
			Timestamp time = Timestamp.valueOf(java.time.LocalDateTime.now());
			java.time.LocalDateTime localttime =time.toLocalDateTime();
			Employee employee = new Employee();
			employee.setEmpName("Jinu");
			employee.setRollNo(123);
			employee=employeeRepository.save(employee);
			System.out.println("Employee id:"+employee.getEmpId());
			Employee employee2 = new Employee();
			employee2.setEmpName("Ram");
			employee2.setRollNo(124);
			employeeRepository.save(employee2);
				
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@RequestMapping(value = "/get")
	public void getfromEmployee() {
        try {
        	List<Employee> employee = employeeRepository.findByNameAndRollno("Jinu",123);
    		employee.toString();
        }catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
