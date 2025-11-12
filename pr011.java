class NonIntResultException extends Exception {
	int n;
	int d;
	NonIntResultException (int i, int j){
		n = i;
		d = j;
	}
	public String toString(){
		return "Result: " + n + "/" + d + " is not an Integer";
	}
}

class pr011 {
	public static void main(String args[]){
		int[] nums = {4,8,15,32,64,127,256,512};
		int[] dens = {2,0,4,4,0,8};

		for (int i = 0; i < nums.length; i++){
			try{
				if ((nums[i]%dens[i]) != 0)
					throw new NonIntResultException(nums[i], dens[i]);
				System.out.println(nums[i] + "/" + dens[i] + "=" + nums[i]/dens[i]);
			}
			catch (ArithmeticException exc){
				System.out.println("Invalid arithmetic operation");
			}
		
			catch (ArrayIndexOutOfBoundsException exc){
				System.out.println("Out of bounds");
			}
	
			catch (NonIntResultException exc){
				System.out.println(exc);
			}
		}
	}
}
