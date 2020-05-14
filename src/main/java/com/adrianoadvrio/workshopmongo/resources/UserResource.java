package com.adrianoadvrio.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adrianoadvrio.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		User maria = new User("1001", "Maria Brown","maria@gmail.com");
		User alex = new User("1002", "Alex Green","Alex@gmail.com");
		
		List<User> list = new ArrayList<>(); // ArrayList .. implementacao da interface List
		list.addAll(Arrays.asList(maria, alex));
		return ResponseEntity.ok().body(list);
	}

}