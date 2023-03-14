
public class Catalogue {
	
 private Product [] listOfAllProducts;

public Product [] getListOfAllProducts() {
	
	Product product1 = new Product();
	product1.setProductId("1");
	product1.setProductName("Shorts");
	product1.setCost("250");
	
	
	Product product2 = new Product();
	product2.setProductId("2");
	product2.setProductName("T-shirt");
	product2.setCost("200");
	
	Product product3 = new Product();
	product3.setProductId("3");
	product3.setProductName("Shirt");
	product3.setCost("1200");
	
	Product product4 = new Product();
	product4.setProductId("4");
	product4.setProductName("Trouser");
	product4.setCost("500");
	
	listOfAllProducts= new Product[4];
	
	//return the list of product.....
	listOfAllProducts[0]=product1;
	listOfAllProducts[1]=product2;
	listOfAllProducts[2]=product3;
	listOfAllProducts[3]=product4;
	
	
	return listOfAllProducts;
}

public void setListOfAllProduct(Product [] listOfAllProduct) {
	this.listOfAllProducts = listOfAllProduct;
}
}
