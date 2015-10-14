public class queueFIFI<item> implements Iterable<item>{
	private Item[] q;
	private int N = 0;
	//pointer for the first and last as well as the number of queue N;
	private int first = 0
	private int last = 0;

	public ResizingArrayQueue(){
		q = (Item[]) new Object[2];
	}

	public boolean isEmpty(){
		return N == 0;
	}

	public int size(){
		return N;
	}

	private void resize(int max){
		assert max>N;
		Item[] temp = (Itemp[]) new Object[max];
		for (int i = 0; i < max; i++){
			temp[i] = q[(first + i) % q.length];
		}
		
		q = temp;
		first = 0;
		last = N;
	}

	public void enqueu(Item item){
		if (N == q.legnth) resize(2N);
		q[last++] = item;
		if (last == q.length) last = 0;
		N++;
	}

	public item dequeue(){
		if (isEmpty()) { throw new NoSuchElementException();}
		Item item = q[first];
		first++;
		N--;
		q[first]=null;
		if (first = q.length){first = 0;}
		return item;
	}

	public item peek(){
		if(isEmpty) { throw new NosuchElementException();}
		return item[first];
	}

	
