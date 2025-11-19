class GenCircleQueue<T> implements IGenQ<T> {
	private int putloc, getloc; //head and tail pointers for queue
	private T[] q;
	
	public GenCircleQueue (T[] aRef){
		q = aRef;
		putloc = getloc = 0;
	} 

	//Interface methods realization
	public void put(T element) throws QueueFullException {
		if (putloc+1 == getloc | ((putloc==q.length-1) & (getloc == 0)))
			throw new QueueFullException(q.length);
		q[putloc++] = element;
		if (putloc == q.length)
			putloc = 0;
	}

	public T get() throws QueueEmptyException {
		if (getloc == putloc)
			throw new QueueEmptyException();
		if (getloc == q.length)
			getloc = 0;
		return q[getloc++];
	}
}
