import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class OfferingList extends ArrayList<Offering> {

    private OfferingIterator offeringIterator;

    private Trading trading;

    private Offering[] offering;

    // OfferingList intilizes the offering iterator
    public OfferingList() {
        this.offeringIterator = new OfferingIterator(this);
    }


    public void showMenu(Facade facade) {
        System.out.println("\n******* Visitor Pattern ******* is implemented here. \n");
        while (facade.theOfferingList.getIterator().hasNext()) {
            String[] split = facade.theOfferingList.getIterator().next().offering.split(":");
            if (!getUsersList(facade.userType).contains(split[0]))
                System.out.println("Offering - " + split[1] + " by user - " + split[0]);
        }
        facade.theOfferingList.getIterator().moveToHead();
    }


    // Gets list of user for a userType
    public ArrayList<String> getUsersList(int userType) {
        File file;
        switch (userType) {
            case 0 -> {
                file = new File("./src/BuyerInfo.txt");
            }
            case 1 -> {
                file = new File("./src/SellerInfo.txt");
            }
            default -> throw new IllegalArgumentException("Invalid User Type Selected");
        }
        ArrayList<String> users = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String temp;
            while ((temp = br.readLine()) != null) {
                String[] split = temp.split(":");
                users.add(split[0]);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException(e.toString());
        }
        return users;
    }


    public OfferingIterator getIterator() {
        return this.offeringIterator;
    }


    // addOfferings - loads all the offerings into memory
    public void addOfferings(String inputPath) throws IOException {
        File inputFile = new File(inputPath);
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        String productItem;
        while ((productItem = reader.readLine()) != null) {
            this.add(new Offering(productItem));
        }
    }

}
