class Gen<T> {
	T ob;
	Gen(T o){
		ob = o;
	}

	T getOb() {
		return ob;
	}
	void showType() {
		System.out.println("Type of T: " + ob.getClass().getName());
	}
}

class pr001 {
	public static void main(String args[]) {
		Gen<Integer> iob;
		iob = new Gen<Integer>(88);
		iob.showType();
		int v = iob.getOb();
		System.out.println("Value: " + v);
	}
}
