package com.example.connectmongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.connectmongo.entity.TestEntity;
import com.example.connectmongo.repository.TestRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/mongo")

public class MongoController {
	
	@Autowired
	private TestRepository testRepository;
	
	@PostMapping("/create")
	public TestEntity save(@RequestBody TestEntity testEntity) {
		return testRepository.save(testEntity);
	}
}
