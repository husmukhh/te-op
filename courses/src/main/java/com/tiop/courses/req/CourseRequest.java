package com.tiop.courses.req;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class CourseRequest extends Request{
	private int pageSize;
	private int pageNo;
	private String searchText;
	private String country;
}
