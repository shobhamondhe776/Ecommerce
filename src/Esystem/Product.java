package Esystem;

class Product {
	private int productId;
	private String productName;
	private double price;
	private int quantity;
	private String category;

	Product(int productId, String productName, double price, int quantity, String category)
	{
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}

	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}

	public void getProductDetails()
	{
	      System.out.println("Product ID : " +productId);
	      System.out.println("Product name : " +productName);
	      System.out.println("Product price : " +price);
	      System.out.println("Product quantity : " +quantity);
	      System.out.println("Product category : " +category);

	}

	public void updateQuantity(int newQuantity)
    {
	     if(newQuantity >= 0)
	     {
	    	 quantity = newQuantity;
	    	 System.out.println("Updated new quantity : " +quantity);
	     }
	     else {
	     System.out.println("Quantity cannot be negative");
      }
    }

    public void updatePrice(double newPrice)
	{
		if(newPrice >= 0 )
		{
			price = newPrice;
			System.out.println("Updated new price : "+price);
		}
		else {
			System.out.println("Price cannot be negative");
		}
	}
}
 
