class ShoppingCart {
    private List<String> items = new ArrayList<>();
    
    public void addItem(String item){
        items.add(item);
    }

    public int getDiscountPercentage() {
        if(items.contains("Book")){
            return 5;
        }
        return 0;
    }
    
    public List<String> getItems() {
        return new ArrayList<>(items);
    }

    public void removeItem(String item){
	items.remove(item);
    }
}
ShoppingCart cart = new ShoppingCart();
cart.addItem("Flash Drive");
cart.getDiscountPercentage()
cart.addItem("Book");
cart.getDiscountPercentage()
cart.getItems()
cart.addItem("Book")
cart.getDiscountPercentage()
cart.getItems()
cart.removeItem("Book")
cart.getItems()
cart.getDiscountPercentage()