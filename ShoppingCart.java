package demo.product;

public class ShoppingCart {
	private String product_name;
	private int product_price;
	private int quantity;
	
	public ShoppingCart()
	{
	
	}
	public ShoppingCart(String product_name,int product_price,int quantity)
	{
		this.product_name=product_name;
		this.product_price=product_price;
		this.quantity=quantity;
	}
	public String getDetails()
	{
		return "Product detail=\nProduct name: "+product_name+
				"\nProduct Price: "+product_price+"\nQuantity: "+quantity;
	}
	public double add(ShoppingCart otherItem)
	{
		return this.quantity=this.quantity+otherItem.quantity;
	}
	public double remove(ShoppingCart otherItem)
	{
		return this.quantity=this.quantity-otherItem.quantity;
	}
	
	

}
