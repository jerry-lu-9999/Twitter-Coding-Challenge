class Puzzle5 {
	//This is a set of values for x
	static int [] INPUT_VALUES = {45, 67, 99, 78, 47, 56, 89, 77, 76, 75};
	//This is a set of values for y
	static int [] OUTPUT_VALUES = {74, 77, 89, 75, 87, 67, 77, 88, 76, 45};

	static int EPOCH = 1559645100;
	
	//This is the model of the application. This give an output.
	//This should help calculate y'
	private static int model(int value) {
		return EPOCH >> value;
	}

	private static double sumDifferences(double [] differences){
		// IMPLEMENT METHOD
	}

	// Loss Function should be ∑((y-y') ^ 2)
	private static double lossFunction(int [] inputValues, int [] outputValues){
	 	// IMPLEMENT METHOD
	}

	public static void main(String [] args){
		System.out.println("The Loss of this input space is " + lossFunction(INPUT_VALUES, OUTPUT_VALUES));
	}
}