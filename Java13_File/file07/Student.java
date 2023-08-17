package edu.java.file07;

import java.io.Serializable;

public class Student implements Serializable {
	 private int id;
	 private String name;
	 private Score score;
	 
	 public Student( ) {
		 
	 }
	 
	public Student(int id, String name, Score score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Score getScore() {
		return score;
	}


	public void setScore(Score score) {
		this.score = score;
	}


	@Override
	public String toString() {
		return "학생 정보: [학번: " + id + ", 이름: " + name + ", 각 과목의 점수: " + score + "]";
	
		// return String.format(%d, %d, %s);
	}

	
	
	 
	 
	 
	 
}
