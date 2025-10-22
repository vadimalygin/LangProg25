class Gen<T> {
	//Declaring a general class type
	T ob;
	//Defining class constructor
	//assigning generalized object as a parameter
	Gen(T o){
		ob = o;
	}
	//Method that returns class object
	T getOb() {
		return ob;
	}
	//Method that returns the name of a class type 
	void showType() {
		System.out.println("Type of T: " + ob.getClass().getName());
	}
}

class TwoGen<T, V> {
	//Declaring a general class type
        T ob1;
	V ob2;
	//Defining class constructor
	//assigning generalized object as a parameter
        TwoGen(T o1, V o2){
		ob1 = o1;
		ob2 = o2;
	}
	T getOb1() {
		return ob1;
	}
	V getOb2() {
		return ob2;
	}
	//Method that returns the name of a class type
	void showTypes() {
		System.out.println("Type of T: " + ob1.getClass().getName());
		System.out.println("Type of V: " + ob2.getClass().getName());
	}
}

class pr001 {
	public static void main(String args[]) {
		//Creating a class pointer with object type Integer
		Gen<Integer> iob;
		//Assigning a new class instance of type Integer to our pointer 
		iob = new Gen<Integer>(88);
		//Showing object Type
		iob.showType();
		//Assigning object value to a variable
		int v = iob.getOb();
		System.out.println("Value: " + v + "\n");
		

		//Creating a class pointer with object type String
		//Assigning a new class instance of type String to our pointer 
		Gen<String> strob = new Gen<String>("String of generalized class");
		//Showing object Type
		strob.showType();
		//Assigning object value to a variable
		String str = strob.getOb();
		System.out.println("Value: " + str + "\n");

		////////////////////////////////////////////////////////////////////////////

		TwoGen<Integer, String> tgob = new TwoGen<Integer, String>(89, "twogen string");
		tgob.showTypes();
		v = tgob.getOb1();
		str = tgob.getOb2();

		System.out.println("Value 1: " + v);
		System.out.println("Value 2: " + str + "\n");
	}
}
