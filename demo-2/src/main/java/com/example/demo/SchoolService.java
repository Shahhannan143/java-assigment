package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // creating bean with annotation
public class SchoolService {
	@Autowired
	private SchoolRepository repository; // injection using constructor

	public School addSchool(School school) {
		return repository.save(school);
	}

	public Optional<School> findSchool(Long schoolId) {
		return repository.findById(schoolId);
	}

	public List<School> listOfSchool() {
		return repository.findAll();
	}

	public void deleteSchool(School school) {
		repository.delete(school);
	}

	public void updateSchool(School school) {
	   repository.save(school);
	}

}
