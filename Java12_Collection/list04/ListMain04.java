package edu.java.list04;

import java.util.ArrayList;
import java.util.List;

public class ListMain04 {

	public static void main(String[] args) {
		// User 타입을 저장하는 ArrayList 타입 변수 선언, 객체 생성.
		ArrayList<User> users = new ArrayList<>();

		// 3개의 User 객체를 ArrayList에 저장.

		User user1 = new User();
		users.add(user1);

		User user2 = new User("abc", "000");
		users.add(user2);

		users.add(new User("guest", "guest"));

		// ArrayList 내용을 출력.
		System.out.println(users);

		// 리스트 users에서 인덱스 0번 위치의 원소 삭제.
		users.remove(0);
		System.out.println(users);

		// id가 "guest"인 User 객체를 리스트에서 삭제.
		
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getId().equals("guest")) {
				users.remove(i);
				break;
			}
		}
		System.out.println(users);
	

	}

}
