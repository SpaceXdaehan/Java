package edu.java.lambda03;

import java.util.Arrays;
import java.util.List;

public class LambdaMain03 {

	public static void main(String[] args) {
		// Employee 를 원소로 갖는 리스트를 선언, 초기화
		List<Employee> employees = Arrays.asList(
				new Employee(100, "이찬희", "개발1팀", "대리", 400.0),
				new Employee(101, "지대한", "개발2팀", "사원", 350.0),
				new Employee(200, "김다훈", "개발2팀", "과장", 380.0),
				new Employee(201, "유다한", "개발1팀", "부장", 500.0),
				new Employee(300, "강효남", "인사팀", "사원", 300.0),
				new Employee(301, "위태욱", "인사팀", "과장", 450.0)					
				);
		
		// 1. 모든 직원들의 정보를 한 줄에 한 명씩 출력하기
		System.out.println("----- Ex1. ");
//		for (Employee e : employees) {
//			System.out.println(e);
//		}
//		employees.forEach(x -> System.out.println(x));
		
		employees.forEach(System.out::println);
		
		// 2. 개발1,2팀에서 일하는 직원들의 급여의 합계를 출력하기.
		System.out.println("----- Ex2.");
		double result = employees.stream()
				.filter(x -> x.getDept().contains("개발"))
				.mapToDouble(x -> x.getSalary())
				.sum();
		System.out.println("개발팀 급여 합계 = " + result);
		
		double sum = 0;
		int count = 0;
		for (Employee e : employees) {
			sum += e.getSalary();
			count++;
		}
		System.out.println("개발팀 급여 합계 = " + sum);
		
		// 3. 개발 1,2팀에서 일하는 직원들의 급여의 평균을 출력하기.
		System.out.println("----- Ex3.");
		System.out.println("개발팀 급여 평균 = " + (sum / count));
		
		result = employees.stream()
				.filter(e -> e.getDept().contains("개발"))
				.mapToDouble(e -> e.getSalary())
				.average()
				.orElseThrow();
		System.out.println("개발팀 급여 평균 = " + result);
		
		// 4. 직급이 사원인 직원들의 급여의 합계를 출력하기.
		System.out.println("----- Ex4.");
		result = employees.stream()
				.filter(e -> e.getEmptitle().equals("사원"))
				.mapToDouble(e -> e.getSalary())
				.sum();
		System.out.println("사원 급여 합계 = " + result);
		
		// 5. 직급이 사원인 직원들의 급여의 평균을 출력하기.
		System.out.println("----- Ex5.");
        result = employees.stream()
                .filter(e -> e.getEmptitle().equals("사원"))
                .mapToDouble(e -> e.getSalary())
                .average()
                .orElseThrow();
        System.out.println("사원 급여 평균 = " + result);
	        
		// 6. 급여가 400 이상인 직원들의 정보를 한 줄에 한 명씩 출력하기.
		System.out.println("----- Ex6.");
		employees.stream()
		.filter(e -> e.getSalary() >= 400)
		.forEach(System.out::println);
		
		// 7. 개발 1팀 직원들의 급여를 10% 인상하고, 그 직원들의 급여 평균을 계산하고 출력하기.
		System.out.println("----- Ex7");
		result = employees.stream()
				.filter(e -> e.getDept().equals("개발1팀"))
				.mapToDouble(e -> e.getSalary() * 1.1)
				.average()
				.orElseThrow();
		System.out.println("개발1팀 인상 급여 평균 = " + result);
		
		// 8. 직원 리스트에서 "사원"은 몇 명인지 출력.
		System.out.println("----- Ex8.");
        long cnt = employees.stream()
                .filter(e -> e.getEmptitle().equals("사원"))
                .count();
        System.out.println("사원 직급 수 = " + cnt);
	}

}
