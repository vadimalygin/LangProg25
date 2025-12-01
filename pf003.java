import java.util.List;
import java.util.ArrayList;
class ShoppingCart {
    private List<String> items = new ArrayList<>();
    
    void addItem(String item) {
        items.add(item);
    }
    
    public int getDiscountPercentage(List<String> items) {
    	if(items.contains("Book")) {
		return 5;
	}
	else
		return 0;
    }
    
    public List<String> getItems() {
        return new ArrayList<>(items);
    }

    public void removeItem(String item) {
    	items.remove(item);
    }
}

class pf003 {
	public static void main(String args[]) {

		ShoppingCart cart = new ShoppingCart();
		cart.addItem("Flash drive");
		cart.addItem("Disk");
		cart.addItem("Smartphone");
		cart.getItems();
		cart.getItems().remove("Smartphone");
		cart.getDiscountPercentage(cart.getItems());
		ShoppingCart cart2 = new ShoppingCart();
		cart2.addItem("Book");
		cart2.getDiscountPercentage(cart2.getItems());
	}
}

