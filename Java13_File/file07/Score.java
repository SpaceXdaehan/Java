package edu.java.file07;

import java.io.Serializable;

public class Score implements Serializable {
	private int java;
	private int web;
	private int python;
	
	// 생성자 getter, setter, toString, 파일에 write가 가능한 클래스여야만함
	public Score() {
		
	}

	public Score(int java, int web, int python) {
		this.java = java;
		this.web = web;
		this.python = python;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getWeb() {
		return web;
	}

	public void setWeb(int web) {
		this.web = web;
	}

	public int getPython() {
		return python;
	}

	public void setPython(int python) {
		this.python = python;
	}

	@Override
	public String toString() {
		return "Score = [java: " + java + ", web: " + web + ", python: " + python + "]";
		
		//String.format(null, null)
	}
	
	
	
}
