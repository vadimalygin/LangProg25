class ExcTest {
	//Generating an exception
	static void genException(){
		int nums[] = new int[4];
		System.out.println("Before exception");
		nums[8] = 10;
		System.out.println("After exception");
	}
	static void genException2(){
		int nums[] = {4, 8, 16, 32, 64, 128, 256};
		int denominator[] = {2, 4, 4, 4, 4};
		for (int i = 0; i<nums.length; i++){
			
			System.out.println("Before division");
			System.out.println(nums[i] + "/" + denominator[i] + "="+ nums[i]/denominator[i]);
			System.out.println("After division");
		}
	}	
}

class pr003 {
	public static void main (String args[]) {
		int nums[] = new int[4];

		try{
			/*
			System.out.println("Before exception");
			nums[8] = 10;
			System.out.println("After exception");
			*/
			ExcTest.genException2();
			ExcTest.genException();
		}
		//exc - variable containing a link to Exception class object
		//ArrayIndex... - is that class for "exc" variable
		catch(ArrayIndexOutOfBoundsException exc) {
			System.out.println("Exception: array index out of bounds");
		}
		catch(ArithmeticException exc){	
			System.out.println("Exception: invalid arithetic operation");
		}
		System.out.println("After exception catch");
		
	}
}
