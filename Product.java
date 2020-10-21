package demo.product;

public class Product {
	private String product_name;
	private int product_price;
	private String color;
	
	public Product()
	{
		
	}
	public Product(String product_name,int product_price,String color)
	{
		this.product_name=product_name;
		this.product_price=product_price;
		this.color=color;
	}
	public String showDetail()
	{
		return "Product detail=\nProduct name: "+product_name+
				"\nProduct Price: "+product_price+"\nColor: "+color;
	}


}
