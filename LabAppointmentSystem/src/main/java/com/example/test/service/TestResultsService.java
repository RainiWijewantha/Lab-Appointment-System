package com.example.test.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.model.TestResultsModel;
import com.example.test.repository.TestResultsRepository;

@Service
public class TestResultsService {
	
	@Autowired
	private TestResultsRepository testResultsRepository;

	public List<TestResultsModel> getAllTestResults() {
		return testResultsRepository.findAll();
	}

	public TestResultsModel getTestResultById(Long id) {
        Optional<TestResultsModel> resultOptional = testResultsRepository.findById(id);
        return resultOptional.orElse(null);
    }

}
