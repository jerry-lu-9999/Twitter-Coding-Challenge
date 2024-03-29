public class Puzzle4 {
    
    // Matrix Mathematics

    // Calculate the final value by doing the following steps:
    // 1. Take Matrix A and subtract Matrix B.
    // 2. Transpose the resulting matrix.
    // 3. Sum the numbers from one corner to the diagonal opposite corner.
    //    Example: Sum matrix[0][0] to matrix[n][n]    

    // Matrix A
    static double[][] MATRIX_A = {{10.2, 9.4, 13.6, 15.2},
				                  {20.4, 48.3, 25.4, 5.6},
				                  {11.2, 16.4, 22.4, 14.8},
				                  {9.2, 54.2, 18.8, 20.4}};
    
    // Matrix B
    static double[][] MATRIX_B = {{9.2, 9.4, 12.6, 14.2},
				  {15.4, 32.2, 16.4, 2.6},
				  {11.2, 2.4, -5.4, 8.8},
				  {6.2, 14.2, 15.8, 20.4}};

    
    public static void main(String args[]) {
	System.out.printf("The value is %.2f\n", calcValue(MATRIX_A, MATRIX_B));
    }

    private static double calcValue(double[][] m1, double[][] m2) {
            
	return sumDiagonal(transpose(subtract(m1,m2)));
    }
    
    private static double[][] subtract(double[][] m1, double[][] m2) {
	   if(m1.length != m2.length){
        return null;
       } else{
          for(int i = 0; i < m1.length; i++){
             for(int j = 0; j < m1[i].length; j++){
                m1[i][j] = m1[i][j] + m2[i][j];
             }
          }
          return m1;
       }
	
    }

    private static double[][] transpose(double[][] m) {
	   for(int i = 0; i < m.length; i++){
          for(int j = i; j < m[i].length;j++){
                swap(m[i][j],m[j][i]);
          }
       }
	return m;
    }

    private static void swap(double a, double b){
        double temp = a;
        a = b;
        b = temp;

    }
    private static double sumDiagonal(double[][] m) {
	    double sum = 0.0;
        for(int i = 0; i < m.length;i++){
            sum += m[i][i];
        }
	return sum;
    }

}
