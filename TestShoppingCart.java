package demo.product;

import java.util.Scanner;

public class TestShoppingCart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ShoppingCart s1 = new ShoppingCart();
		System.out.println(s1.getDetails());
		
		System.out.println("Enter the product:");
		String product_name=sc.next();
		int product_price=sc.nextInt();
		int quantity=sc.nextInt();
		ShoppingCart s2 = new ShoppingCart(product_name,product_price,quantity);
		System.out.println(s2.getDetails());
		
	    product_name=sc.next();
	    product_price=sc.nextInt();
	    quantity=sc.nextInt();
		ShoppingCart s3 = new ShoppingCart(product_name,product_price,quantity);
		System.out.println(s3.getDetails());
		System.out.println(s3.add(s2));
		
	    product_name=sc.next();
		product_price=sc.nextInt();
        quantity=sc.nextInt();
		ShoppingCart s4 = new ShoppingCart(product_name,product_price,quantity);
		System.out.println(s4.getDetails());
		System.out.println(s3.remove(s4));
		System.out.println();
		

	}

}
