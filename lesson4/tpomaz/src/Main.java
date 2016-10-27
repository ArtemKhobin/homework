import java.util.Arrays; 

class Main {
	public static void main(String ...args) {
		
		System.out.println("Part 1.");
		System.out.println("Pascal's triangle.");
		
		PascalsTriangle triangle = new PascalsTriangle(10);
		
		triangle.print();
		System.out.println("Replacing the even numbers of triangle on the character \'..\'.");
		triangle.print("EVEN");
		System.out.println("Replacing the odd numbers of triangle on the character \'..\'.");
		triangle.print("odd");
		
	
	
		System.out.println("");
		System.out.println("Two-dimensional arrays.");
		
		ArraysUtils arrUtils = new ArraysUtils();
				
		int[][] arr1 = {{2, 3, 4, 5}, {5, 8, 9, 1}};	
		int[][] arr2 = {{2, 3, 4, 5}, {5, 8, 9, 1}};
		
		if (arrUtils.areEqual(arr1, arr2)) {
			System.out.println("Arrays are equal.");
		} else {
			System.out.println("Arrays aren't equal.");
		}
		
				
		System.out.println("");	
		int[][] arr3 = {{2, 8, 1, 5}, {5, 8, 1}, {2, 6, 1}, {5}};
		int[] arr4 = arrUtils.linearize(arr3);
		System.out.println(Arrays.toString(arr4));
		
		
		System.out.println("");	
		arrUtils.print(arrUtils.createSpiral(6, 5));
		
		
		System.out.println("");	
		int[][] arr5 = {{1, 2},{3, 4},{5, 6}};
		arrUtils.print(arr5);
		System.out.println("");	
		arrUtils.print(arrUtils.transpose(arr5));
		
		
		System.out.println("");
		System.out.println("Part 2.");
		System.out.println("Ñlasses \"Book\" and \"Author\".");  
		
		Author author1 = new Author();
		author1.setName("Kathy Sierra");
		author1.setEmail("ksierra@gmail.com");
		
		Author author2 = new Author();
		author2.setName("Bert Bates");
		author2.setEmail("bbates@gmail.com");
		
		System.out.println(author1.toString());
		System.out.println(author2.toString());
		equalsTo(author1, author2);
		
		Book book1 = new Book("15471452");
		book1.setName("Head First Java");	
		Author[] arrAuthors1 = {author1, author2};
		book1.setAuthor(arrAuthors1);
		book1.setPublishing("O'REILY, 2nd Edition, 2013");
		System.out.println(book1.toString());
		
		
		Author author3 = new Author();
		author3.setName("Bruce Eckel");
		author3.setEmail("beckel@gmail.com");
		System.out.println(author3.toString());
		
		Book book2 = new Book("#12@254125");
		book2.setName("Thinking in Java");
		Author[] arrAuthors2 = {author3};
		book2.setAuthor(arrAuthors2);
		book2.setPublishing("President, MindView, Inc., 4th edition, 2014");
		System.out.println(book2.toString());
		
		equalsTo(book1, book2);
		
		
		Author author4 = new Author();
		author4.setName("Kathy Sierra");
		author4.setEmail("ksierra@gmail.com");
		equalsTo(author1, author4);
		
	}
	
	public static void equalsTo(Object ob1, Object ob2) {
		if (ob1.equals(ob2)) {
			System.out.println("objects are equal.");
		} else {
			System.out.println("objects aren't equal.");
		}
	}
}