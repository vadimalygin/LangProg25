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

}

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

	}
}
