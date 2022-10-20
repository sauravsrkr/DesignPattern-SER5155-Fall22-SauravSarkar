public class Buyer extends Person {

	@Override
	public void showMenu() {
		for(Product iterator: productList)
			if(!(iterator.productList.size() ==0))
				System.out.println( iterator.productList);
		System.out.println("********* Bridge Pattern ******** created menu for Buyer");
	}

	@Override
	public ProductMenu createProductMenu(int theLevel) {
		System.out.println("******* Factory Pattern ******* is implemented here. \n");
		if (theLevel == 0) {
			this.productMenu = new MeatProductMenu();
		} else {
			this.productMenu = new ProduceProductMenu();
		}
		return this.productMenu;
	}

}
