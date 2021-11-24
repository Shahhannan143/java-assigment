package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Repository bean, my Complete Hibernate configuration
public interface SchoolRepository extends JpaRepository<School, Long> {

	List<School> findAll();

	void delete(School school);

	Optional<School> findById(Long schoolId);

	School save(School school);

}
