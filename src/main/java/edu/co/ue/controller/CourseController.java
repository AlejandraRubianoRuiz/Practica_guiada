package edu.co.ue.controller;

import org.springframework.web.bind.annotation.RestController;

import edu.co.ue.model.Course;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
public class CourseController {
	
	Course course;
	
	@PostConstruct
	public void init() {
		course = new Course();
	}

	@GetMapping(value="course",produces=MediaType.APPLICATION_JSON_VALUE)
	public Course getCourse(){
		return new Course("Javascript",20.0,10.0,24);
	}
	
	@GetMapping(value="courses",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Course> getCourses(){
		return course.myListCourses();
	}
	@GetMapping(value="courses/{name}",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Course> sarchCourseByName(@PathVariable("name") String name){
		return course.searchCourses(name);
	}
	
	@PostMapping(value="create/course",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Course> postCourse(@RequestBody Course c){
		return course.createCourse(c);
	}
	
	@DeleteMapping(value="delete/course/{name}")
	public List<Course> deleteCourse(@PathVariable("name") String name){
		return course.deleteCourse(name);
	}
	
	@PutMapping(value = "update/course/{name}")
	public List<Course> updateCourse(@PathVariable("name") String name, @RequestBody Course updatedCourse) {
	    return course.updateCourse(name, updatedCourse);
	}
}
