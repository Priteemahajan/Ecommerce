package demo.product;

public class Order {
	private String customerOrder;
	private int price;
	private int DateOfDelivery;
	
	public Order()
	{
		
	}
	public Order(String customerOrder,int price,int DateOfDelivery)
	{
		this.customerOrder=customerOrder;
		this.price=price;
		this.DateOfDelivery=DateOfDelivery;
	}
	public String showDetail()
	{
		return "Order detail=\nOrdered Product name: "+customerOrder+
				"\nOrdered Product Price: "+price+"\nDate of delivery: "
				+DateOfDelivery;
	}

}
