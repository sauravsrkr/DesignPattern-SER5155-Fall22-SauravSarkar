public abstract interface ProductMenu {

	Person person = null;

	public abstract void showMenu(Facade facade);

	public abstract void showAddButton();

	public abstract void showViewButton();

	public abstract void showRadioButton();

	public abstract void showLabels();

	public abstract void showComboxes();

}
