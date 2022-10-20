import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ClassProductList extends ArrayList<Product> {

    private ProductIterator productIterator;

    private ReminderVisitor reminderVisitor;

    private Product[] product;

    public void accept(NodeVisitor visitor) {

    }

    public void addProduct(String inputPath) throws IOException {
        File inputFile = new File(inputPath);
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        String productItem;
        while ((productItem = reader.readLine()) != null) {
            this.add(new Product(productItem));
        }
//        System.out.println("The list of products - " + this);
    }

}
