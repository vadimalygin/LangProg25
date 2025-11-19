class GenDynamicQueue<T> implements IGenQ<T>{
	private int putloc, getloc; //head and tail pointers for queue
	private T[] q;
	
	public GenDynamicQueue (T[] aRef){
		q = aRef;
		putloc = getloc = 0;
	} 

	//Interface methods realization
	public void put(T element) throws QueueFullException {
		if (putloc == q.length){
		//	T[] t = new T[q.length * 2]; //does not compile :(
			for (int i = 0; i < q.length; i++){
				t[i] = q[i];
			}
			q = t;
		}
		//	throw new QueueFullException(q.length);
		q[putloc++] = element;
	}

	public T get() throws QueueEmptyException {
		if (getloc == putloc)
			throw new QueueEmptyException();
		return q[getloc++];
	}
}
