import java.util.Arrays;

class ArraysCopier {
	
	int[] array;
	
	ArraysCopier(int[] array) {
		this.array = array;
	}
	
	public int[] copyOf(int newLength) {
		if (newLength < 0) return null;
		
		int[] newArray = new int[newLength];		
		for (int i = 0; i < newLength; i++) {
			if (i == array.length) break;
			newArray[i] = array[i];
		}
		
		return newArray;
	}
	
	public int[] copyOfRange(int from, int to) {
		if (checkParametersCopyOfRange(from, to)) return null; 
		
		int[] newArray = new int[to - from];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = array[from++];
		}
		
		return newArray;
	}
	
	public boolean checkParametersCopyOfRange(int from, int to) {
		return  from < 0 || to > array.length || to < from;
	}
	
	public int[] fill(int value) {
		int[] newArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			newArray[i] = value;
		}
		return newArray;
	}
	
	public static void main(String[] args) {
		int[] array = {5, 3, 10, 1, 2, 8, 7};
					
		ArraysCopier arraysCopier = new ArraysCopier(array);
		
		System.out.println("copyOf(int newLength) {}");	
		System.out.println(Arrays.toString(arraysCopier.copyOf(10)));
		System.out.println(Arrays.toString(arraysCopier.copyOf(7)));
		System.out.println(Arrays.toString(arraysCopier.copyOf(4)));
		System.out.println(Arrays.toString(arraysCopier.copyOf(0)));
		System.out.println(Arrays.toString(arraysCopier.copyOf(-3)));
		
		System.out.println("");	
		System.out.println("copyOfRange(int from, int to) {}");	
		System.out.println(Arrays.toString(arraysCopier.copyOfRange(2, 5)));
		System.out.println(Arrays.toString(arraysCopier.copyOfRange(3, 7)));
		System.out.println(Arrays.toString(arraysCopier.copyOfRange(0, 3)));
		System.out.println(Arrays.toString(arraysCopier.copyOfRange(8, 10)));
		
		System.out.println("");	
		System.out.println("fill(int value) {}");			
		System.out.println(Arrays.toString(arraysCopier.fill(15)));
		System.out.println(Arrays.toString(arraysCopier.fill(-4)));
		System.out.println(Arrays.toString(arraysCopier.fill(2)));
		System.out.println(Arrays.toString(arraysCopier.fill(6)));
	}
}