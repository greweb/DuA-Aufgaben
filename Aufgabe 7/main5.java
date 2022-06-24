
public class main5 {
	public static void main(String[] args) {
		MyList <Integer> l = new MyList<Integer>(); // Ihre Implementierung der Liste
		for (int i = 1; i <= 10; ++i) {
			l.add(8 * i);

			System.out.print(" " +(i*8));
		}
		System.out.println();
		//System.out.println(l.get(3).getValue());
		l.remove(3);

		//System.out.println(l.get(3).getValue());
		//System.out.println(l.size());

		//System.out.print(" " + l.get(5).getValue());
		
		for (int i=l.size()-1; i>=0; --i)
			System.out.print(" " + l.get(i).getValue());
		System.out.println();
	}
}
