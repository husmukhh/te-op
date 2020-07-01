package com.tiop.courses.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tiop.courses.beans.Course;
import com.tiop.courses.repo.CoursesRepository;
import com.tiop.courses.req.CourseRequest;
import com.tiop.courses.resp.CourseSearchResponse;

@RestController

public class CoursesController {

	@Autowired 
	CoursesRepository courseRepo;
	Logger logger = LoggerFactory.getLogger(CoursesController.class);
	
	@PostMapping("/courses")
	
	public CourseSearchResponse getAllCourse(@RequestBody CourseRequest courseRequest) {
		CourseSearchResponse courseSearchResponse = new CourseSearchResponse();
		courseSearchResponse.setCourseList(new ArrayList<>(courseRequest.getPageSize()));
		logger.info("Page no: {} ",courseRequest.getPageNo());
 		Pageable pageable = PageRequest.of(courseRequest.getPageNo(),courseRequest.getPageSize(), Sort.by("name").descending());
        Page<Course> page = courseRepo.findByNameAndCountry(courseRequest.getSearchText(), courseRequest.getCountry(),pageable);
        courseSearchResponse.getCourseList().addAll(page.getContent());
        courseSearchResponse.setTotalPages(page.getTotalPages());
        courseSearchResponse.setTotalRecords(page.getTotalElements());
        pageable = page.nextPageable();
        
	    return courseSearchResponse;  
	
	}
}
