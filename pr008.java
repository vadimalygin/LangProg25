class UseFinally {
	public static void genExc(int what) {
		int t;
		int[] nums = new int[2];
		System.out.println("Got: " + what);

		try{
			switch (what) {
				case 0:
					t = 10/what; //arithmetic exc
					break;
				case 1:
					nums[4] = 10;//out of bounds exc
					break;
				case 2:
					return;
			}
		}
		catch (ArithmeticException exc) {
			System.out.println("Invalid arithmetic operation");
			return;
		}
		catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("Out of bounds");
		}
		finally {
			System.out.println("Exiting try/catch block...");
		}
	}
}

class pr008 {
	public static void main(String args[]) {
		for (int i = 0; i < 3; i++) {
			UseFinally.genExc(i);
		}
	}
}
