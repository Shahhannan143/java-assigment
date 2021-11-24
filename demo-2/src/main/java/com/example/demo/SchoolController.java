package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolController {
	@Autowired(required = true)
	private SchoolService schoolService;

	@GetMapping("/")
	public String welCome() {
		return "Wel Come to Java Rest Repository";
	}

	@PostMapping("/school")
	public String addSchool(@RequestBody School school) {
		// schoolService.addSchool(new School());
		schoolService.addSchool(school);
		return "Record Saved";
	}

	@GetMapping("/school")
	public List<School> listSchool() {
		return schoolService.listOfSchool();
	}

	@GetMapping("/school/{id}")
	public Optional<School> listSchool(@PathVariable Long id) {
		return schoolService.findSchool(id);
	}

	@PutMapping("/school")
	public String updateSchool(@RequestBody School school) {
		// schoolService.addSchool(new School());
		schoolService.updateSchool(school);
		return "Record update";
	}

	@DeleteMapping("/school")
	public String deleteSchool(@RequestBody School school) {
		// schoolService.addSchool(new School());
		schoolService.deleteSchool(school);
		return "Record Deleted";
	}
}
