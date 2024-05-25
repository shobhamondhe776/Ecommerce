package Esystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ecomsyetem {

	public static void main(String[] args) {

		  // create products
		Product product = new Product(1, "abc", 4.4, 2, "xyz");
		Product product2 = new Product(2,"Mobile", 00000000000, 1, "Electronic");
		product.getProductDetails();
		product.updateQuantity(8);
		product.updatePrice(34);

		  //create customer
        Customer customer = new Customer(1, "abc", "abc@123", "abc@gmail.com");
        customer.login();
      //  customer.logout();

        // customer add products to cart
        customer.addToCart(product);
        customer.addToCart(product2);

        customer.removeFromCart(product);   //customer remove products from cart

        customer.viewProfile();  //customer view profile

        customer.updateProfile();   //customer update profile

        customer.checkout();    // Customer checks out

       // create admin 
        Admin admin = new Admin(1, "admin", "admin@123", "admin@gmail.com");
       System.out.println("Admin is working : ");
       admin.addProduct(product);    // Admin add  the product

       admin.removeProduct(product2);  // Admin removes the product

       admin.updateProduct(product);   // Admin updates a product

       admin.viewProfile();   // Admin views profile


       // Create an order
       List<Product> orderedProducts = new ArrayList<>();

       orderedProducts.add(product);

       Order order = new Order(1, customer.getUserId(), new Date(), "Processing", orderedProducts);

       order.placeOrder();     // Place the order 

       order.trackOrder();    // Track the order

       order.cancelOrder();  // Cancel the order

	}

}
 

