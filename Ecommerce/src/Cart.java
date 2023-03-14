
public class Cart {
	
	
		
	
	
	private String cartId;

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	private Product[] listOfProject;

	public Product[] getListOfProject() {
		return listOfProject;
	}

	public void setListOfProject(Product[] listOfProject) {
		this.listOfProject = listOfProject;
	}
//checkout method 
	public boolean checkOut() {
		
		return true;
	}
	

}
