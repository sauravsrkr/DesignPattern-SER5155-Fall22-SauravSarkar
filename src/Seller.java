public class Seller extends Person {
	@Override
	public void showMenu() {
		for(Product iterator: productList)
			if(!(iterator.productList.size() ==0))
				System.out.println( iterator.productList);
		System.out.println("********* Bridge Pattern ******** created menu for Seller");
	}

	@Override
	public ProductMenu createProductMenu(int theLevel) {
		System.out.println("******* Factory Pattern ******* is implemented here. \n");
		if (theLevel == 0) {
			productMenu = new MeatProductMenu();
		} else {
			productMenu = new ProduceProductMenu();
		}
		return productMenu;
	}


	public ProductMenu createProductMenu(Product search, int nProductCategory) {
		return null;
	}

}
