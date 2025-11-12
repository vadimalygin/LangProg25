public interface IGenQ<T> {
	//Putting method
	void put(T element) throws QueueFullException;
	//Getting method
	T get() throws QueueEmptyException;
}
