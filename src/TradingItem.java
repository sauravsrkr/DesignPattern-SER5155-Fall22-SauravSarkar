/**
 * This is a part of the Visitor Pattern.
 */
public class TradingItem {
    String name;
    String overdue;

    public TradingItem(String category, String itemName) {
        this.name = category;
        overdue = itemName;
    }

    /**
     * This method is the backbone of the visitor pattern.
     */
    public void accept(NodeVisitor visitor) {
        visitor.visitTrading(this);
    }

    public String toString() {
        return "TradingItem name: " + name;
    }
}
