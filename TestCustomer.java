package demo.product;

import java.util.Scanner;

public class TestCustomer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Customer c1 = new Customer();
		System.out.println(c1.showDetail());
		
		System.out.println("Enter customer details");
		String customer_name=sc.next();
		String address=sc.next();
		int pin_code=sc.nextInt();
		Customer c2 = new Customer(customer_name,address,pin_code);
		System.out.println(c2.showDetail());

	}

}
