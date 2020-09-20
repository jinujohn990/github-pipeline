package com.jinu.dom.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class TestSercvice {
	@Async("asyncExecutor")
	public void printer() {
    	try {
    	    Thread.sleep(1000);
    	} catch (InterruptedException ie) {
    	    Thread.currentThread().interrupt();
    	}
    	for(int i=1;i<10;i++) {
    		System.out.println(i);
    	}
		
	}
}
