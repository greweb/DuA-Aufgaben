
public class MyList <T> {
	private Integer size = 1;
	private ListItem <T>first = new ListItem<T>(null,0);
	private ListItem <T> last = first;
	public MyList  () {
		
	}
	public Integer size() {
		return size-1;
	}

	public void add( T x) {

		//System.out.print(" " + size);
		ListItem <T>next = new ListItem<T>( x,size);
		last.setNext(next);
		last = next;
		size = size + 1;;
	}
	

	public void remove(Integer index) {
		if (first.get(index).hasNext()) {
			
			ListItem<T> conectItem = first.get(index-1);
			ListItem<T> deleteItem = first.get(index);
			conectItem.setNext(deleteItem.getNext());
			deleteItem = null;
			size = size-1;
			first.getNext().setDelIndex(1);
			System.out.println("Item was Deleted at Index: "+(index));
			}
		else 
			System.out.println("Fehler: Index");
		
	}
	public ListItem get(Integer index) {
		index= index+1;
		return first.get(index);
	} 
	

}
