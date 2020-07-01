package com.tiop.courses.resp;

import java.util.List;

import com.tiop.courses.beans.Course;

import lombok.Data;

@Data
public class CourseSearchResponse {
	private List<Course> courseList ;
	private int totalPages;
	private long totalRecords;
}
