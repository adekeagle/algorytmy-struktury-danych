class OddNumbers {
	public static void main(String[] args) {
		// odd numbers range <2, 100>
		int a = 2;
		
		if (a % 2 == 0)
			a += 1;
			
		while(a <= 100) {
			System.out.print(a + " ");
			a += 2;
		}
	}
}