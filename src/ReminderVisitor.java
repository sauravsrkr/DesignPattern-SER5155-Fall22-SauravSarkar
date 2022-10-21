public class ReminderVisitor extends NodeVisitor {

    private Reminder m_Reminder;

    public ReminderVisitor(Reminder reminder) {
        this.m_Reminder = reminder;
    }

    private ClassProductList classProductList;

    public void visitProduct(Product product) {
        visitTrading(product.getTrading());
    }

    public void visitTrading(Trading trading) {

    }

    public void visitFacade(Facade facade) {
        for (Product product : facade.theProductList) {
            visitProduct(product);
        }
    }

}
