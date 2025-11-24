class ShoppingCart {
    private List<String> items = new ArrayList<>();
    private boolean bookAdded = false;
    
    public void addItem(String item){
        items.add(item);
        if(item.equals("Book")){
            bookAdded = true;
        }
    }
    public int getDiscountPercentage() {
        if(bookAdded){
            return 5;
        }
        return 0;
    }
    
    public List<String> getItems() {
        return items;
    }
    
}