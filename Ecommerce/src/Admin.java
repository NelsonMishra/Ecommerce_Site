
public class Admin extends User{
	
	@Override
	Boolean verifyUser() {
		return true;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
	private Product[] productsAccess;

	

	public Product[] getProductsAccess() {
		return productsAccess;
	}

	public void setProductsAccess(Product[] productsAccess) {
		this.productsAccess = productsAccess;
	}

	

}
