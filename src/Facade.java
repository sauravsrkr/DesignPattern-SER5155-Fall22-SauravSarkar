import java.io.IOException;
import java.util.Scanner;

public class Facade {
    public Facade() {
        System.out.println("\n\n******* Facade Pattern ******* is implemented here. \n");
        createProductList();
    }

    int userType;

    private Product theSelectedProduct;

    int nProductCategory;

    static ClassProductList theProductList = new ClassProductList();

    Person person;

    public void login() {
        Login cred = new Login();
        boolean loginSuccess = cred.login();
        if (loginSuccess) {
            this.userType = cred.userType;
            System.out.println("\n******* Bridge Pattern ******* is implemented here. \n");
            if (userType == 0) {
                person = new Buyer();
                System.out.println("Buyer login successfully\n");
            } else {
                System.out.println("Seller login successfully\n");
                person = new Seller();
            }
        } else {
            login();
        }
    }

    public void addTrading() {

    }

    public void viewTrading() {

    }

    public void decideBidding() {

    }

    public void discussBidding() {

    }

    public void submitBidding() {

    }

    public void remind() {

    }

    public void createUser(UserInfoItem userinfoitem) {

    }

    public void createProductList() {
        try {
            theProductList.addProduct("./src/ProductInfo.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void AttachProductToUser() {

    }

    public Product SelectProduct() {
        return null;
    }

    public void productOperation() {


    }

    public void productSelection() {
        System.out.println("Select type of Product ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("0 : Meat");
        System.out.println("1 : Produce");
        int typeOfProductSelected = scanner.nextInt();
        if (typeOfProductSelected > 1 || typeOfProductSelected < 0) {
            System.out.println("please enter a valid number");
            productSelection();
        }
        nProductCategory = typeOfProductSelected;
        if (typeOfProductSelected == 0 || typeOfProductSelected == 1) {
            person.createProductMenu(nProductCategory).showMenu();
        } else {
            productSelection();
        }
    }

}
