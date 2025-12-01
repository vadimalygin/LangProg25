import java.util.List;
import java.util.ArrayList;
class TCalc {
    private List<String> names = new ArrayList<>();
    private int tPercentage = 0;

    public List<String> addPerson(List<String> names, String name) {
    	List<String> updated = new ArrayList<>(names);
	updated.add(name);
	return updated;
    }
/*
    public void addPerson(String name) {
	names.add(name);
	if(names.size() > 5) {
		tPercentage = 20;
		}
	else if (names.size() > 0) {
		tPercentage = 10;
	}
    }
    
    public int getDiscountPercentage(List<String> items) {
  	if(items.contains("Книга")) {
		return 5;
	}
	else{
		return 0;
    	}
    }
*/    
    public List<String> getNames() {
        return new ArrayList<>(names);
    }

    public int getTPercentage() {
    	return tPercentage;
    }

    public int getTPercentage(List<String> names) {
    	if(names.size() > 5) {
		return 20;
	}
	else if (names.size() > 0) {
		return 10;
	}

	return 0;
    }
}


class pf004_r {
	static public void main(String args[]){
		TCalc list1 = new TCalc();

		List<String> l1 = new ArrayList<>();
		l1 = list1.addPerson(l1, "David");
		System.out.println("Tip size for l1: " + list1.getTPercentage(l1));

		List<String> l2 = l1;
		l2 = list1.addPerson(l2, "Eugene");
		System.out.println("Tip size for l2: " + list1.getTPercentage(l2));
	}
}
















