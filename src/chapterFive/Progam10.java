package chapterFive;

public class Progam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int NUMBERS_PER_LINE = 10;
		int count = 0;
		
		for (int i = 100; i <= 1000; i++)
		{
			if (i % 5 == 0 && i % 6 == 0)
			{
				count ++;
				
				if ( count % NUMBERS_PER_LINE == 0)
					System.out.println(i);
				else
					System.out.println(i + " ");
			}
		}
	}

}
