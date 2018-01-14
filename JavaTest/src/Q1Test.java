
public class Q1Test {
	int[] a = { 5, 9, 2, 0, 6 };

	public Q1Test() {
		
		System.out.println("Initial array");
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println("\n\n");
	}
	
	public static void main(String[] args) {
		Q1Test q1 = new Q1Test();
		
		System.out.println("Index of " + 6 + ": " + q1.findIndex(6));
		System.out.println("\n");
		
		System.out.println("Sorted array");
		q1.sort();
		
		System.out.println("\n\n");
		q1.addAll();
	}

	void sort() {
		int temp = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
	
	void addAll() {
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		
		System.out.println("Sum of all elements = " + sum);
	}
	
	int findIndex(int element) {
		for (int i = 0; i < a.length; i++) {
			if(a[i] == element) return i;
		}
		return -1;
	}
}