//Generating exceptions again
class Rethrow {
	public static void genExc() {
		int number[] = {4,8,16,32,64,128,256,512};
		int den[] = {2,0,4,4,0,8};

		for(int i = 0; i<number.length; i++){
			try{
				System.out.println(number[i]/den[i]);
			}
			catch (ArithmeticException exc){
				System.out.println("Invalid arithmetic operation");
			}
			catch (ArrayIndexOutOfBoundsException exc){
				System.out.println("Out of boudns(within Rethrow class)");
				throw exc;
				//System.out.println("Aborting cycle...");
			}
		}
	}
}

class pr006 {
	public static void main(String args[]) {

		try {
			Rethrow.genExc();
		}
		catch (ArrayIndexOutOfBoundsException exc){
			//Repeated exception catch
			System.out.println("Out of boudns(within main)");
			System.out.println("Aborting cycle...");
		}
		System.out.println("Out of cycle");
	}
}
