package edu.java.class04;

public class ClassMain04 {

    public static void main(String[] args) {
        // 기본 생성자를 사용해서 Product 타입의 객체를 생성.
        Product prod1 = new Product();
        System.out.println(prod1);
        System.out.println("prod1 아이디: " + prod1.productId);
        System.out.println("prod1 이름: " + prod1.productName);
        System.out.println("prod1 가격: " + prod1.productPrice);

        // argument 3개를 갖는 생성자를 호출해서 Product 타입의 객체를 생성
        Product prod2 = new Product(100, "츄파춥스", 1000);
        System.out.println(prod2);
        prod2.printProductInfo();
        
        // argument 2개를 갖는 생성자를 호출해서 Product 타입의 객체를 생성
        Product prod3 = new Product(200, "칙촉");
        System.out.println(prod3);
        prod3.printProductInfo();
        prod3.setProductPrice(1500);
        prod3.printProductInfo();
        
    }

}