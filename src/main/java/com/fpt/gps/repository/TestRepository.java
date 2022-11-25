package com.fpt.gps.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fpt.gps.models.Test;

@Repository
public interface TestRepository extends CrudRepository<Test, Integer> {}
