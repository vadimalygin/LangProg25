//Example of generalized interface
interface Containment<T> {
	//Checking containments of a class for a certain element
	boolean contains(T o); 
}

class NumFuncs<T extends Number> {
	T num;

	NumFuncs(T n){
		num = n;
	}

	double inverse() {
		return 1/num.doubleValue();
	}

	int whole() {
		return num.intValue();
	}

	double frac() {
		return num.doubleValue() - num.intValue();
	}

	//Using of argument templates
	boolean absEqual (NumFuncs<?> ob){
		if (Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
		       return true;
		return false;	
	}
	

}

//Checking for class compatability via "V extends T" 
class A <T, V extends T> {
	T first;
	V second;

	A (T f, V s){
		first = f;
		second = s;
	}
}

//
class B {}
class BA {}
class B_A extends B {}
class B_B extends B {}

class Gen1<T> {
	T ob;

	Gen1 (T o){
		ob = o;
	}
}

class GenMeth {
	static <T extends Comparable<T>, V extends T> boolean arraysEqual (T[] x, V[] y) {
		if (x.length != y.length) 
			return false;

		for(int i = 0; i < x.length; i++)
			if (! x[i].equals(y[i]))
				return false;

		return true;
	}
}

class Summation {
	private int sum;

//Generalized constructor
	<T extends Number> Summation (T arg) {
		sum = 0;

		for (int i = 0; i <= arg.intValue(); i++) {
			sum += i;
		}
	}

	int getSum(){
		return sum;
	}
}

class Test{
	static void test(Gen1<? extends B> o){}
	static void test2(Gen1<? super B_A> o){}
}
//

//Generalized interface realization
class ClassGenInt<T> implements Containment<T> {
	//Class which implements a generalized interface must be also generalized
	T[] arrayRef;

	ClassGenInt(T[] o) {
		arrayRef = o;
	}

