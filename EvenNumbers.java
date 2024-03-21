class EvenNumbers {
	public static void main(String[] args) {
		// przedział <2, 100>
		
		int a;
		
		a = 2;
		if (a % 2 != 0)
			a += 1;
			
		while (a <= 100) {
			System.out.print(a + " ");
			a += 2;
		}
	}
}