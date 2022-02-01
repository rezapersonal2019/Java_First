package chapterTen;

public class MyStringBuilder1 {

	public static void main(String[] args) {
	
		
		
		StringBuilder st = new StringBuilder("Test ");
		System.out.println(st);
		
		st.append( 101);
		System.out.println(st);
		
		System.out.println(st.length());

		System.out.println(st.charAt(2));
		System.out.println(st.delete(5, 8));
		
		
		
		System.out.println("lower case: " + st.toString() );
		

	}

}
