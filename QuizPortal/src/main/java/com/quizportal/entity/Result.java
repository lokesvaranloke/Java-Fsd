package com.quizportal.entity;

public class Result implements Comparable<Result>{

	private String email;
	private Integer marks;

	public Result() {}
	
	public Result(String email, Integer marks) {
		super();
		this.email = email;
		this.marks = marks;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Result [email=" + email + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Result result) {
		int comparemarks= result.getMarks();
		return comparemarks-this.marks;
	}
	
	
}
