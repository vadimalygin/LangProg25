class GenCircleQueueDemo {
	public static void main(String args[]){
		//Creating an Integer queue
		Integer[] iArray = new Integer[5];
		GenCircleQueue<Integer> iCQ = new GenCircleQueue<Integer>(iArray);
		Integer iVal;
		System.out.println("Integer 'iCQ' operations");
		try{
			for(int i = 0; i < 4; i++){
				System.out.println("Adding " + i + " in queue 'iCQ'");
				iCQ.put(i);
			}
		}
		catch (QueueFullException exc){
			System.out.println(exc);
		}	

		System.out.println();
		
		try {
			for(int i = 0; i < 4; i++){
				System.out.print("Removing an Integer element from 'iCQ': ");
				iVal = iCQ.get();
				System.out.println(iVal);
			}
		}
		catch(QueueEmptyException exc){
			System.out.println(exc);
		}

		try{
			for(int i = 0+3; i < 4+3; i++){
				System.out.println("Adding " + i + " in queue 'iCQ' again");
				iCQ.put(i);
			}
		}
		catch (Throwable exc){
			System.out.println(exc);
		}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	}
}
