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
	}
}
