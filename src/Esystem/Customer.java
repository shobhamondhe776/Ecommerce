package Esystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer extends User{
	private List<Product> cart;

	Customer(int userId, String userName, String password, String email)
	{
        super(userId, userName, password, email);
        this.cart = new ArrayList<>();
	}

	public void addToCart(Product product)
	{
		cart.add(product);
		System.out.println("Added to cart : " +product.getProductName());
	}

	public void removeFromCart(Product product)
	{
		cart.remove(product);
		System.out.println("Removed from cart : " +product.getProductName());
	}


	 public void checkout() {
	        if (cart.isEmpty()) {
	            System.out.println("Cart is empty.");
	        } else {
	            System.out.println("Checkout complete.");
	            cart.clear();
	        }
	    }

	@Override
	public void viewProfile() {

		    System.out.println("User ID : " + getUserId());
		    System.out.println("Username : " + getUserName());
		    System.out.println("Password : " +getPassword());
		    System.out.println("Email : " + getEmail());

	}

	@Override
	public void updateProfile() {

		Scanner scanner = new Scanner(System.in);

	    System.out.println("Enter new username : ");
	    String newUsername = scanner.nextLine();
	    setUserName(newUsername); // setUsername method exists to update username

	    System.out.println("Enter new password : ");
	    String newPassword = scanner.nextLine();  // setPassword method exists to update password
	    setPassword(newPassword);

	    System.out.println("Enter new email : ");
	    String newEmail = scanner.nextLine();
	    setEmail(newEmail); // setEmail method exists to update email

	    System.out.println("Profile updated successfully!");

	}

  class Admin extends User{
		private List<Product> productList;
		Admin(int userId, String userName, String password, String email)
		{
	         super(userId, userName, password, email);
	         productList = new ArrayList<>();
		}

		public void addProduct(Product product)
		{
			productList.add(product);
			System.out.println("Added product : " +product.getProductName());
		}

		public void removeProduct(Product product)
		{
			productList.remove(product);
			System.out.println("Removed product : " +product.getProductName());
		}

		    public void updateProduct(Product product) {
		        // Implementation to update product 
		        System.out.println(product.getProductName() + " updated product");
		    }

		@Override
		public void viewProfile() {

			    System.out.println("User ID : " + getUserId());
			    System.out.println("Username : " + getUserName());
			    System.out.println("Password : " +getPassword());
			    System.out.println("Email : " + getEmail());			    
		}

		@Override
		public void updateProfile() {

			Scanner scanner = new Scanner(System.in);

		    System.out.println("Enter new username : ");
		    String newUsername = scanner.nextLine();
		    setUserName(newUsername); // setUsername method exists to update username

		    System.out.println("Enter new password : ");
		    String newPassword = scanner.nextLine();  // setPassword method exists to update password
		    setPassword(newPassword);

		    System.out.println("Enter new email : ");
		    String newEmail = scanner.nextLine();
		    setEmail(newEmail); // setEmail method exists to update email

		    System.out.println("Profile updated successfully!");

		}
	}

}
 
