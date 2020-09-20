package com.jinu.dom.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jinu.dom.service.TestSercvice;

@Controller
public class TestController {
	@Autowired
	private TestSercvice testSercvice;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(HttpServletRequest request) {
		System.out.println("In home method...");
		testSercvice.printer();
		System.out.println("After test service.....");
		return "welcome";
	}
	@RequestMapping(value = "/testfordevtools", method = RequestMethod.GET)
	public String devtools(HttpServletRequest request) {
		System.out.println("In devtools method...");
		System.out.println("After devetools service.....");
		return "devtools";
	}
	@RequestMapping(value = "/springbootdevtools", method = RequestMethod.GET)
	public String devtools() {
		System.out.println("In springbootdevtools method...");
		System.out.println("After springbootdevtools service.....");
		return "something";
	}
}
