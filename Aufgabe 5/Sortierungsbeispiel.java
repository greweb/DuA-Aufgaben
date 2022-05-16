public class Sortierungsbeispiel {
	public static void main(String[] args) {
		Sorter sort = new Sorter();
		Comparable[] a = { 15, 3, 8, 9, 222,20, 70, 4, 6 };
		
		a = sort.mergesort(a);
		System.out.print("a: ");
		for (int i = 0; i < a.length; ++i)
			System.out.print(a[i] + " ");
		System.out.println();
		
		Comparable[] brueche = {new Bruch(5,2), new Bruch(10,5)};
		brueche = sort.mergesort(brueche);
		System.out.print("a: ");
		for (int i = 0; i < brueche.length; ++i)
			System.out.print(((Bruch) brueche[i]).get() + " ");
		System.out.println();
	}
}
