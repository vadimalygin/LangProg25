//Using throws instruction
class ThrowsDemo {
	public static char prompt(String str) throws java.io.IOException {
		System.out.print(str + ": ");
		return (char) System.in.read();
	}
}

class pr009 {
	public static void main(String args[]) {
		char ch;
		try {
			ch = ThrowsDemo.prompt("Enter a symbol");
		}
		catch(java.io.IOException exc) {
			System.out.println("Got exception whilst reading in");
			ch = (char) 0;
		}
		System.out.println("The entered character: " + ch);
	}
}
