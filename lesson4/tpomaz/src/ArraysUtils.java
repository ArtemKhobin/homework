import java.util.Arrays; 

class ArraysUtils {
	public static boolean areEqual(int[][] arr1, int[][] arr2) {
		return Arrays.deepEquals(arr1, arr2);
	}
	
	public static int[] linearize(int[][] arr) {
		int[] resultArr = new int[getArrayLength(arr)];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				resultArr[index++] = arr[i][j];			
			}
		}
		return resultArr;
	}
	
	public static int[][] createSpiral(int n, int m) {
		int[][] arr = new int[n][m];
		int i = 0, coil = 0, value = 1;
 
		while (value - 1 < n * m) { 
			coil++;
			for (i = coil - 1; i < m - coil + 1; i++) {  // upper row
				arr[coil - 1][i] = value++;
			}    
			for (i = coil; i < n - coil + 1; i++) {    	 // right column
				arr[i][m - coil] = value++;
			}    
			for (i = m - coil - 1; i >= coil - 1; i--) { // bottom row
				arr[n - coil][i] = value++;
			}   
			for (i = n - coil - 1; i >= coil; i--) {   	 //  left column
				arr[i][coil - 1] = value++;
			}    
		}
		return arr;
	}
		
	public static int[][] transpose(int[][] arr) {
        int[][] resultArr = new int[arr[0].length][arr.length];
        
		for (int i = 0; i < resultArr.length; i++) {
            for (int j = 0; j < resultArr[i].length; j++) {
                resultArr[i][j] = arr[j][i];
            }
        }
        return resultArr;
    }
	
	public static void print(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	private static int getArrayLength(int[][] arr) {
		int size = 0;
		for (int i = 0; i < arr.length; i++) {
			size += arr[i].length;
		}
		return size;
	}
}