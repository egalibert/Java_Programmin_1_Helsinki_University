public class Product {
	private Double price;
	private int quantity;
	private String name;

	public Product(String initialName, double initialPrice, int initialQuantity) {
		name = initialName;
		price = initialPrice;
		quantity = initialQuantity;
	}
	public void printProduct() {
		System.out.println(this.name + this.price + this.quantity);
	}
}
