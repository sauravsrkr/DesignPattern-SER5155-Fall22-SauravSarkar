public abstract class Person {

	ProductMenu productMenu;

	ClassProductList productList = new ClassProductList();

	public abstract void showMenu();

	public void showAddButton() {

	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public abstract ProductMenu createProductMenu(int productCategory);

}
