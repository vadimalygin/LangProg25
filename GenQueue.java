class GenQueue<T> implements IGenQ<T> {
	private int putloc, getloc; //head and tail pointers for queue
	private T[] q;
	
	public GenQueue (T[] aRef){
		q = aRef;
		putloc = getloc = 0;
	} 

	//Interface methods realization
	public void put(T element) throws QueueFullException {
		if (putloc == q.length)
			throw new QueueFullException(q.length);
		q[putloc++] = element;
	}

	public T get() throws QueueEmptyException {
		if (getloc == putloc)
			throw new QueueEmptyException();
		return q[getloc++];
	}
}
