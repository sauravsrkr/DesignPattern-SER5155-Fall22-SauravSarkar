import java.io.IOException;
import java.util.Scanner;

public class Facade {

    // Constructor for Facade
    public Facade() {
        System.out.println("\n\n******* Facade Pattern ******* is implemented here. \n");
        createProductList();
        createOfferingList();
    }

    int userType;

    private Product theSelectedProduct;

    int nProductCategory;

    // Initilize ClassProductList
    ClassProductList theProductList = new ClassProductList();

    // Initilize OfferingProductList
    OfferingList theOfferingList = new OfferingList();

    Person person;

    // Login validates user using bridge pattern
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

    // Initializes the product list after login
    public void createProductList() {
        try {
            theProductList.addProduct("./src/ProductInfo.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Initializes the offering list after login
    public void createOfferingList() {
        try {
            theOfferingList.addOfferings("./src/UserProduct.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void AttachProductToUser() {

    }

    public Product SelectProduct() {
        return null;
    }

    // productOperation - Allows console UI for further processing of PTBS system
    public void productOperation() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (userType == 0) {
                System.out.println("\nSelect 1) Show Menu 2) View Buyer Offers 3) Log Out");
            } else {
                System.out.println("\nSelect 1) Show Menu 2) View Seller Offerings 3) Log Out");
            }
            int selectedOption = scanner.nextInt();
            switch (selectedOption) {
                case 1 -> showMenu();
                case 2 -> viewOffering();
                case 3 -> System.exit(1);
            }
        }
    }

    public void showMenu() {
        System.out.println("Select type of Product ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("0 : Meat");
        System.out.println("1 : Produce");
        int typeOfProductSelected = scanner.nextInt();
        if (typeOfProductSelected > 1 || typeOfProductSelected < 0) {
            System.out.println("please enter a valid number");
            productOperation();
        }
        nProductCategory = typeOfProductSelected;
        if (typeOfProductSelected == 0 || typeOfProductSelected == 1) {
            person.createProductMenu(nProductCategory).showMenu(this);
        } else {
            productOperation();
        }
    }

    // Visitor Pattern implemented inside Offering.
    public void viewOffering() {
        theOfferingList.showMenu(this);
    }
}
