class GenQueueDemo {
	public static void main(String args[]){
		//Creating an Integer queue
		Integer[] iArray = new Integer[4];
		GenQueue<Integer> iQ = new GenQueue<Integer>(iArray);
		Integer iVal;
		System.out.println("Integer 'iQ' operations");
		try{
			for(int i = 0; i < 6; i++){
				System.out.println("Adding " + i + " in queue 'iQ'");
				iQ.put(i);
			}
		}
		catch (QueueFullException exc){
			System.out.println(exc);
		}	

		System.out.println();
		
		try {
			for(int i = 0; i < 5; i++){
				System.out.print("Removing an Integer element from 'iQ': ");
				iVal = iQ.get();
				System.out.println(iVal);
			}
		}
		catch(QueueEmptyException exc){
			System.out.println(exc);
		}


		//Creating an String queue
		String[] sArray = new String[10];
		GenQueue<String> sQ = new GenQueue<String>(sArray);
		String sVal;
		System.out.println("\nString 'sQ' operations");
		try{
			for(int i = 0; i < 5; i++){
				System.out.println("Adding " + i + "'th element in queue 'sQ'");
				sQ.put("String" + i);
			}
		}
		catch (QueueFullException exc){
			System.out.println(exc);
		}	

		System.out.println();
		
		try {
			for(int i = 0; i < 5; i++){
				System.out.print("Removing a String element from 'sQ': ");
				sVal = sQ.get();
				System.out.println(sVal);
			}
		}
		catch(QueueEmptyException exc){
			System.out.println(exc);
		}
	}
}
