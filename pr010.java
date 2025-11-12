//multiple catch

class pr010 {
	public static void main(String args[]) {
		int a = 100, b = 0;
		int result;
		char[] chrs = {'a', 'b', 'c'};

		for (int i = 0; i < 2; i++) {
			try {
				if(i == 0) result = a/b;
				else chrs[6] = 'x';
			}
			catch (ArithmeticException | ArrayIndexOutOfBoundsException exc) {
				System.out.println("Caught exception: " + exc);
			}
		}

		System.out.println("Out of try/catch cycle code block");
	}
}
