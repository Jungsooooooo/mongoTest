package com.example.connectmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.connectmongo.entity.TestEntity;

public interface TestRepository extends MongoRepository<TestEntity, String>{

}
