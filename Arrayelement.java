package sample;

public class Arrayelement {
		public static int countElementsGreaterThan(int[] A) {
	        int n = A.length;
	        int count = 0;

	        for (int i = 0; i < n; i++) {
	            int num = A[i];
	            int greaterCount = 0;

	            for (int j = i + 1; j < n; j++) {
	                if (A[j] > num) {
	                    greaterCount++;
	                }
	            }

	        }

	        return count;
	    }
	    public static void main(String[] args) {
	        int[] A = {1, 2, 3, 4, 5};
	        
	        int result = countElementsGreaterThan(A);
	        System.out.println( "Number of elements with at least one greater element: " + result);
	    }
	
	}


