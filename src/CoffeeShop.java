/**
 * @author Dawei
 * @create 2023-02-20-8:46 AM
 */
public class CoffeeShop {
    String name;
    MenuItem[] menu;
    String[] orders;

}
class MenuItem {
    private String item;
    private String type;
    private double price;

    public MenuItem(String item, String type, double price) {
        this.item = item;
        this.type = type;
        this.price = price;
    }

    public String getItem() { return item; }
    public String getType() { return type; }
    public double getPrice() { return price; }

    public static void addOrder(){
        orders.pop
    }
}