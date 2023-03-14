import java.util.Scanner;

public class Store {

	public static void main(String[] args) {
		System.out.println("---------------------------------------------------------------");
		System.out.println("************Welcome to Ecommerce site!!****************");
		System.out.println("---------------------------------------------------------------");
		System.out.println("Who You Are ? 1. Customer 2. Seller 3. Admin 4. exit");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		String typeOfUser;
		if (choice == 1) {
			typeOfUser = "Customer";
			Customer current = new Customer();
			System.out.println("Enter your User ID :");
			sc.nextLine();
			// taking the input from the user as customer...
			current.setUserId(sc.nextLine());
			System.out.println("Enter your Password:");
			sc.nextLine();
			current.setPassword(sc.nextLine());

			if (current.verifyUser() == true) {
				System.out.println("User verified ");
				// creating the loop for try again...
				while (true) {
					System.out.println("Do you want to 1. view product 2. view cart 3. contact Us 4.Exit");
					choice = sc.nextInt();
					if (choice == 1) {
						Catalogue catalogue = new Catalogue();
						Product[] allProducts = catalogue.getListOfAllProducts();
						for (int i = 0; i < allProducts.length; i++) {
							System.out.println(allProducts[i].getProductId() + " " + allProducts[i].getProductName()
									+ " " + allProducts[i].getCost());
						}
						System.out.println("Do You Want to add any product to the cart? Y/N  ");
						sc.nextLine();
						String addToCart = sc.nextLine();

						if (addToCart.equals("Y")) {
							System.out.println(" input the Product id of the product which you want to add to cart ");
							String productId = sc.nextLine();

							Product[] cartProducts = new Product[1];

							for (int i = 0; i < allProducts.length; i++) {
								if (allProducts[i].getProductId().equals(productId))
									cartProducts[0] = allProducts[i];
							}

							Cart cart = new Cart();
							cart.setCartId("1");
							cart.setListOfProject(cartProducts);
							current.setCart(cart);
							System.out.println("Successfully Added to cart");
						}
					} else if (choice == 2) {
						Product[] cartProducts = current.getCart().getListOfProject();
						System.out.println(current.getCart().getCartId());

						for (int i = 0; i < cartProducts.length; i++) {

							System.out.println(cartProducts[i].getProductId() + " " + cartProducts[i].getProductName()
									+ " " + cartProducts[i].getCost());
						}
						System.out.println("Do you Want to checkOut..?  Y/N");
						sc.nextLine();
						String checkOut = sc.nextLine();
						if (checkOut.equals("Y"))
							if (current.getCart().checkOut())
								System.out.println("Order Is Placed...!");
						System.out.println("Want to see your Order...?Y/N");
						sc.nextLine();
						String giveOrder = sc.nextLine();
						Order order = new Order();
						order.setOrderId("1");
						order.setUser(current);
						if (giveOrder.equals("Y"))
							System.out.println("your order id is " + order.getOrderId());

					} else if (choice == 3) {
						System.out.println(
								"Any query, Contact Us on +91123456789 or just mail on ecommercesite@gmail.com");
					} else if (choice == 4) {
						break;
					} else
						System.out.println("Invalid choice ,please enter again");
				}
			}
		} else if (choice == 2)
			typeOfUser = "Seller";
		Seller current = new Seller();
		System.out.println("Enter your Seller ID :");
		sc.nextLine();
		// taking the input from the user as Seller...
		current.setUserId(sc.nextLine());
		System.out.println("Enter your Password:");
		sc.nextLine();
		current.setPassword(sc.nextLine());

		if (current.verifyUser() == true) {
			System.out.println("Seller verified ");
		}
		System.out.println("Do you want to 1. view your product 2. view cart 3. contact Us 4.Exit");
		choice = sc.nextInt();

		if(choice==1)
			Product
			
//		Product[] allProducts = catalogue.getListOfAllProducts();
//		for (int i = 0; i < allProducts.length; i++) {
//			System.out.println(allProducts[i].getProductId() + " " + allProducts[i].getProductName()
//					+ " " + allProducts[i].getCost());
//		}
			
		
		
		
		
		
		else if (choice == 3)
			typeOfUser = "Admin";
		
		
		
		
		
		
		else
			System.out.println("Invalide input. Try Again");

	}
}

