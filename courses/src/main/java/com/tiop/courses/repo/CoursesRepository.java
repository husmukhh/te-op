package com.tiop.courses.repo;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tiop.courses.beans.Course;

@Repository
public interface CoursesRepository extends org.springframework.data.repository.Repository<Course,Long>{
	
	
	@Query(countQuery = "select count(course.name) from Course course where course.name like  %?1% and course.country = ?2" , value ="select cours from Course cours where cours.name like  %?1% and cours.country = ?2")
	public Page<Course> findByNameAndCountry(String name, String country ,Pageable pageable);
	
}
