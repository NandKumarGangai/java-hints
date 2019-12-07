class ArrayDemo {
	public static void main(String args[]) {
		int a[] = new int[4];
		
		for(int i=0; i<4; i++) {
			a[i] = i;
		}
		for (int element : a)
			System.out.println(element);
	}
}