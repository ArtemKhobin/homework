package some.program;

class four {
	public static void main(String[] args) {

		infinity();
	}

	public static void infinity() {
		int i = 1;
		do {
			System.out.println("It seems that I'm here forever");
			i++;
			if (i > 5)
				break;
		} while (true);

	}

}
