class PascalsTriangle {	
	private int[][] triangle;
	
	PascalsTriangle(int height) {		
		triangle = new int [height][];
		createTriangle();
	}
	
	private void createTriangle() {
		triangle[0] = new int[] {1};
		if (triangle.length > 1) {
			triangle[1] = new int[] {1, 1};
			for (int i = 2; i < triangle.length; i++) {
				triangle[i] = new int[i+1];
				triangle[i][0] = 1;
				for (int j = 1; j < i; j++) {
					triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
				}
				triangle[i][i] = 1;
			}
		}
	}
	
	public void print() {
		for (int i = 0; i < triangle.length; i++) {
			for (int j = 0; j < triangle[i].length; j++) {
				System.out.print(triangle[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	public void print(String filter) {	
		for (int i = 0; i < triangle.length; i++) {
			for (int j = 0; j < triangle[i].length; j++) {
				System.out.print(changeSymbol(triangle[i][j], filter.toUpperCase()) + " ");
			}
			System.out.println("");
		}
	}
	
	private String changeSymbol(int symbol, String filter) {
		String result = Integer.toString(symbol);
		if (filter.equals("EVEN")) {
			if (symbol % 2 == 0) return "..";
		} else if (filter.equals("ODD")) {
			if (symbol % 2 == 1) return "..";
		}	
		return result;
	}
}