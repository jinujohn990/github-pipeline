package com.jinu.dom.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.repository.cdi.Eager;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import com.jinu.dom.dto.UserPost;
@Eager
@FeignClient(url = "https://jsonplaceholder.typicode.com", name = "UserServiceMethod")
public interface UserClient {
    @GetMapping("/posts") 
	public List<UserPost> getUserPostlist();
}
