public class Sortierungsbeispiel {
	public static void main(String[] args) {
		Sorter sort = new Sorter();
		int[] a = { 15, 3, 8, 9, 222,20, 70, 4, 6 };
		a = sort.mergesort(a);
		System.out.print("a: ");
		for (int i = 0; i < a.length; ++i)
			System.out.print(a[i] + " ");
		System.out.println();
	}
}
