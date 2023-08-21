package edu.java.inner03;

import edu.java.inner03.Button.OnClickListener;

public class InnerMain03 {
	
	public static void main(String[] args) {
		// 1. 버튼 객체 생성
		Button btnOpen = new Button("파일 열기 버튼");
		// 2. 버튼을 클릭했을 때 할 일을 구현한다.
		OnClickListener l = new OpenButtonListener(); // 인터페이스 구현 클래스 객체를 생성
		// 3. 버튼에 버튼 클릭 기능을 연결한다.
		btnOpen.setOnClickListener(l);
		// 4. 버튼 클릭
		btnOpen.click();
		
		// 1. Button 타입 객체 생성.
		Button btnSave = new Button("저장");  

		// 2. 메서드 안 쪽에서 클래스를 생성하는 것 - 지역 (내부) 클래스(locala class) 선언
		class SaveButtonListener implements OnClickListener {
			@Override
			public void onClick() {
				System.out.println("파일 저장...");
			}
		}
		
		// 3. OnclickListener 타입 객체 생성
		OnClickListener listener2 = new SaveButtonListener();
		
		// 4. OnClickListener를 버튼의 기능으로 설정.
		btnSave.setOnClickListener(listener2);
		
		// 5. btnSave의 click 메서드 사용 -> btnSave가 가지고 있는 listener의 onClick()호출
		btnSave.click();
	
		// 지역 클래스: 선언된 메서드 안에서만 사용 가능(객체 생성).
		// -> 이름이 없는 클래스: 클래스를 정의하면서 동시에 객체 생성까지 하는 클래스.
		Button btnExit = new Button("종료");
		
		// 
		OnClickListener listener3 = new OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("프로그램 종료... ");
			}
		};
		btnExit.setOnClickListener(listener3);
		btnExit.click();
		
		
		Button btnHelp = new Button("도움말");
		btnHelp.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("도움말 보기...");
			}
		});
		btnHelp.click();
		
		
		
		
		Button btnEdit = new Button("편집");
		// 람다 표현식: 추상 메서드가 오직 1개인 인터페이스 구현 클래스를 간단히 표현하는 방법.
		btnEdit.setOnClickListener(() -> {System.out.println("파일 편집...");});
		btnEdit.click();
		
		
		
		
		

	}
}
