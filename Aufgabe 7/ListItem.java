
public class ListItem <T>{
	private Integer index;
	private T value;
	private ListItem <T>nextItem = null;

	public ListItem(T x, Integer index) {
		value = x;
		this.index = index;
		// TODO Auto-generated constructor stub
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public ListItem get(Integer i) {
		if (index < i) {

			//System.out.println(index);
			return nextItem.get(i);
		} else if (index == i) {
			return this;
		} else
			return null;
	}

	public void setDelIndex(Integer index) {
		this.index = index;
		//System.out.println(index +"+"+ value);
		if (hasNext()) {
			Integer sendindex = index+1;
			nextItem.setDelIndex(sendindex);
		}else 
			return;
	}

	// Next funktions
	public void setNext(ListItem next) {
		nextItem = next;
	}

	public ListItem getNext() {
		return nextItem;
	}

	public boolean hasNext() {
		if (nextItem != null) {
			return true;
		} else
			return false;
	}

}
