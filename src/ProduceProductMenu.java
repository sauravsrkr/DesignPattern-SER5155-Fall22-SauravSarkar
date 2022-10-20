public class ProduceProductMenu implements ProductMenu {

    public void showMenu() {
        for (Product p : Facade.theProductList) {
            String[] split = p.name.split(":");
            if (split[0].equals("Produce"))
                System.out.println("Produce Product : " + split[1]);
        }
    }

    public void showAddButton() {

    }

    public void showViewButton() {

    }

    public void showRadioButton() {

    }

    public void showLabels() {

    }

    public void showComboxes() {

    }

}
