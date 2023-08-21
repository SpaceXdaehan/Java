package edu.java.inner03;

public class Button {
	// public static 내부 인터페이스는 
	// 내부 인터페이스는 반드시 static이어야함. 그래서 선언할 때 static은 생략 가능.
	public interface OnClickListener {
		void onClick();	// public abstract가 생략되어있음.
		
	}
	
	// field
	private String btnName;
	private OnClickListener listener;
	
	// constructor 
	public Button(String btnName) {
		this.btnName = btnName;
	}
	
	// method
	public void setOnClickListener(OnClickListener l) {
		this.listener = l;
	} 
	
	public void click() {
		System.out.println(btnName + "버튼:");
		listener.onClick();
	}
	
}
