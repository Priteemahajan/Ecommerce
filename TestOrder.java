package demo.product;

import java.util.Scanner;

public class TestOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Order o1 = new Order();
		System.out.println(o1.showDetail());
		
		System.out.println("Enter the order details:");
		String customerOrder=sc.next();
		int price=sc.nextInt();
		int DateOfDelivery=sc.nextInt();
		Order o2 = new Order(customerOrder,price,DateOfDelivery);
		System.out.println(o2.showDetail());

	}

}