	//Realization contains() method
	public boolean contains(T o) {
		for (T x : arrayRef){
			if (x.equals(o)){
				return true;
			}
		}
		return false;
	}
}
//also u can do smthng like thix
//class ClassGenInt implements Containment<Integer>{...}
//or
//class ClassGenInt<T extends Number> implements Containment<T>{...}

class pr002 {
	public static void main(String args[]) {
		NumFuncs<Integer> iob = new NumFuncs<Integer>(5);

		System.out.println("Inverse of iob: " + iob.inverse());
		System.out.println("Whole part of iob: " + iob.whole());
		System.out.println("Fractional part of iob: " + iob.frac() + "\n");

		NumFuncs<Double> dob = new NumFuncs<Double>(10.14);

		System.out.println("Inverse of dob: " + dob.inverse());
		System.out.println("Whole part of dob: " + dob.whole());
		System.out.println("Fractional part of dob: " + dob.frac() + "\n");

///////////////////////////////////////////////////////////////////////////////////

		A <Integer, Integer> a = new A <Integer, Integer>(1,2); //compiles
	//	A <Integer, Byte> a1 = new A <Integer, Byte>(1,2); //does not compiles 
		A <Number, Integer> a2 = new A <Number, Integer>(1.1,2); //compiles
	//	A <Integer, String> a3 = new A <Integer, String>(1,"2"); //does not compiles
//////////////////////////////////////////////////////////////////////////////////
		
		NumFuncs<Integer> intob = new NumFuncs<Integer>(6);
		NumFuncs<Double> doubleob = new NumFuncs<Double>(-6.0);
		NumFuncs<Long> longob = new NumFuncs<Long>(5L);

		System.out.println("Comparing 'int' to 'double'");
		if (intob.absEqual(doubleob)){
			System.out.println("Absolute values are identical\n");
		}
		else {	
			System.out.println("Absolute values are different\n");
		}

		System.out.println("Comparing 'int' to 'long'");
		if (intob.absEqual(longob)){
			System.out.println("Absolute values are identical\n");
		}
		else {	
			System.out.println("Absolute values are different\n");
		}

		System.out.println("Comparing 'double' to 'long'");
		if (doubleob.absEqual(longob)){
			System.out.println("Absolute values are identical\n");
		}
		else {	
			System.out.println("Absolute values are different\n");
		}

///////////////////////////////////////////////////////////////////////////////////
		//showcase of limited templates
		B b = new B();		
		B_A b_a = new B_A();
		B_B b_b = new B_B();		
		BA ba = new BA();

		Gen1<B> gb = new Gen1<B>(b);		
		Gen1<B_A> gb_a = new Gen1<B_A>(b_a);		
		Gen1<B_B> gb_b = new Gen1<B_B>(b_b);		
		Gen1<BA> gba = new Gen1<BA>(ba);
		//everything compiles

		Test.test(gb);//compiles		
		Test.test(gb_a);//compiles	
		Test.test(gb_b);//compiles	
//		Test.test(gba);//does not compile
		
///////////////////////////////////////////////////////////////////////////////////
		Integer nums1[] = {1, 2, 3, 4, 5};
		Integer nums2[] = {1, 2, 3, 4, 5};
		Integer nums3[] = {1, 2, 7, 4, 5};
		Integer nums4[] = {1, 2, 3, 4, 5, 6};

		System.out.println("\nCalling a generalized method for array comparison");
		if (GenMeth.arraysEqual(nums1,nums1))
			System.out.println("Array nums1 is identical to itself");
		else
			System.out.println("Array nums1 is not identical to itself");

		if (GenMeth.arraysEqual(nums1,nums2))
			System.out.println("Array nums1 is identical to nums2");
		else
			System.out.println("Array nums1 is not identical to nums2");

		if (GenMeth.arraysEqual(nums1,nums3))
			System.out.println("Array nums1 is identical to nums3");
		else
			System.out.println("Array nums1 is not identical to nums3");
		
		if (GenMeth.arraysEqual(nums1,nums4))
			System.out.println("Array nums1 is identical to nums4");
		else
			System.out.println("Array nums1 is not identical to nums4");

		String st1[] = {"str1", "str2"};
		String st2[] = {"str1", "str2"};
		String st3[] = {"str1", "str_2"};

		if (GenMeth.arraysEqual(st1,st1))
			System.out.println("Array st1 is identical to st2");
		else
			System.out.println("Array st1 is not identical to st2");

		if (GenMeth.arraysEqual(st1,st3))
			System.out.println("Array st1 is identical to st3");
		else
			System.out.println("Array st1 is not identical to st3");
		
		Double nums5[] = {1.0, 2.0, 7.0, 4.0, 5.0};
		Double nums6[] = {1.1, 2.1, 7.1, 4.1, 5.1};

		System.out.println("\nCalling a generalized method for array comparison");
		if (GenMeth.arraysEqual(nums5,nums6))
			System.out.println("Array nums5 is identical to nums6");
		else
			System.out.println("Array nums5 is not identical to nums6");
/////////////////////////////////////////////////////////////////////////////////////////////////
//
		//Using "Summation" class with generalized constructor
		//
		Summation sob = new Summation(4.2);
		System.out.println("\nInteger sum of numbers from 0 to 4.2 is: " + sob.getSum());


		Summation sob2 = new Summation(4);
		System.out.println("Integer sum of numbers from 0 to 4 is: " + sob2.getSum());
	
//////////////////////////////////////////////////////////////////////////////////////////////////
//
		//Generalized interface
		Integer x[] = {1, 2, 3};
		Double y[] = {1.0, 2.0 ,3.0};

		ClassGenInt<Integer> cgiob = new ClassGenInt<Integer>(x);

		if(cgiob.contains(2)){
			System.out.println("\n2 is in cgiob");
		}
		else {
			System.out.println("\n2 is not in cgiob");
		}

		if(cgiob.contains(4)){
			System.out.println("\n4 is in cgiob");
		}
		else {
			System.out.println("\n4 is not in cgiob");
		}

		ClassGenInt<Double> cgiob2 = new ClassGenInt<Double>(y);

		if(cgiob2.contains(2.0)){
			System.out.println("\n2.0 is in cgiob2");
		}
		else {
			System.out.println("\n2.0 is not in cgiob2");
		}
		
		if(cgiob2.contains(4.0)){
			System.out.println("\n4.0 is in cgiob2");
		}
		else {
			System.out.println("\n4.0 is not in cgiob2");
		}
	}
}
