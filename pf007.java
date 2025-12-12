//Example of lambda functions
//
//() -> 100; returning value = 100 when calling a lambda function without parameters
//
//(n) -> 1/n; returning value opposite to parameter "n" when calling a lambda function with one parameter "n"
//
//(m,n) -> m/n; returning a fraction from parameters "m" and "n" when calling a lambda function with two parameters "m" and "n"
//
class MyClass {
	static int myMethod() { // does the same as first lambda function, but bulkier in text
		return 100;
	}
}

// Example of an interface determining two  abstract methods
//
interface MyInterface {
	int MyMethod();
	String MyMethod2();
}

//realisation of an interface via class
//
class MyClass1 implements MyInterface {
	public int MyMethod() {
		return 100;
	}
	public String MyMethod2() {
		return "s";
	}
}
MyInterface var2 = new MyClass1();
//Alternative solution via using lambda functions and a functional interface (which can be determined only with one abstract method)
//
interface MyFuncInterface {
	int MyMethod();
}
//lambdafunc can be assigned to a functional interface variable
//
MyFuncInterface var1 = () -> 100;
System.out.println(var1.MyMethod()); //returns 100
System.out.println(var2.MyMethod()); //returns 100
				     //

//second lambda func
interface IFunc2 {double oneParameter(int n);}
IFunc2 var3 = (n) -> (double)1/n;
System.out.println(var3.oneParameter(100)); //returns 100

//third lambda func
interface IFunc3 {double twoParameter(int n, int m);}
IFunc3 var4 = (n, m) -> (double)n/m;
System.out.println(var4.twoParameter(2, 3)); //returns 100
