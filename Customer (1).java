package demo.product;

public class Customer {
	private String customer_name;
	private String address;
	private int pin_code;
	
	public Customer()
	{
		
	}
	public Customer(String customer_name,String address,int pin_code)
	{
		this.customer_name=customer_name;
		this.address=address;
		this.pin_code=pin_code;
	}
	
	public String showDetail()
	{
		return "Customer detail=\nCustomer name: "+customer_name+
				"\nAddress: "+address+"\nPin Code: "+pin_code;
	}

}
