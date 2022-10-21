public class ProduceProductMenu implements ProductMenu {

    public void showMenu(Facade facade) {
        System.out.println("\n******* Iterator Pattern ******* is implemented here. \n");
        while (facade.theProductList.getIterator().hasNext()) {
            String[] split = facade.theProductList.getIterator().next().name.split(":");
            if (split[0].equals("Produce"))
                System.out.println("Produce Product : " + split[1]);
        }
        facade.theProductList.getIterator().moveToHead();
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
