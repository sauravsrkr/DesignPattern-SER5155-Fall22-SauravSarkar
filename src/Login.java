import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login {
    public boolean login() {
        // Take user input
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter user type: \n [ 0 ----- Buyer ] \n [ 1 ----- Seller ]");
        int userType = s.nextInt();
        s.nextLine();
        File file = switch (userType) {
            case 0 -> new File("./src/BuyerInfo.txt");
            case 1 -> new File("./src/SellerInfo.txt");
            default -> throw new IllegalArgumentException("Invalid User Type Selected");
        };
        Map<String, String> users = new HashMap<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String temp;
            while ((temp = br.readLine()) != null) {
                String[] split = temp.split(":");
                users.put(split[0], split[1]);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException(e.toString());
        }
        System.out.println("Enter Username");
        String username = s.nextLine();
        System.out.println("Enter Password");
        String password = s.nextLine();
        return validateCredentials(users, username, password);
    }

    private boolean validateCredentials(Map<String, String> users, String username, String password) {
        if (users.containsKey(username) && users.get(username).equals(password)) {
            System.out.println("Login Successful");
            return true;
        } else {
            System.out.print("Login Failed");
            System.exit(1);
            return false;
        }

    }
}
