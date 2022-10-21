import java.util.ArrayList;
import java.util.List;

public class Product {
	String name;
	List<Product> productList = new ArrayList<>();

	public Product(String input) {
		name = input;
	}
	private ClassProductList classProductList;

	private Trading trading;

	public void accept(NodeVisitor visitor) {
		visitor.visitProduct(this);
	}

	public String toString() {
		return name;
	}

	public Trading getTrading() {
		return trading;
	}
}
