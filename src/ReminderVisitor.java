import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReminderVisitor extends NodeVisitor {

    private Reminder m_Reminder;

    private ClassProductList classProductList;

    public void visitProduct(Product product) {
    }

    public void visitTrading(String username) {
        System.out.println("\n******* Visitor Pattern ******* is implemented here. \n");
        File file = new File("./src/UserProduct.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                String[] split = line.split(":");
                if (split[0].equals(username)) {
                    System.out.println(split[1]);
                }
            }
        } catch (Exception ignored) {}
    }


    public void visitFacade(Facade facade) {
        for (Product product : facade.theProductList) {
            visitProduct(product);
        }
    }

}
