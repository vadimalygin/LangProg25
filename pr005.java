class pr005 {
	public static void main(String args[]){
		try { //Generating an exception "by hand"
		      System.out.println("Before throw operator");
		      throw new ArithmeticException();
		}
		catch (ArithmeticException exc){
			System.out.println("arithmetic exception catched");
		}
		System.out.println("After catch");
	}
}
