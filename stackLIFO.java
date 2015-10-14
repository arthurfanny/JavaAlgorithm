public class ResizingArrayStack<item> implements Iterable<item>{
	private Item[] a;
	private int N;

	public ResizingArrayStack(){
		a = (Item[] new Object[2]);
	}

	public boolean Empty(){
		return N == 0;
	}

	public int size(){
		return N;
	}

	public void resize(int capacity){
		assert capacity >= N;
		Item[] temp = (Item[]) new Object[capacity];
		for(int i = 0; i<N; i++){
			temp[i] = a[i];
		}
		a = temp;
	}

	public void push(Item item){
		resize(2N);
		a[N+1] = item;
	}

	public void pop(){
		if(a.Empty()){
			throw new NoSuchElementException("Stack Underflow");
		}

		Item item = a[N-1];
		N--;
		if(N>0&&N.size == a.length/4) resize(a.length/2);
		return item;
	}

	pubic Item peek(){
		if(isEmpty){
			throw new NoSuchElementException("Stack Underflow");
		return a[N-1];
	}

	public Iterator<item> iterator(){
		return new ReverseArrayIterator();
	}

	private class ReverseArrayIterator implements Iterator<item>{
		private int i;
		public ReverseArrayIterator(){
			i = N - 1;
		}
		public boolean hasNext(){
			return i>=0;
		}
		public void remove(){
			thorw new UnsupportedOperationException():
		}
		
		public Item next(){
			if (!hasNext()) throw new NoSuchElementException():
			return a[i--];
		}
	}

}


	
