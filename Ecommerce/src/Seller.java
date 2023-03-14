
public class Seller extends User {
	@Override
	Boolean verifyUser() {
		
		return true;
	}
	
	
	private Product[] productsListed;
	
	
	public Product[] getProductsListed() {
		return productsListed;
	}
	public void setProductsListed(Product[] productsListed) {
		this.productsListed = productsListed;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
	private Cart cart;

	public Cart getCart() {
		return cart;
	}
	
}
