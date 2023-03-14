public class Customer extends User {

	private Cart cart;

	public Cart getCart() {
		return cart;
	}	
		@Override
		Boolean verifyUser() {

			return true;
		}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
	