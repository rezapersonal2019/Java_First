package chapterEleven;

public class TestHuman {

	public static void main(String[] args) {
		Human obj = new Women();
		obj.dispaly();
	//	Women obj2 = (Women) obj;
		System.out.println();
		//obj2.displaywomen();
		
		if(obj instanceof Women) {
			Women obj2 = (Women) obj;
			
			obj2.displaywomen();	
				
				
				}		
				
				
				

	}

}
