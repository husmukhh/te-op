package com.tiop.courses.repo;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tiop.courses.beans.Course;

@Repository
public interface CoursesRepository extends org.springframework.data.repository.Repository<Course,Long>{
	
	
	@Query("SELECT cours FROM Course cours WHERE cours.name like  %?1% and cours.country = ?2")
	public Page<Course> findByNameAndCountry(String name, String country ,Pageable pageable);
	
}
