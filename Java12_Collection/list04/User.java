package edu.java.list04;

public class User {
	// fields:
	
	private String id;
	private String password;
	
	// 생성자: (1) 기본 생성자,
	
	public User() {
		
	}
	
	// (2) 아규먼트 2개를 갖는 생성자
	
	public User(String id, String password) {
		this.id = id;
		this.password = password;
	}

	// (3) getter & setter
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// toString() override
	
	@Override
	public String toString() {
		return "User(id=" + this.id
				+ ", password=" + this.password
				+")";
	}

	

	
}
