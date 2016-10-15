package some.program;

class three {
	public static void main(String[] args) {

		int i = 2001;
		System.out.println("Leep years:");
		while (i <= 2016) {
			if (ifLeep(i)) {
				System.out.println(i);
			}

			i++;
		}

	}

	public static boolean ifLeep(int year) {

		return (year % 4 == 0 || year % 400 == 0 && year % 100 != 0);

	}
}
