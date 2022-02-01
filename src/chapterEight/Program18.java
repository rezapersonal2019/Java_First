package chapterEight;

public class Program18 {

	public static void main(String[] args) {

        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};

        System.out.println("Before shuffle");
        displayMatrix(m);
        System.out.println("After shuffle");
        shuffle(m);
        displayMatrix(m);


    }

    public static void displayMatrix(int[][] n) {

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.print(n[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void shuffle(int[][] x) {
    	
    	int r1;   // random raw index;
    	
    	for (int i = 0; i<x.length; i++) {
    		for(int j = 0; j<x[i].length; j++) {
    			do {
    				r1 = (int)(Math.random() * x.length);
    			} while (r1 == i);
    			int[] temp = x[i];
    			x[i] = x[r1];
    			x[r1] = temp;
    		}
    	}
    }
   	
}
