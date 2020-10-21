package demo.product;

import java.util.Scanner;

public class TestProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Product p1 = new Product();
		System.out.println(p1.showDetail());
		
		System.out.println("Enter the other product details:");
		String product_name=sc.next();
		int product_price=sc.nextInt();
		String color=sc.next();
		Product p2 = new Product(product_name,product_price,color);
		System.out.println(p2.showDetail());

	}

}
