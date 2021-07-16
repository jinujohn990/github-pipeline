package com.jinu.dom.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jinu.dom.client.UserClient;
import com.jinu.dom.dto.UserPost;
import com.jinu.dom.service.TestSercvice;
@Lazy
@Controller
public class TestController {
	@Autowired
	private TestSercvice testSercvice;
	@Autowired
	UserClient userClient;
	
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
	@RequestMapping(value = "/userPost", method = RequestMethod.GET)
	public String getUserPost() {
		 List<UserPost> userpostlist = userClient.getUserPostlist();
		 return userpostlist.toString();
	}
}
