package edu.co.ue.model;

import java.util.ArrayList;

public class Course {
	private String name;
	private double duration;
	private double cost;
	private int ability;
	private ArrayList<Course> courses;
	
	public Course(String name, double duration, double cost, int ability) {
		super();
		this.name = name;
		this.duration = duration;
		this.cost = cost;
		this.ability = ability;
	}
	public Course() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getAbility() {
		return ability;
	}
	public void setAbility(int ability) {
		this.ability = ability;
	}
	//Método que crea una lista de cursos
	public ArrayList<Course> myListCourses(){
		ArrayList<Course> courses= new ArrayList<Course>();
		courses.add(new Course("PHP",20.0,10.0,24));
		courses.add(new Course("Java",50.0,20.0,24));
		courses.add(new Course("C#",35.0,16.0,24));
		return courses;
	}
	//Método que busca una lista de cursos que concidan con el nombre porporcionado
	public ArrayList<Course> searchCourses(String name){
		ArrayList<Course> course_aux= new ArrayList<>();
		ArrayList<Course> course_return= new ArrayList<>();
		course_aux=this.myListCourses();
		System.out.println(" Curso: "+name);
		for(Course course:course_aux) {
			if(course.getName().contains(name)) {
				course_return.add(course);
			}
		}
		return course_return;
	}
	
	//Metodo para crear un nuevo curso
	public ArrayList<Course> createCourse(Course course){
		ArrayList<Course> courses = new ArrayList<>();
		courses=this.myListCourses();
		courses.add(course);
		this.courses=courses;
		return this.courses;
	}
	//Metodo que elimina un curso según el nombre
	public ArrayList<Course> deleteCourse(String name){
		ArrayList<Course> courses = new ArrayList<>();
		courses=this.myListCourses();
		courses.removeIf(c->c.getName().equals(name));
		this.courses=courses;
		return this.courses;	
	}
	//Metodo que actualiza un curso
	public ArrayList<Course> updateCourse(String name, Course c) {
	    ArrayList<Course> courses = this.myListCourses();
	    
	    for (int i = 0; i < courses.size(); i++) {
	        if (courses.get(i).getName().equals(name)) {
	            Course currentCourse = courses.get(i);
	            currentCourse.setName(c.getName());
	            currentCourse.setDuration(c.getDuration());
	            currentCourse.setCost(c.getCost());
	            currentCourse.setAbility(c.getAbility());
	            break;
	        }
	    }
	    this.courses = courses;
	    return this.courses;
	}
	
	
}