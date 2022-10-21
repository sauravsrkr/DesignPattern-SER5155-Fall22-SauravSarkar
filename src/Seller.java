public class Seller extends Person {

	// showMenu - shows the list for the buyer using iterator pattern
	@Override
	public void showMenu() {
		for(Product iterator: productList)
			if(!(iterator.productList.size() ==0))
				System.out.println( iterator.productList);
		System.out.println("********* Iterator Pattern ******** created menu for Seller");
	}

	// createProductMenu - creates product menu using factory pattern
	@Override
	public ProductMenu createProductMenu(int theLevel) {
		System.out.println("******* Factory Pattern ******* is implemented here. \n");
		if (theLevel == 0) {
			this.productMenu = new MeatProductMenu();
			System.out.println("Meat Product Menu Initialized\n");
		} else {
			this.productMenu = new ProduceProductMenu();
			System.out.println("Produce Product Menu Initialized\n");
		}
		return productMenu;
	}

}
