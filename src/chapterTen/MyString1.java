package chapterTen;

public class MyString1 {
	
	
	public static void main(String[]args) {
		
		String s1 = "Inaaya";
		String s2 = "Inseya";
		char [] test = {'N','i','p','a'};
		
		String st = new String (test);
		
		System.out.println(" St = " + st);
		System.out.println(" Character of index 1 is: " + st.charAt(1));
		System.out.println(" Character of index 1 is: " + s1.charAt(1));
		System.out.println(" Character of index 1 is: " + s2.charAt(4));
		
		System.out.println();
		
		System.out.println(" The length of string: " + st.length());
		System.out.println(" The length of string: " + s1.length());
		System.out.println(" The length of string: " + s2.length());
		
		System.out.println();
		
		String subst = s1.substring(2,5);
		//System.out.println(" Substring is: " + subst);
		for (int i = 0; i < subst.length(); i++) {
			System.out.println(subst.charAt(i));	
	
		}
		
		
		String lower = s1.toLowerCase();
		System.out.println( lower);
		
		boolean tf = s1.equals(s2);
		
		System.out.println(tf);
		
		String va = s1.valueOf(s2);
		
		System.out.println(va);
		
		String cant = s1.concat(s2);
		System.out.println(cant);
		
		String rev = s1.replaceAll(s2,s1);
		
		System.out.println(rev);
		
		
	}

}
