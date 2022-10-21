public class MeatProductMenu implements ProductMenu {

    public void showMenu() {
        System.out.println("\n******* Iterator Pattern ******* is implemented here. \n");
        while(Facade.theProductList.getIterator().hasNext()){
            String[] split = Facade.theProductList.getIterator().next().name.split(":");
            if (split[0].equals("Meat"))
                System.out.println("Meat Product : " + split[1]);
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
